package com.tutorplus.controllers;


import com.tutorplus.application_core.TutorPlusApplicationIntf;
import java.rmi.*;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.tutorplus.application_core.User;

public class TutorialClient {
    
    public static User user;
    public static TutorPlusApplicationIntf tutorplusIntf;
    private final String tutorialServerURL= "rmi://" + "localhost" + "/TutorPlusApplicaions";

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
