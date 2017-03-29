package comp6601.src.server;

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
     * Adds a user to the system from the database
     * @param username
     */
    private boolean addUserFromDb(String username){

        User user = Server.userFactory.getUser(username);
        if (user != null){
            userList.put(username,user);
            return true;
        }
        return false;

    }

    public void registerNewUser(){

    }

}
