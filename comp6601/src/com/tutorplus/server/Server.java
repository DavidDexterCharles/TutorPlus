package com.tutorplus.server;

import com.tutorplus.application_core.TutorPlusApplication;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


/**
 * Created by jason on 29/03/2017.
 */
public class Server {

    public static TutorPlusApplication tutorPlusApplication;
    public  static String SERVER_ADDR = "localhost";
    public  static int SERVER_PORT = 1099;

    public static void main(String [] args){

        try {
            System.out.println("Server starting...");
            Thread.sleep(500);
            System.out.println("Starting RMI Registry...");
            Thread.sleep(500);

//            Registry registry = LocateRegistry.getRegistry(SERVER_PORT);
//            if (registry == null){
                LocateRegistry.createRegistry(SERVER_PORT);

//            }
            System.out.println("Done!");
            Thread.sleep(500);
            System.out.println("Instantiating classes...");
            Thread.sleep(500);
            tutorPlusApplication = new TutorPlusApplication();
            System.out.println("Done!");
            Thread.sleep(500);
            System.out.printf("Binding the tutorplus user functions to RMI registry at port: %s ...\n",SERVER_PORT);
            Thread.sleep(500);
            System.out.println("Binding complete!");
            Naming.rebind("//"+ SERVER_ADDR +":"+SERVER_PORT+"/TutorPlusApplication", tutorPlusApplication);

//            Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//                @Override
//                public void run() {
//
//                    System.out.println("fdsafasfsadfas");
//                    try {
//                        UnicastRemoteObject.unexportObject(tutorPlusApplication,true);
//                    } catch (NoSuchObjectException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }));


        } catch(Exception e){

            e.printStackTrace();
        }


    }
}
