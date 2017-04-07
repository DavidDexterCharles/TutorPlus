package com.tutorplus.application_core;

import com.tutorplus.permissions.UserMgmtPermission;
import com.tutorplus.utils.*;

import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TutorPlusApplication extends UnicastRemoteObject implements TutorPlusApplicationIntf {


    public static DbHelper dbHelper;
    public static UserManager userManager;
    public static UserFactory userFactory;
    public static UserSession userSession;
    public static TopicQuestionsOptionsManager topicQuestionsOptionsManager;
    public static int nextAvailUserId;
    public static int nextAvailTutorialId;


    public TutorPlusApplication() throws RemoteException{

        dbHelper = new DbHelper();
        this.nextAvailUserId =  dbHelper.getNumberOfUsers();
        this.nextAvailUserId++;
        this.nextAvailTutorialId =  dbHelper.getNumberOfTutorials();
        this.nextAvailTutorialId++;
        userFactory = new UserFactory();
        userSession = new UserSession();
        userManager = new UserManager();
        topicQuestionsOptionsManager = new TopicQuestionsOptionsManager();

    }
  
    @Override
    public int testlop()throws RemoteException{
     return 200;
    }
    
    @Override
    public User login(String username, String password) throws RemoteException{

        try {
            
            password = this.getHashedPassword(password);
            
            User user = userManager.findUser(username);

            if (user != null) {

                boolean result = user.login.validate(username, password);
                if (result) {

                    String sessionId = this.nextSessionId();
                    user.userSessionId = sessionId;
                    userSession.addUserToSessionList(username, sessionId);


                    return user;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void logout(String userSessionId) throws RemoteException {

        String username = TutorPlusApplication.userSession.getUsername(userSessionId);
        User user = userManager.findUser(username);

//       System.out.println(user.getFirstName());

        if (user != null){
            userSession.removeUserFromSessionList(userSessionId);
            System.out.println(username + "user has logged out");
        }
    }

    @Override
    public boolean registerUser(String firstName, String lastName,String otherName, String email, String username,
                             String password, int userRoleType) throws RemoteException {

        try {
//            String password = (String) userData.get("password");
            password = this.getHashedPassword(password);

//            userData.put("password",password);
           User  user = userManager.createUser(firstName,lastName,otherName,email,username,password,userRoleType);
           if (user !=  null){
               return true;
           }
           return false;

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        }
        

    }

    @Override
    public boolean updateUser(HashMap<String, Object> userDetails, String userSessionId,
                           String usernameToUpdate) throws RemoteException, UserMgmtException {

        String username = TutorPlusApplication.userSession.getUsername(userSessionId);
        if (username != null) {
            User userToCarryOutUpdate = TutorPlusApplication.userManager.findUser(username);
            User userToUpdate = TutorPlusApplication.userManager.findUser(usernameToUpdate);

            UserMgmtPermission userMgmtPermission =
                    (UserMgmtPermission) userToCarryOutUpdate.getUserRole().getRolePermissions().get("userMgmtPermissions");
            if (userMgmtPermission.isCanEdit() || (userMgmtPermission.isCanEditSelf() && userToCarryOutUpdate.userId.equalsIgnoreCase(userToUpdate.userId))){

             return TutorPlusApplication.userManager.updateUser(userToUpdate,userDetails);
            }

        }
        else throw new UserMgmtException(UserMgmtException.LOGIN);
        
        return false;

    }
     @Override
    public HashMap<String,QuestionOptions> getQuestionOptions(String topicId) throws RemoteException{
//           System.out.println("fsafdsa");

        HashMap<String,QuestionOptions> result =  topicQuestionsOptionsManager.getQuestionOptionsList(topicId);
        
        
        Iterator iterator = result.entrySet().iterator();
        
        while (iterator.hasNext()){
            
              Map.Entry pair = (Map.Entry)iterator.next();
              
                 System.out.println(pair.getKey() + " = " + pair.getValue());
            QuestionOptions q = (QuestionOptions) pair.getValue();
            
            q.toString();
        }
        
        return result;
    }
        @Override
    public HashMap<String,TopicQuestions> getTopicQuestions(String topicId) throws RemoteException{
        
         HashMap<String,TopicQuestions> result =  topicQuestionsOptionsManager.getTopicQuestionList(topicId);
        
        
        Iterator iterator = result.entrySet().iterator();
        
        while (iterator.hasNext()){
            
              Map.Entry pair = (Map.Entry)iterator.next();
              
                 System.out.println(pair.getKey() + " = " + pair.getValue());
            TopicQuestions q = (TopicQuestions) pair.getValue();
            
            q.toString();
        }
        return result;
    }
 

    //=======================================Helpers==========================================
    /**
     * Gets a new session token for an authenticated user
     * @return A randomly generated string token
     */
    private String nextSessionId() {

       SecureRandom random = new SecureRandom();
       return new BigInteger(130, random).toString(32);
    }

    /**
     * Hashes a password
     * @param password
     * @return A hashed password
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     */
    private String getHashedPassword(String password) throws NoSuchAlgorithmException {
//        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA512");
//        int iterations = 65536;
//        int keyLength = 128;
//        salt = saltStr.getBytes();
//        PBEKeySpec spec = new PBEKeySpec( password, salt, iterations, keyLength );
//        SecretKey key = secretKeyFactory.generateSecret( spec );
//        byte[] result = key.getEncoded( );
//        return new String(result);

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < byteData.length; i++) {
            stringBuffer.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

//        return stringBuffer.toString();
           
            //todo: change return statement to hashed password
          return password;



    }
    //=======================================End of Helpers==========================================
     @Override
     public String doaction(User userInfo,String request,String data)throws RemoteException{


            if(("getMyCourses").equals(request)){
                return dbHelper.getMyCourses(userInfo,request);
            }
            if(("getAllCourses").equals(request)){
                return dbHelper.getAllCourses();
            }
              if(("getCourseTopics").equals(request)){
                return dbHelper.getCourseTopics(data);
            }
              if(("registerForCourse").equals(request)){
                return dbHelper.registerForCourse(userInfo,data);
            }
               if(("deregisterCourse").equals(request)){
                return dbHelper.deregisterCourse(userInfo,data);
            }

        return "Strange things";
            
      
     }

}
