package com.tutorplus.application_core;
import com.tutorplus.utils.UserMgmtException;

import java.rmi.Remote;
import java.rmi.RemoteException;
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
    
    public int testlop()throws RemoteException;
    
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
    public boolean registerUser(String firstName, String lastName,String otherName, String email,
                             String username, String password, int userRoleType) throws RemoteException;

    /**
     * Updates the details of a user
     * @param userDetails
     * @param userSessionId
     * @param usernameToUpdate
     * @throws RemoteException
     */
    public boolean updateUser(HashMap<String, Object> userDetails,
                           String userSessionId, String usernameToUpdate) throws RemoteException, UserMgmtException;
    /**
     * Get options related to a specific question
     * @param topicId
     * @return 
     */
    public HashMap<String,QuestionOptions> getQuestionOptions(String topicId) throws RemoteException;
    
    /**
     * Get question related to a specific topic
     * @param topicId
     * @return 
     */
    public HashMap<String,TopicQuestions> getTopicQuestions(String topicId) throws RemoteException;


    /**
     * Gets a list of all the registered tutorial_components on in
     * @param userSessionId
     * @return A list of all registered tutorial_components
     */
    public HashMap<String,Object> getComponentRegisteredList(String userSessionId)throws RemoteException;




}
