 //------------------------------------------------------------------------------
 // <auto-generated>
 //     This code was generated by a tool.(The author is Boiling)
 //     Changes to this file may cause incorrect behavior and will be lost if the code is regenerated.
 // </auto-generated>
 //------------------------------------------------------------------------------
package Protocol.MsgId;
import java.util.HashMap;
import com.google.protobuf.MessageLite;
public class Id{
     private static final Id inst = new Id();
     private HashMap<Class<? extends MessageLite>, Integer> clazzIdMap = new HashMap<Class<? extends MessageLite>, Integer>();
     public static final Id getInst(){
          return inst;
     }
     public int getMessageId(Class<?> clazz){
          return clazzIdMap.get(clazz);
     }
     public int SetMessage(Class<? extends MessageLite> msgClass, int messageId){
          return clazzIdMap.put(msgClass, messageId);
     }
}
