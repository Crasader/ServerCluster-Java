 //------------------------------------------------------------------------------
 // <auto-generated>
 //     This code was generated by a tool.(The author is Boiling)
 //     Changes to this file may cause incorrect behavior and will be lost if the code is regenerated.
 // </auto-generated>
 //------------------------------------------------------------------------------
package protocol.manager.manager;
import protocol.msgId.Id;
public class M2MIdGenerater{
     public static void GenerateId(){
          Id.getInst().SetMessage(protocol.manager.manager.M2M.MSG_M2M_HEARTBEAT.class, 0x330001);
     }
}
