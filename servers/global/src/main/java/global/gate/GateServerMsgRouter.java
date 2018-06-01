package global.gate;
import core.network.INetworkConsumer;
import core.network.codec.Packet;
import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Boiling
 * Date: 2018-05-30
 * Time: 9:57
 */
@Slf4j
public class GateServerMsgRouter implements INetworkConsumer {
    @Override
    public void consume(Packet packet, Channel channel) {
        //TODO:boil 单逻辑线程的话，这里要做的是将消息加入到消息队列
        log.info("msg go to exec");
    }
}