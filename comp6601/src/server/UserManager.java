package comp6601.src.server;

import comp6601.src.serverUtils.UserFactory;

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

    public User createUser(HashMap userDetails) {


        User user = UserFactory.getNewInstance();
        user.setFirstName((String) userDetails.get("firstName"));
        user.setLastName((String) userDetails.get("lastName"));
        user.setEmail((String) userDetails.get("email"));
        user.login.setUsername((String) userDetails.get("username"));
        user.login.setPassword((String)userDetails.get("password"));
        String accountType = (String) userDetails.get("userRole");

        UserRole userRole;
        if (accountType.equalsIgnoreCase("student")) {
            userRole = new StudentRole();
        } else {
            userRole = new TutorRole();
        }
        user.setUserRole(userRole);

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
