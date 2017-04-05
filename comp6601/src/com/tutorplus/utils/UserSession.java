package com.tutorplus.utils;

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

        this.userSessionIdList.put(usersessionId,username);
    }

    public void removeUserFromSessionList (String sessionId){

        this.userSessionIdList.remove(sessionId);


    }

    public String getUsername(String userSessionId){

        return this.userSessionIdList.get(userSessionId);
    }


}
