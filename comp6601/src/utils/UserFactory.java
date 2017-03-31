package comp6601.src.utils;

import comp6601.src.server.*;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class UserFactory {

    public static User getNewInstance(){

        return new User();

    }

    /**
     * Gets a speciifed tutor plus user
     * @param username
     * @return A tutor plus user object
     */
    public static  User getUser(String username){

        HashMap<String,Object>  userData = TutorPlusApplication.dbHelper.getUserData(username);

//        System.out.println(userData.toString());
        if (userData.size() > 0) {
            int userId = (int) userData.get("userId");
            String firstName = (String) userData.get("firstName");
            String lastName = (String) userData.get("lastName");
            String accountName = (String) userData.get("accountName");
            String email = (String) userData.get("email");
            String password = (String) userData.get("password");
            ArrayList<String> privileges = (ArrayList<String>) userData.get("privileges");

            UserAccountType userAccountType;
            if (accountName.equalsIgnoreCase("student")){
                 userAccountType = new StudentAccountType();
                userAccountType.addPrivileges(privileges);
            }
            else{
                 userAccountType = new TutorAccountType();
                userAccountType.addPrivileges(privileges);
            }
//            UserAccountType userAccountType = new UserAccountType(accountName, privileges);
            System.out.println("accountType: " + userAccountType.getAccountTypeName());

//            if (accountName.equalsIgnoreCase("student")){
                return new User (userId,firstName, lastName, email, userAccountType,username,password);
//            }
//            if (accountName.equalsIgnoreCase("tutor")) {
//                return new Tutor(userId,firstName, lastName, email, userAccountType,username,password);

//            }

        }
        return null;
    }
}