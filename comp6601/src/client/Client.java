package comp6601.src.client;

import comp6601.src.server.TutorPlusPermission;
import comp6601.src.server.TutorPlusUserFunctionIntf;
import comp6601.src.server.TutorialPermission;
import comp6601.src.server.User;
import comp6601.src.server.UserPermission;
import comp6601.src.server.UserRole;
import comp6601.src.serverUtils.TutorialException;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jason on 29/03/2017.
 */
public class Client {

    public static TutorPlusUserFunctionIntf tutorPlusUserFunctionIntf;
    public static Scanner keyboardInput;
    public final static String OUTPUT_FILE = "output.out";
    public static User currentUser;
    public static String username;
    public static TutorialPermission tutorialMgntPermissions;
    public static UserPermission userMgntPermissions;

    public static String[] tutorMenuOptionList = {
            "\nChoose option from menu below\n",
            "1. Manage Tutorials\n",
            "2. Manage Users\n",
            "3. logout\n",
            "-1. Exit\n"};

    public static String[] studentMenuOptionList = {
            "\nChoose option from menu below\n",
            "1. View Tutorial List\n",
            "2. Manage My Account\n",
            "3  Logout\n",
            "-1. Exit\n"};

    public static String[] initalMenuOptionList = {
            "\nChoose option from menu below\n" +
                    "1. Login\n",
                    "2. Signup\n",
                    "-1. Exit\n"
    };

    public static void main(String[] args) {

        try {
            keyboardInput = new Scanner(System.in);

            if (args.length == 0) {
                tutorPlusUserFunctionIntf = (TutorPlusUserFunctionIntf) Naming.lookup("rmi://localhost/TutorPlusApplication");

            } else {
                tutorPlusUserFunctionIntf = (TutorPlusUserFunctionIntf) Naming.lookup("rmi://" + args[0] + "/TutorPlusApplication");
            }

            while (true) {
                int option = -2;
                for (String menuOption : initalMenuOptionList) {
                    System.out.printf(menuOption);
                    Thread.sleep(65);
                }
                if (keyboardInput.hasNextInt()) {
                    option = keyboardInput.nextInt();
                } else {
                    System.out.printf("Invalid input. Try again\n");
                    keyboardInput.next();
                    Thread.sleep(500);
                }

                switch (option) {

                    case 1:
                        System.out.printf("Enter Username: -1 to cancel\n");
                        String input = keyboardInput.next();
                        if (!input.equalsIgnoreCase("-1")) {
                            String username = input;
                            System.out.printf("Enter Password: or -1 to cancel\n");
//                            while (!keyboardInput.hasNextDouble()) {
//                                keyboardInput.next(); //clear invalid token from the scanner's input
//                                System.out.printf("Invalid input: Enter new selling price or -1 to cancel\n");
//                            }
                            input = keyboardInput.next();
                            String password = input;
                            if (!input.equalsIgnoreCase("-1")) {

                                 currentUser = tutorPlusUserFunctionIntf.login(username, password);
                                HashMap<String, TutorPlusPermission>
                                        tutorPlusPermissionList =currentUser.getUserRole().getRolePermissions();

                                    tutorialMgntPermissions = (TutorialPermission) tutorPlusPermissionList.get("tutorialMgntPermissions");
                                    userMgntPermissions = (UserPermission) tutorPlusPermissionList.get("userMgntPermissions");

//                                    userMgntPermissions.

                                if (currentUser != null) {

                                    UserRole accountType = currentUser.getUserRole();
//                                    System.out.println(currentUser.getFirstName());
//                                    System.out.println(currentUser.getEmail());
                                    try {
                                        //==============================User Menu===========================
                                        while (currentUser != null) {
                                            option = -2;
                                            String[] menuOptionList = {};
                                            if (accountType.getUserRoleName().equalsIgnoreCase("student")) {
                                                menuOptionList = studentMenuOptionList;
                                            } else menuOptionList = tutorMenuOptionList;
                                            for (String menuOption : menuOptionList) {
                                                System.out.printf(menuOption);
                                                Thread.sleep(65);
                                            }
                                            if (keyboardInput.hasNextInt()) {
                                                option = keyboardInput.nextInt();
                                            } else {
                                                System.out.printf("Invalid input. Try again\n");
                                                keyboardInput.next();
                                                Thread.sleep(500);
                                            }

                                            switch (option) {

                                                case 1:
//                                                    System.out.println(currentUser.getUserSessionId());
                                                    String tutorialName = "My Math";
                                                    String tutorialType = "Math";
                                                    boolean isPublished = true;
                                                    ArrayList<String> components = new ArrayList<>();
                                                    components.add("courses");

                                                    tutorPlusUserFunctionIntf.createTutorial(tutorialName,tutorialType,
                                                            isPublished,components,currentUser);


                                                    break;
                                                case 2:

                                                    break;
                                                case 3:
                                                    tutorPlusUserFunctionIntf.logout(username);
                                                    currentUser = null;
                                                    break;
                                                case -1:
                                                    tutorPlusUserFunctionIntf.logout(username);
                                                    System.exit(0);
                                                    break;
                                            }
                                        }
                                    } catch (TutorialException e) {
                                        System.out.println("Exception: "+e.getMessage());
                                    }
                                    //==============================End of User Menu===========================

                                } else {
                                    System.out.println("Invaild username and/or password.\n");
                                }
                            }
                        }
                        if (input.equalsIgnoreCase("-1")) System.out.printf("\nOperation cancelled.\n");
                        break;
                    //============================Registration=========================
                    case 2:
                        System.out.printf("Enter username or -1 to cancel\n");
                            input = keyboardInput.next();
                            String username = input;
                        if (!input.equalsIgnoreCase("-1")) {
                            System.out.printf("Enter password: -1 to cancel\n");
                            input = keyboardInput.next();
                            String password = input;
                            if (!input.equalsIgnoreCase("-1")) {
                                System.out.printf("Enter First Name: -1 to cancel\n");
                                input = keyboardInput.next();
                                String firstName = input;
                                if (!input.equalsIgnoreCase("-1")) {
                                    System.out.printf("Enter Last Name: or -1 to cancel\n");
                                    input = keyboardInput.next();
                                    String lastName = input;
                                    if (!input.equalsIgnoreCase("-1")) {
                                        System.out.printf("Enter Email: or -1 to cancel\n");
                                        input = keyboardInput.next();
                                        String email = input;
                                        if (!input.equalsIgnoreCase("-1")) {
                                            System.out.printf("Enter account type:(Student or Tutor) or -1 to cancel\n");
                                            input = keyboardInput.next();
                                            String accountType = input;

                                            HashMap<String,String> userDetails = new HashMap<>();
                                            userDetails.put("username",username);
                                            userDetails.put("password",password);
                                            userDetails.put("firstName",firstName);
                                            userDetails.put("lastName",lastName);
                                            userDetails.put("email",email);
                                            userDetails.put("userRole",accountType);
                                            tutorPlusUserFunctionIntf.registerUser(userDetails);
                                        }
                                    }
                                }
                            }
                        }
                        if (input.equalsIgnoreCase("-1")) System.out.printf("\nOperation cancelled.\n");
                        break;
                    //============================End of Registration=========================

                    case -1:
                        System.exit(0);
                        break;

                }

            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
