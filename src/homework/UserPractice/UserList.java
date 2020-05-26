package UserPractice;

import java.util.HashMap;
import java.util.Map;

public class UserList extends User{

    private Map<String,String> userList = new HashMap<>();

    public Map<String, String> getUserList() {
        return userList;
    }

    public void setUserList(Map<String, String> userList) {
        this.userList = userList;
    }
}
