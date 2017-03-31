package comp6601.src.client;

import comp6601.src.server.TutorPlusUserFunctionIntf;
import comp6601.src.server.User;
import comp6601.src.server.UserAccountType;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
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
                                if (currentUser != null) {

                                    UserAccountType accountType = currentUser.getAccountType();
//                                    System.out.println(currentUser.getFirstName());
//                                    System.out.println(currentUser.getEmail());
                                    try {
                                        //==============================User Menu===========================
                                        while (currentUser != null) {
                                            option = -2;
                                            String[] menuOptionList = {};
                                            if (accountType.getAccountTypeName().equalsIgnoreCase("student")) {
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
                                    } catch (Exception e) {

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
                                            userDetails.put("accountType",accountType);
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
