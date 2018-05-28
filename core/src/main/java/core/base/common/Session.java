package core.base.common;

import io.netty.channel.Channel;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.net.InetSocketAddress;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: FReedom
 * Date: 2018-04-23
 * Time: 14:30
 */
@Slf4j
@Data
public class Session {

    private Channel channel;

    private boolean isRegistered;

    private int sendDelay;

    private volatile boolean offline = false;

    public Session(Channel channel) {
        this.channel = channel;
        isRegistered = false;
    }
//
//    public Channel getChannel() {
//        return channel;
//    }
//
//    public void setChannel(Channel channel) {
//        this.channel = channel;
//    }

    public String getIP() {
        if (channel == null) {
            return "";
        }
        InetSocketAddress address = (InetSocketAddress) channel.remoteAddress();
        if (address == null) {
            return "";
        }
        return address.getAddress().getHostAddress();
    }

    public void clearAttribute() {
        if (channel == null) {
            return;
        }
//      AttributeUtil.set(channel, ISessionAttributeKey.UID, null);
    }

    public void close() {
        if (channel == null) {
            return;
        }
        clearAttribute();
        try {
            if (channel.isActive() || channel.isOpen()) {
                channel.close().sync();
            }
        } catch (InterruptedException e) {
            log.error("", e);
        }
    }

//    public void closeByHttp() {
//        if (channel == null) {
//            return;
//        }
//        try {
//            channel.close().sync();
//        } catch (InterruptedException e) {
//            log.error("", e);
//        }
//    }

    public void sendMessage(Object msg) {
        channel.writeAndFlush(msg);
    }
}