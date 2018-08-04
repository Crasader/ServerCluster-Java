package manager.gate;

import core.network.IResponseHandlerManager;
import lombok.extern.slf4j.Slf4j;
import manager.connectionManager.ResponseRegister;
import manager.gate.response.ResponseMaxUid;
import manager.relation.response.ResponseHeartBeat;
import protocol.gate.manager.G2M;
import protocol.msgId.Id;
import protocol.server.register.ServerRegister;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Boiling
 * Date: 2018-05-29
 * Time: 16:26
 */
@Slf4j
public class GateServerResponseMng implements IResponseHandlerManager {

    GateServerResponseMng() {
        register();
    }

    @Override
    public void register() {
        register(Id.getInst().getMessageId(ServerRegister.MSG_Server_Register.class), ResponseRegister.class);
        register(Id.getInst().getMessageId(G2M.MSG_G2M_HEARTBEAT.class), ResponseHeartBeat.class);

        //创角
        register(Id.getInst().getMessageId(G2M.MSG_G2M_MAX_UID.class), ResponseMaxUid.class);
    }
}