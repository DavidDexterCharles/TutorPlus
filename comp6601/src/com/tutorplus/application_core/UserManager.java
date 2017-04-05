package com.tutorplus.application_core;

import com.tutorplus.roles.StudentRole;
import com.tutorplus.roles.TutorRole;
import com.tutorplus.roles.UserRole;
import com.tutorplus.utils.UserFactory;

import java.util.HashMap;


/**
 * Created by jason on 29/03/2017.
 */
public  class UserManager {

    HashMap<String,User> userList;


    public UserManager(){

        this.userList = new HashMap<>();
    }

    /**
     * Looks up a user object of tutor plus
     * @param username
     * @return A user object of the tutor plus
     */
    public User findUser(String username){

       User user = userList.get(username);

       if (user == null){

         if (addUserFromDb(username)){
             return userList.get(username);
         }
         return  null;

       }
       return user;
    }

    /**updates
     * @param user
     * @param userDetails
     */
    public void updateUser(User user, HashMap<String,Object> userDetails){

        String fistName = (String)userDetails.get("firstName");
        String lastName = (String)userDetails.get("lastName");
        String email = (String)userDetails.get("email");
        String otherName = (String)userDetails.get("otherName");

        if (fistName != null) user.firstName = fistName;
        if (lastName != null) user.firstName = lastName;
        if (email != null) user.firstName = email;
        if (otherName != null) user.firstName = otherName;

    }

    /**
     * Enable or disable a user
     * @param user
     * @param isEnabled
     */
    public void setIsEnabled (User user,boolean isEnabled){

        user.isEnabled = user.isEnabled;
    }

    /**
     * Creates a new user in Tutor Plus
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param password
     * @param userRoleType
     * @return
     */
    public User createUser(String firstName, String lastName, String email,
                           String username, String password, int userRoleType) {

        UserRole userRole;
        if (userRoleType == 1) {
            userRole = new StudentRole();
        } else  {
            userRole = new TutorRole();
        }

        User user = UserFactory.getNewInstance(firstName,lastName,email,userRole,username,password);

//        user.login.setUsername(username);
//        user.login.setPassword(password);

        userList.put(user.login.getUsername(), user);

        TutorPlusApplication.dbHelper.saveUser(user);

        return user;

    }

    //================= Helpers ===================//
    /**
     * Adds a user to the system from the database
     * @param username
     */
    private boolean addUserFromDb(String username){

        User user = TutorPlusApplication.userFactory.getUser(username);
        if (user != null){
            userList.put(username,user);
            return true;
        }
        return false;

    }


    //================End of Helpers===============//

}
