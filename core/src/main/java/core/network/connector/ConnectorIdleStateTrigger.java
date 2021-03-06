package core.network.connector;

import core.base.common.AbstractSession;
import core.base.common.AttributeUtil;
import core.base.common.SessionKey;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Boiling
 * Date: 2018-06-04
 * Time: 16:29
 */
@Slf4j
@ChannelHandler.Sharable
public class ConnectorIdleStateTrigger extends ChannelInboundHandlerAdapter {
    //    private static final Logger logger = LoggerFactory.getLogger(ConnectorIdleStateTrigger.class);
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent) {
            IdleState state = ((IdleStateEvent) evt).state();
            if (state == IdleState.WRITER_IDLE) {
                log.info("Send heartbeats");
                AbstractSession session = AttributeUtil.get(ctx.channel(), SessionKey.SESSION);
                if (session == null) {
                    log.error("[没有找到有效会话]");
                } else {
                    session.sendHeartBeat(); //发送心跳包
                }
            }
        } else {
            super.userEventTriggered(ctx, evt);
        }
    }
}