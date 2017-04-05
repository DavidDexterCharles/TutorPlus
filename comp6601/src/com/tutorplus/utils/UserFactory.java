package com.tutorplus.utils;

import com.tutorplus.application_core.TutorPlusApplication;
import com.tutorplus.application_core.User;
import com.tutorplus.roles.StudentRole;
import com.tutorplus.roles.TutorRole;
import com.tutorplus.roles.UserRole;

import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class UserFactory {

    public static User getNewInstance(){

        String userId = "tpu_"+TutorPlusApplication.nextAvailUserId;
        TutorPlusApplication.nextAvailUserId++;

        User user = new User(userId);

        return user;

    }
    public static User getNewInstance(String fisrtName, String lastName, String email, UserRole userRole,
                                      String username, String password){

        String userId = "tpu_"+TutorPlusApplication.nextAvailUserId;
        TutorPlusApplication.nextAvailUserId++;
        return new User(userId,fisrtName,lastName,email,userRole,username,password);

    }

    /**
     * Gets a speciifed tutor plus user
     * @param username
     * @return A tutor plus user object
     */
    public static User getUser(String username){

        HashMap<String,Object>  userData = TutorPlusApplication.dbHelper.getUserData(username);

//        System.out.println(userData.toString());
        if (userData.size() > 0) {
            String userId =  (String) userData.get("userId");
            String firstName = (String) userData.get("firstName");
            String lastName = (String) userData.get("lastName");
            String accountName = (String) userData.get("accountName");
            String email = (String) userData.get("email");
            String password = (String) userData.get("password");
//            ArrayList<String> privileges = (ArrayList<String>) userData.get("privileges");

            UserRole userRole;
            if (accountName.equalsIgnoreCase("student")){
                 userRole = new StudentRole();
//                userRole.addPermissions(privileges);
            }
            else{
                userRole = new TutorRole();
//                userRole.addPermissions(privileges);
            }
//            UserRole userRole = new UserRole(accountName, privileges);
//            System.out.println("userRole: " + userRole.getUserRoleName());

//            if (accountName.equalsIgnoreCase("student")){
                return new User(userId,firstName, lastName, email, userRole,username,password);
//            }
//            if (accountName.equalsIgnoreCase("tutor")) {
//                return new Tutor(userId,firstName, lastName, email, userRole,username,password);

//            }

        }
        return null;
    }
}