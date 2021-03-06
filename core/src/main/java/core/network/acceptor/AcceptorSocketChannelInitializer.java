package core.network.acceptor;

import core.network.IChannelHandlerHolder;
import core.network.NetWorkConst;
import core.network.codec.*;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * Copyright © 2018 四月
 * Boil blood. All rights reserved.
 *
 * Project: ServerCluster-Java
 * Package: core.network.acceptor
 * Description: ${todo}
 * author: Boiling
 * date: 2018/4/22 0022 15:28
 * version: V1.0
 */

@Slf4j
public class AcceptorSocketChannelInitializer extends ChannelInitializer<SocketChannel> implements IChannelHandlerHolder {
    //acceptor的trigger     //因为我们在client端设置了每隔30s会发送一个心跳包过来，如果60s都没有收到心跳，则说明链路发生了问题
    private final AcceptorIdleStateTrigger idleStateTrigger = new AcceptorIdleStateTrigger();
    //封包
    private final PacketWriter writer = new PacketWriter();
    //message的编码器
//    private final PacketEncoder encoder = new PacketEncoder();
    //
    private AcceptorMessageExecutor messageExecutor;
    //
    private ChannelHandler[] handlers;

//    //Ack的编码器
//    private final AcknowledgeEncoder ackEncoder = new AcknowledgeEncoder();
//    //连接管理
//    private final NettyConnectManageHandler nettyConnectManageHandler = new NettyConnectManageHandler(this);
//    //SimpleChannelInboundHandler类型的handler只处理@{link Message}类型的数据
//    private final AcceptorMessageHandler messageHandler = new AcceptorMessageHandler();

    AcceptorSocketChannelInitializer( AcceptorNetworkServiceBuilder builder) {
        messageExecutor = new AcceptorMessageExecutor(builder);
    }

    @Override
    protected void initChannel(SocketChannel channel) throws Exception {
        ChannelPipeline pip = channel.pipeline();
        handlers = new ChannelHandler[]{
                //每隔readerIdleTime秒的时间内如果没有接受到任何的read事件的话，则会触发userEventTriggered事件，并指定IdleState的类型为READER_IDLE
                new IdleStateHandler(NetWorkConst.READER_IDLE_TIME, 0, 0, TimeUnit.SECONDS),
                idleStateTrigger,
                writer,
//                encoder,
                //拆包
                new PacketReader(),
                //message的解码器
                new PacketDecoder(),
                messageExecutor
        };
        pip.addLast(handlers);
//        log.info("------------->initChannel");
    }

    @Override
    public ChannelHandler[] handlers() {
        return handlers;
    }
}
