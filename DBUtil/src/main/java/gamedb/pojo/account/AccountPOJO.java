package gamedb.pojo.account;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class AccountPOJO {
    String tableName;
    int uid=0;
    String username="default_user";
    String password="";
    Timestamp createTime;

    String deviceId="default_device";
    String registerId="";
}
