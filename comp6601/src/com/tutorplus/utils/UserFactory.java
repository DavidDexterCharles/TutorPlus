package com.tutorplus.utils;

import com.tutorplus.application_core.TutorPlusApplication;
import com.tutorplus.application_core.User;
import com.tutorplus.roles.AdminRole;
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
        String status = "A"; //default is active;
        return new User(userId,fisrtName,lastName,email,userRole,username,password,status);

    }

    /**
     * Gets a specified tutor plus user
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
            String accountType = (String) userData.get("accountType");
            String status = (String) userData.get("status");
            String email = (String) userData.get("email");
            String password = (String) userData.get("password");
//            ArrayList<String> privileges = (ArrayList<String>) userData.get("privileges");

            UserRole userRole;
            if (accountType.equalsIgnoreCase("ST")){
                 userRole = new StudentRole();
//                userRole.addPermissions(privileges);
            }
            else if (accountType.equalsIgnoreCase("TT")) {
                userRole = new TutorRole();
//                userRole.addPermissions(privileges);
            }
            else {
                userRole = new AdminRole();
            }
//            UserRole userRole = new UserRole(accountType, privileges);
//            System.out.println("userRole: " + userRole.getUserRoleName());

//            if (accountType.equalsIgnoreCase("student")){
                return new User(userId,firstName, lastName, email, userRole,username,password,status);
//            }
//            if (accountType.equalsIgnoreCase("tutor")) {
//                return new Tutor(userId,firstName, lastName, email, userRole,username,password);

//            }

        }
        return null;
    }
}