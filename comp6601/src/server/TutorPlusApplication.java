package comp6601.src.server;

import comp6601.src.utils.DbHelper;
import comp6601.src.utils.UserFactory;
import comp6601.src.utils.UserSession;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class TutorPlusApplication extends UnicastRemoteObject implements comp6601.src.server.TutorPlusUserFunctionIntf {


    public static DbHelper dbHelper;
    public static UserManager userManager;
    public static UserFactory userFactory;
    public static UserSession userSession;

    public TutorPlusApplication() throws RemoteException{

        dbHelper = new DbHelper();
        userFactory = new UserFactory();
        userSession = new UserSession();
        userManager = new UserManager();
    }

    @Override
    public User login(String username, String password) throws RemoteException{

        User user = userManager.findUser(username);

        if (user != null){

           boolean result = user.login.validate(username,password);
           if (result){
               userSession.addUserToSessionList(username);
               return user;
           }
        }
        return null;
    }

    @Override
    public void registerUser(HashMap userData) throws RemoteException {

    }


}
