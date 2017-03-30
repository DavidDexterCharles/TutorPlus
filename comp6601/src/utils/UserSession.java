package comp6601.src.utils;

import comp6601.src.server.User;

import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class UserSession {

    private HashMap<String,String> userSessionList = new HashMap<>();

    public UserSession(){

        this.userSessionList = new HashMap<>();
    }

    public void addUserToSessionList(String username){

        this.userSessionList.put(username,username);
    }


}
