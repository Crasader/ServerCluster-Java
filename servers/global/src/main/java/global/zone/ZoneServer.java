package global.zone;

import configuration.dataManager.Data;
import configuration.dataManager.DataList;
import configuration.dataManager.DataListManager;
import constant.SystemConst;
import core.base.serviceframe.IService;
import core.network.MsgRouter;
import core.network.NetworkListener;
import core.network.ServiceState;
import core.network.server.ServerNetworkService;
import core.network.server.ServerNetworkServiceBuilder;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Boiling
 * Date: 2018-05-30
 * Time: 9:47
 */

public class ZoneServer implements IService {
    private ServerNetworkService netWork;
    private ServiceState state;
    private Data serviceData;
    private int listenPort;

    public ZoneServer() throws Exception {
        init(null);

        int acceptorGroupCount = 1;
        int IOGroupCount = SystemConst.AVAILABLE_PROCESSORS;

        ZoneServerResponseMng responseMng = new ZoneServerResponseMng();
        responseMng.register();

        ServerNetworkServiceBuilder builder = new ServerNetworkServiceBuilder();
        builder.setAcceptorGroupCount(acceptorGroupCount);
        builder.setIOGroupCount(IOGroupCount);
        builder.setPort(listenPort);
        builder.setConsumer( new MsgRouter());
        builder.setListener(new NetworkListener(ZoneServerSessionMng.getInstance(), responseMng));

        // 创建网络服务
        netWork = (ServerNetworkService) builder.createService();
    }

    @Override
    public void init(String[] args) {
        DataList dateList = DataListManager.getInstance().getDataList("ServerConfig");
        serviceData =dateList.getData("GlobalServer");
        listenPort = serviceData.getInteger("zonePort");
    }

    @Override
    public void update() {
        ZoneServerSessionMng.getInstance().update();
    }

    @Override
    public void start() {
        netWork.start();
        if (netWork.isOpened()) {
            state = ServiceState.RUNNING;
        }
    }

    @Override
    public void stop() {
        netWork.stop();
        state = ServiceState.STOPPED;
    }

    @Override
    public ServiceState getState() {
        return state;
    }
}
