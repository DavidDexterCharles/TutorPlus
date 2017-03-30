package comp6601.src.server;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

/**
 * Created by jason on 29/03/2017.
 */
public class Client {

    public static TutorPlusUserFunctionIntf tutorPlusUserFunctionIntf;
    public static Scanner keyboardInput;
    public final static String OUTPUT_FILE = "output.out";
    public static String[] tutorMenuOptionList = {
            "\nChoose option from menu below\n",
            "1. Manage Tutorials\n",
            "2. Manage Users\n",
            "-1. Logout\n"};

    public static String[] studentMenuOptionList = {
            "\nChoose option from menu below\n",
            "1. View Tutorial List\n",
            "2. Manage My Account\n",
            "-1. Logout\n"};

    public static String[] initalMenuOptionList = {
            "\nChoose option from menu below\n" +
                    "1. Login\n",
            "2. Signup\n"};

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

                                User user = tutorPlusUserFunctionIntf.login(username, password);
                                if (user != null) {

                                    UserAccountType accountType = user.getAccountType();
                                    try {
                                        while (true) {
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
                                            }
                                        }
                                    } catch (Exception e) {

                                    }
                                } else {
                                    System.out.println("Invaild username and/or password.\n");
                                }

                            }
                        }
                        if (input.equalsIgnoreCase("-1")) System.out.printf("\nOperation cancelled.\n");
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
