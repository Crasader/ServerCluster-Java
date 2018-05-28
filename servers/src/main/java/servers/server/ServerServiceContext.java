package servers.server;

import lombok.extern.slf4j.Slf4j;
import servers.server.gameserver.GameServer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: FReedom
 * Date: 2018-04-22
 * Time: 15:13
 */

@Slf4j
public class ServerServiceContext {

    private static ServerOption option;
    private static int serverId;
    private static GameServer gameServer;
    private static boolean closed;

    public static void init(ServerOption option) {
        ServerServiceContext.option = option;
//        serverId = option.getServerId();
//        serverType = option.getServerType();
//        openTime = option.getOpenTime();
//        openDayZeroTime = TimeUtil.getZeroClockTime(openTime.getTime());
//
//        LOGGER.info("开服时间：{}", openTime);int
//        LOGGER.info("开服当天凌晨0点时间戳：{}", openDayZeroTime);
//        LOGGER.info("开服距离开服当天凌晨：{}", (openTime.getTime() - openDayZeroTime));
//
//        combineTime = option.getCombineTime();
//        if (combineTime != null) {
//            combineDayZeroTime = TimeUtil.getZeroClockTime(option.getCombineTime().getTime());
//            if (combineTime.getTime() <= openTime.getTime()) {
//                throw new RuntimeException("开服与合服时间配置错误，合服时间早于或等于开服时间....");
//            }
//            combined = true;
//
//            LOGGER.info("合服时间：{}", combineTime);
//            LOGGER.info("合服当天凌晨0点时间戳：{}", combineDayZeroTime);
//            LOGGER.info("合服距离开服当天凌晨：{}", (combineTime.getTime() - combineDayZeroTime));
//        }

    }

    public static GameServer createGameServer() {
        try {
            gameServer = new GameServer(option);
            return gameServer;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

//    public static BackServer createBackServer() {
//        try {
//            backServer = new BackServer(option);
//            return backServer;
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static boolean isStarted() {
        return gameServer != null && gameServer.isOpen();
    }

//    public static int getExpDouble() {
//        return expDouble;
//    }
//
//    public static void setExpDouble(int expDouble) {
//        GameContext.expDouble = expDouble;
//    }
//
//    public static Date getOpenTime() {
//        return openTime;
//    }
//
//    public static void setOpenTime(Date openTime) {
//        GameContext.openTime = openTime;
//    }
//
//    public static long getOpenDayZeroTime() {
//        return openDayZeroTime;
//    }
//
//    public static void setOpenDayZeroTime(long openDayZeroTime) {
//        GameContext.openDayZeroTime = openDayZeroTime;
//    }
//
//    public static Date getCombineTime() {
//        return combineTime;
//    }
//
//    public static void setCombineTime(Date combineTime) {
//        GameContext.combineTime = combineTime;
//    }
//
//    public static long getCombineDayZeroTime() {
//        return combineDayZeroTime;
//    }
//
//    public static void setCombineDayZeroTime(long combineDayZeroTime) {
//        GameContext.combineDayZeroTime = combineDayZeroTime;
//    }

//    public static boolean isCombined() {
//        return combined;
//    }

    public static ServerOption getOption() {
        return option;
    }

    public static GameServer getGameServer() {
        return gameServer;
    }

//    public static BackServer getBackServer(){
//        return backServer;
//    }

    public static int getServerId() {
        return serverId;
    }

//    public static int getServerType() {
//        return serverType;
//    }

//    public static boolean isServerCloseLogicExecuted() {
//        return serverCloseLogicExecuted;
//    }

//    public static void setServerCloseLogicExecuted(boolean serverCloseLogicExecuted) {
//        GameContext.serverCloseLogicExecuted = serverCloseLogicExecuted;
//    }

    public static boolean isClosed() {
        return closed;
    }

    public static void setClosed(boolean closed) {
        ServerServiceContext.closed = closed;
    }
}
