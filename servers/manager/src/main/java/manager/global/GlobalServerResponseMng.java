package manager.global;

import core.network.IResponseHandlerManager;
import manager.connectionManager.ResponseRegisterReturn;
import protocol.msgId.Id;
import protocol.server.register.ServerRegister;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: Boiling
 * Date: 2018-05-30
 * Time: 14:37
 */

public class GlobalServerResponseMng implements IResponseHandlerManager {
    public GlobalServerResponseMng() {
        register();
    }

    @Override
    public void register() {
       register(Id.getInst().getMessageId(ServerRegister.MSG_RES_Server_Register.class), ResponseRegisterReturn.class);
    }
}
