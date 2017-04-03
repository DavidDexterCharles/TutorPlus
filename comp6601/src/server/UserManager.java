package comp6601.src.server;

import comp6601.src.utils.UserFactory;

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
    public User createUser(String firstName, String lastName, String email, String username, String password, int userRoleType) {

        UserRole userRole;
        if (userRoleType == 1) {
            userRole = new StudentRole();
        } else  {
            userRole = new TutorRole();
        }
        TutorPlusApplication.numberOfUsers++;
        String userId = "tpu_"+TutorPlusApplication.numberOfUsers;
        User user = UserFactory.getNewInstance(userId,firstName,lastName,email,userRole,username,password);

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
