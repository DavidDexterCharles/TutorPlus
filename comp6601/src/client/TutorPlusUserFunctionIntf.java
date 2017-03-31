package comp6601.src.client;

import comp6601.src.server.Tutorial;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
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
     * Allows a user to terminate a session in tutorplus
     */
    public void logout(String username) throws RemoteException;

    /**
     * Creates a new tutorplus user
     * @throws RemoteException
     */
    public void registerUser(HashMap userData) throws RemoteException;

    /**
     * Creates a new tutorial
     * @throws RemoteException
     */
    public void createTutorial() throws RemoteException;

    /**
     * Modify the contents a tutorial
     * @throws RemoteException
     */
    public void editTutorial(Tutorial tutorial) throws RemoteException;
    /**
     * Submits a tutorial
     * @throws RemoteException
     */
    public void submitTutorial(Tutorial tutorial) throws RemoteException;

    /**
     * Get a list of tutorials
     * @throws RemoteException
     */
    public ArrayList<Tutorial> getTutorialList() throws RemoteException;


}
