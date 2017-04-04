package comp6601.src.utils;

import comp6601.src.application_core.*;
import comp6601.src.roles.StudentRole;
import comp6601.src.roles.TutorRole;
import comp6601.src.roles.UserRole;

import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class UserFactory {

    public static User getNewInstance(){

        return new User();

    }
    public static User getNewInstance(String  userId, String fisrtName, String lastName, String email, UserRole userRole,
                                      String username, String password){

        return new User(userId,fisrtName,lastName,email,userRole,username,password);

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
                return new User (userId,firstName, lastName, email, userRole,username,password);
//            }
//            if (accountName.equalsIgnoreCase("tutor")) {
//                return new Tutor(userId,firstName, lastName, email, userRole,username,password);

//            }

        }
        return null;
    }
}