package comp6601.src.server;

/**
 * Created by jason on 29/03/2017.
 */
public class TutorPlusUserInterface {

    public boolean login(String username, String password){

        User user = Server.userManager.findUser(username);

        if (user != null){

           return user.login.validate(username,password);
        }
        return false;
    }
}
