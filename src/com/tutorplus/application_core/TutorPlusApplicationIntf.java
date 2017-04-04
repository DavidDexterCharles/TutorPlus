package com.tutorplus.application_core;
import com.tutorplus.utils.TutorialMgmtException;
import com.tutorplus.utils.UserMgmtException;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public interface TutorPlusApplicationIntf extends Remote {

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
    public void logout(String userSessionId) throws RemoteException;

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
     * Updates the details of a user
     * @param userDetails
     * @param userSessionId
     * @param usernameToUpdate
     * @throws RemoteException
     */
    public void updateUser(HashMap<String, Object> userDetails,
                           String userSessionId, String usernameToUpdate) throws RemoteException, UserMgmtException;

    /**
     * Creates a new tutorial
     * @param tutorialName
     * @param tutorialType
     * @param isPublished
     * @param tutorialComponents
     * @throws RemoteException
     */

    public void createTutorial(String tutorialName,
                               String tutorialType, boolean isPublished,
                               ArrayList<String> tutorialComponents,
                               String userSessionId) throws RemoteException, TutorialMgmtException, UserMgmtException;


    /**
     * Get a list of tutorials
     * @throws RemoteException
     */
    public ArrayList<Tutorial> getTutorialList(String userSessionId) throws RemoteException, UserMgmtException;

    /**
     * Update the details of tutorial
     * @param tutorialDetails
     * @param userSessionId
     * @param tutorialId
     */
    public  void updateATutorial(HashMap<String, Object> tutorialDetails,
                                 String userSessionId, String tutorialId) throws RemoteException;

    /**
     * Removes a tutorial
     * @param tutorialId
     */
    public  void removeATutorial (String tutorialId,String userSessionId) throws RemoteException;

    /**
     * Makes a tutorial available to do
     * @param tutorialid
     * @param userSessionId
     * @return
     */
    public  boolean publishAtutorial (String tutorialid, String userSessionId) throws RemoteException;

    /**
     * Submits a tutorial
     * @throws RemoteException
     */
    public void submitTutorial(Tutorial tutorial, String userSessionId) throws RemoteException, UserMgmtException;



    /**
     * Gets a list of all the registered tutorial_components on in
     * @param userSessionId
     * @return A list of all registered tutorial_components
     */
    public HashMap<String,Object> getComponentRegisteredList(String userSessionId)throws RemoteException;




}
