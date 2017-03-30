package comp6601.src.server;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public interface TutorPlusUserFunctionIntf  extends Remote {

    /**
     * Allows a user to initiate a session in tutorplus
     * @param username
     * @param password
     * @return true if credentials are valid otherwise false
     */
    public User login(String username, String password) throws RemoteException;

    /**
     * Creates a new tutorplus user
     * @throws RemoteException
     */
    public void registerUser(HashMap userData) throws RemoteException;


}
