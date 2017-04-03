package comp6601.src.server;
import comp6601.src.utils.TutorialMgmtException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

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
    public void logout (String username) throws RemoteException;

    /**
     *  Creates a new user in Tutor Plus
     * @param firstName
     * @param lastName
     * @param email
     * @param username
     * @param password
     * @param userRoleType
     * @throws RemoteException
     */
    public void registerUser(String firstName, String lastName, String email,
                             String username, String password, int userRoleType) throws RemoteException;

    /**
     * Creates a new tutorial
     * @param tutorialName
     * @param tutorialType
     * @param isPublished
     * @param tutorialComponents
     * @throws RemoteException
     */

    public void createTutorial(String tutorialName,
                               String tutorialType,boolean isPublished,
                               ArrayList<String> tutorialComponents, User user) throws RemoteException, TutorialMgmtException;

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
