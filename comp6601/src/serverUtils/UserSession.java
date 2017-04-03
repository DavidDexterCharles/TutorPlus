package comp6601.src.serverUtils;

import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class UserSession {

    private HashMap<String,String> userSessionIdList = new HashMap<>();

    public UserSession(){

        this.userSessionIdList = new HashMap<>();
    }

    public void addUserToSessionList(String username, String usersessionId){

        this.userSessionIdList.put(username,usersessionId);
    }

    public void removeUserFromSessionList (String username){

        this.userSessionIdList.remove(username);


    }

    public String getUserSessionId(String username){

        return this.userSessionIdList.get(username);
    }


}
