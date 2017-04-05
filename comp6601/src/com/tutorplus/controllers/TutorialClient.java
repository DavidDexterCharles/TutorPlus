package com.tutorplus.controllers;


import com.tutorplus.application_core.TutorPlusApplicationIntf;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.tutorplus.application_core.User;
import com.tutorplus.views.Login;

public class TutorialClient {
    
    public static User user;
    public static String userSession;
    public static TutorPlusApplicationIntf tutorplusIntf;
    private static final String tutorialServerURL= "rmi://" + "localhost" + "/TutorPlusApplication";

    public TutorialClient(){
        try {
            this.tutorplusIntf = (TutorPlusApplicationIntf)Naming.lookup(this.tutorialServerURL);
            
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(TutorialClient.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(TutorialClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public TutorPlusApplicationIntf gettutorplusIntf(){
        return this.tutorplusIntf;
    }
    

         
}
