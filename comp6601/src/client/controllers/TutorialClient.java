package comp6601.src.client.controllers;


import comp6601.src.application_core.TutorPlusApplicationIntf;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TutorialClient {
    
    private TutorPlusApplicationIntf tutorplusIntf;
    private final String tutorialyServerURL= "rmi://" + "localhost" + "/TutorPlusApplicaions";;

    public TutorialClient() throws RemoteException {
        try {
            this.tutorplusIntf = (TutorPlusApplicationIntf)Naming.lookup(this.tutorialyServerURL);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(TutorialClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public TutorPlusApplicationIntf gettutorplusIntf(){
    return this.tutorplusIntf;
    }
         
}
