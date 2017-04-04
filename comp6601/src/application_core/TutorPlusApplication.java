package comp6601.src.application_core;



import comp6601.src.tutorial_components.TutorialComponentManager;
import comp6601.src.permissions.TutorPlusPermission;
import comp6601.src.permissions.TutorialMgmtPermission;
import comp6601.src.permissions.UserMgmtPermission;
import comp6601.src.utils.*;
import java.math.BigInteger;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class TutorPlusApplication extends UnicastRemoteObject implements TutorPlusApplicationIntf {


    public static DbHelper dbHelper;
    public static UserManager userManager;
    public static UserFactory userFactory;
    public static UserSession userSession;
    public static TutorialComponentManager tutorialComponentManager;
    public static TutorialManager tutorialManager;
    public static int numberOfUsers;

//    String saltStr = "#$%&@abcd";
//    byte[] salt = new byte[16];

    public TutorPlusApplication() throws RemoteException{

        dbHelper = new DbHelper();
        this.numberOfUsers =  dbHelper.getNumberOfUsers();
        userFactory = new UserFactory();
        userSession = new UserSession();
        userManager = new UserManager();
        tutorialComponentManager = new TutorialComponentManager();
        tutorialManager = new TutorialManager();

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
        }
    }

    @Override
    public void registerUser(String firstName, String lastName, String email, String username,
                             String password, int userRoleType) throws RemoteException {

        try {
//            String password = (String) userData.get("password");
            password = this.getHashedPassword(password);

//            userData.put("password",password);
            userManager.createUser(firstName,lastName,email,username,password,userRoleType);


        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void updateUser(HashMap<String, Object> userDetails, String userSessionId,
                           String usernameToUpdate) throws RemoteException, UserMgmtException {

        String username = TutorPlusApplication.userSession.getUsername(userSessionId);
        if (username != null) {
            User userToCarryOutUpdate = TutorPlusApplication.userManager.findUser(username);
            User userToUpdate = TutorPlusApplication.userManager.findUser(usernameToUpdate);

            UserMgmtPermission userMgmtPermission =
                    (UserMgmtPermission) userToCarryOutUpdate.getUserRole().getRolePermissions().get("userMgmtPermissions");
            if (userMgmtPermission.isCanEdit() || (userMgmtPermission.isCanEditSelf() && userToCarryOutUpdate.userId == userToUpdate.userId)){

                TutorPlusApplication.userManager.updateUser(userToUpdate,userDetails);
            }

        }
        else throw new UserMgmtException(UserMgmtException.LOGIN);

    }

    @Override
    public void createTutorial(String tutorialName,
                               String tutorialType,boolean isPublished,
                               ArrayList<String> tutorialComponents,
                               String userSessionId) throws RemoteException, TutorialMgmtException, UserMgmtException {


        String username = TutorPlusApplication.userSession.getUsername(userSessionId);
        if (username != null) {
            User user = TutorPlusApplication.userManager.findUser(username);
            HashMap<String, TutorPlusPermission> tutorPlusPermissionList = user.getUserRole().getRolePermissions();
            TutorialMgmtPermission tutorialMgmtPermissions = (TutorialMgmtPermission) tutorPlusPermissionList.get("tutorialMgmtPermissions");

            if (tutorialMgmtPermissions.isCanCreate()) {
                System.out.println("valid pass");

            } else throw new TutorialMgmtException(TutorialMgmtException.CREATE_TUTORIAL);
        }
        else throw new UserMgmtException(UserMgmtException.LOGIN);

    }

    @Override
    public void updateTutorial(HashMap<String, Object> tutorialDetails, String tutorialId, String userSessionId) throws RemoteException, UserMgmtException {

        String username = TutorPlusApplication.userSession.getUsername(userSessionId);
        if (username != null) {

        }
        else throw new UserMgmtException(UserMgmtException.LOGIN);
    }

    @Override
    public void submitTutorial(Tutorial tutorial, String userSessionId) throws RemoteException, UserMgmtException {
        String username = TutorPlusApplication.userSession.getUsername(userSessionId);
        if (username != null) {


        }
        else throw new UserMgmtException(UserMgmtException.LOGIN);
    }

    @Override
    public ArrayList<Tutorial> getTutorialList(String userSessionId) throws RemoteException, UserMgmtException {
        String username = TutorPlusApplication.userSession.getUsername(userSessionId);
        if (username != null) {

            return null;

        }
        else throw new UserMgmtException(UserMgmtException.LOGIN);
    }

    @Override
    public HashMap<String, Object> getComponentRegisteredList(String userSessionId) {
        return null;
    }

    //=======================================Helpers==========================================
    /**
     * Gets a new session token for an authenticated userr
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

        return stringBuffer.toString();



    }
    //=======================================End of Helpers==========================================


}
