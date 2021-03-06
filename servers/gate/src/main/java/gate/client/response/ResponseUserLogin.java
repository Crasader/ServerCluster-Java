package gate.client.response;

import com.google.protobuf.InvalidProtocolBufferException;
import constant.ErrorCode;
import constant.RegisterResult;
import core.base.common.AbstractSession;
import core.base.model.ClientTag;
import core.base.sequence.IResponseHandler;
import core.network.codec.Packet;
import gamedb.pojo.account.AccountPOJO;
import gate.Context;
import gate.GateService;
import gate.client.ClientLoginMng;
import gate.client.ClientSession;
import gate.client.ClientSessionMng;
import lombok.extern.slf4j.Slf4j;
import protocol.client.Client.*;

@Slf4j
public class ResponseUserLogin implements IResponseHandler {
    @Override
    public void onResponse(Packet packet, AbstractSession session) throws InvalidProtocolBufferException {
        ClientSession clientSession = (ClientSession) session;

        MSG_CG_USER_LOGIN msg = MSG_CG_USER_LOGIN.parseFrom(packet.getMsg());
        String username = msg.getUsername();
        Integer areaId = msg.getAreaId();
        if (areaId != Context.tag.getAreaId()){
            areaId =Context.tag.getAreaId();
        }

        MSG_GC_USER_LOGIN.Builder response = MSG_GC_USER_LOGIN.newBuilder();
        response.setUsername(username);

        if (!GateService.context.isOpened()) {
            response.setResult(ErrorCode.ServerNotOpen.ordinal());
            ClientLoginMng.getInstance().sendLoginResponse(clientSession, response);
            return;
        }

        log.info("account {} request to login ", username);
        //到这里的账号应该是合法的,不去验证账号
//        //token检查
//        if (!AuthorizationMng.getInstance().checkToken(username, msg.getToken())) {
//            log.warn("account {} got en authorize fail:wrong token {}", username, msg.getToken());
//            return;
//        }
        //TODO:BOIL token 什么时候失效？？


        //TODO:BOIL 白名单，版本等判断

        ((ClientTag) clientSession.getTag()).setTag(username, areaId);
        //登入gate
        RegisterResult registerResult = ClientSessionMng.getInstance().register(session);
        switch (registerResult) {
            case ALREADY_REGISTER:
                //已经注册了
                return;
            case FAIL:
                response.setResult(ErrorCode.FAIL.ordinal());
                //注册失败
                session.sendMessage(response.build());
                return;
            case REPEATED_REGISTER:
                //TODO:BOIL 顶号可以在两个地方做逻辑
                //TODO:BOIL 1 在这里，账号登录时候，通知当前账号已经登入，做顶号操作。注：必须保证同账号同区只可登录一次。（顶掉老账号 或者 两个都断开）
                //TODO:BOIL 2 可以在enter world的时候根据角色UID相同去做顶号逻辑。
                log.info("account {} repeated login :repeat channel {} (cur channel {})",
                        username, ClientSessionMng.getInstance().getRegisterSession(clientSession.getTag()).getChannel().toString(), clientSession.getChannel().toString());

//                response.setResult(ErrorCode.FAIL.ordinal());
//
//                AbstractSession oldSession = ClientSessionMng.getInstance().getRegisterSession(session.getTag());
//                oldSession.sendMessage(response.build());
//                session.sendMessage(response.build());
                return;
            case SUCCESS:
                response.setResult(ErrorCode.SUCCESS.ordinal());
                //正常登陆流程
                AccountPOJO accountPOJO = new AccountPOJO();
                accountPOJO.setUsername(msg.getUsername());
                accountPOJO.setPassword(msg.getPassword());
                accountPOJO.setDeviceId(msg.getDeviceId());

//                accountPOJO.setRegisterId(msg.getRegisterId());
//                accountPOJO.setChannelName(msg.getChannelName());

                clientSession.setAccountPOJO(accountPOJO);
                //所有验证通过，账号登录
                ClientLoginMng.getInstance().login(clientSession);
                break;
        }

    }
}
