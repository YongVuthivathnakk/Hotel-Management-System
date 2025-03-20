package UserFolder;

import java.util.HashMap;

public class UserInfo {

    HashMap<String,String> loginInfo = new HashMap<String,String>();

    public UserInfo(){
        loginInfo.put("Nakk", "12345");
    }


    public HashMap getUserInfo() {
        return loginInfo;
    }
}
