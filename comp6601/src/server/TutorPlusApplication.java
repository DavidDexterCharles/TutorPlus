package comp6601.src.server;

import comp6601.src.utils.DbHelper;
import comp6601.src.utils.TutorialMgmtException;
import comp6601.src.utils.UserFactory;
import comp6601.src.utils.UserSession;

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
public class TutorPlusApplication extends UnicastRemoteObject implements comp6601.src.server.TutorPlusUserFunctionIntf {


    public static DbHelper dbHelper;
    public static UserManager userManager;
    public static UserFactory userFactory;
    public static UserSession userSession;
    public static ComponentManager componentManager;
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
        componentManager = new ComponentManager();
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
    public void logout(String username) throws RemoteException {

        User user = userManager.findUser(username);

//       System.out.println(user.getFirstName());

        if (user != null){
            userSession.removeUserFromSessionList(username);
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
    public void createTutorial(String tutorialName,
                               String tutorialType, boolean isPublished,
                               ArrayList<String> tutorialComponents, User user) throws RemoteException, TutorialMgmtException {

        //look up tutorial permissions from user
        HashMap<String, TutorPlusPermission> tutorPlusPermissionList = user.getUserRole().rolePermissions;
        TutorialMgmtPermission tutorialMgmtPermissions = (TutorialMgmtPermission) tutorPlusPermissionList.get("tutorialMgmtPermissions");

        if (tutorialMgmtPermissions.isCanCreate()){
            System.out.println("valid pass");

        }
        else throw new TutorialMgmtException(TutorialMgmtException.CREATE_TUTORIAL);

    }

    @Override
    public void editTutorial(Tutorial tutorial) throws RemoteException {

    }

    @Override
    public void submitTutorial(Tutorial tutorial) throws RemoteException {

    }

    @Override
    public ArrayList<Tutorial> getTutorialList() throws RemoteException {
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
