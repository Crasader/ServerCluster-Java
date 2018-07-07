package global.manager;

import core.base.common.AbstractSession;
import core.base.model.ServerTag;
import core.base.model.ServerType;
import io.netty.channel.Channel;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Boiling
 * Date: 2018-05-31
 * Time: 16:19
 */

public class ManagerServerSession extends AbstractSession {
    public ManagerServerSession(Channel channel) {
        super(channel);
        ServerTag tag =new ServerTag();
        tag.setTag(ServerType.Manager,0,0);
        setTag(tag);
    }

    @Override
    public void OnConnected() {

    }

    @Override
    public void sendHeartBeat() {

    }
}
