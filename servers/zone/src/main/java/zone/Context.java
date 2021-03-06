package zone;

import configuration.dataManager.Data;
import configuration.dataManager.DataList;
import configuration.dataManager.DataListManager;
import core.base.model.ServerTag;
import core.base.model.ServerType;
import core.base.serviceframe.AbstractServiceFrame;
import pathExt.PathManager;
import protocol.gate.zone.G2ZIdGenerater;
import protocol.global.zone.GM2ZIdGenerater;
import protocol.manager.zone.M2ZIdGenerater;
import protocol.relation.zone.R2ZIdGenerater;
import protocol.server.register.ServerRegister;
import protocol.server.register.ServerRegisterIdGenerater;
import protocol.zone.gate.Z2GIdGenerater;
import protocol.zone.global.Z2GMIdGenerater;
import protocol.zone.manager.Z2MIdGenerater;
import protocol.zone.relation.Z2RIdGenerater;
import util.FileUtil;
import zone.connectionManager.ConnectionManager;
import zone.gate.GateServerSessionMng;
import zone.global.GlobalServerSessionMng;
import zone.manager.ManagerServerSessionMng;
import zone.relation.RelationServerSessionMng;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Boiling
 * Date: 2018-05-30
 * Time: 14:59
 */

public class Context extends AbstractServiceFrame {
    public static ConnectionManager connectManager;

    @Override
    public void init(String[] args) {
        super.init(args);

        ServerType serverType = ServerType.Zone;
        tag = new ServerTag();
        if (args.length>=2){
            Integer areaId = Integer.parseInt(args[0]);
            Integer subId = Integer.parseInt(args[1]);
            tag.setTag(serverType,areaId,subId);
        }

        GlobalServerSessionMng.getInstance().init();
        GateServerSessionMng.getInstance().init();
        ManagerServerSessionMng.getInstance().init();
        RelationServerSessionMng.getInstance().init();

        connectManager = new ConnectionManager();
        initConnectManager(connectManager);
        initMainThread("ZoneDriverThread");
    }

    @Override
    public void intiProtocol() {
        ServerRegisterIdGenerater.GenerateId();
        GM2ZIdGenerater.GenerateId();
        Z2GMIdGenerater.GenerateId();
        M2ZIdGenerater.GenerateId();
        Z2MIdGenerater.GenerateId();
        G2ZIdGenerater.GenerateId();
        Z2GIdGenerater.GenerateId();
        R2ZIdGenerater.GenerateId();
        Z2RIdGenerater.GenerateId();
    }

    @Override
    public void initPath() {
        PathManager.getInstance().initPath();
    }

    @Override
    public void initLibData() {

    }

    @Override
    public void initXmlData() {
        List<File> fileList = new ArrayList<>();
        FileUtil.findFiles(PathManager.getInstance().getXmlPath(),"*xml",fileList);
        for (Object obj :fileList){
            File f = (File) obj;
//            System.out.println("-----"+f.toString());
            DataListManager.getInstance().Parse(f.toString());
        }
    }

    @Override
    public void initLogger() {

    }

    @Override
    public void initOpenServerTime() {

    }

    @Override
    public void updateXml() {

    }

    @Override
    public void initService() {

    }

    @Override
    public void updateService(long dt) {

    }

    public static List<ServerRegister.LISTEN_INFO> getListenInfoList(){
        List<ServerRegister.LISTEN_INFO> listen_info_list = new ArrayList<>();
        DataList dateList = DataListManager.getInstance().getDataList("ServerConfig");
        Data serviceData =dateList.getData(tag.toString());

        int gatePort = serviceData.getInteger("gatePort");

        ServerRegister.LISTEN_INFO.Builder gateInfo = ServerRegister.LISTEN_INFO.newBuilder();
        gateInfo.setServerType(ServerType.Gate.ordinal());
        gateInfo.setPort(gatePort);
        listen_info_list.add(gateInfo.build());

        return listen_info_list;
    }
}
