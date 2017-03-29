package comp6601.src.utils;

import comp6601.src.server.Server;
import comp6601.src.server.User;
import comp6601.src.server.UserAccountType;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class UserFactory {

    public User getUser(){

        return new User();

    }

    /**
     * Gets a speciifed tutor plus user
     * @param username
     * @return A tutor plus user object
     */
    public User getUser(String username){

        HashMap<String,Object>  userData = Server.dbHelper.getUserData(username);

        System.out.println(userData.toString());
        if (userData.size() > 0) {
            int userId = (int) userData.get("userId");
            String firstName = (String) userData.get("firstName");
            String lastName = (String) userData.get("lastName");
            String accountName = (String) userData.get("accountName");
            String email = (String) userData.get("email");
            String password = (String) userData.get("password");
            ArrayList<String> privileges = (ArrayList<String>) userData.get("privileges");

            UserAccountType userAccountType = new UserAccountType(accountName, privileges);
            User user = new User(userId,firstName, lastName, email, userAccountType,username,password);


            return user;
        }
        return null;
    }
}