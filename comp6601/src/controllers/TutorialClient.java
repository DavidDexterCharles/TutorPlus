package controllers;


import java.net.MalformedURLException;
import java.rmi.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TutorialClient {
    
    private  TutorPlusUserFunctionIntf tutorplusIntf;
    private final String tutorialyServerURL= "rmi://" + "localhost" + "/TutorPlusApplicaions";;

    public TutorialClient() throws RemoteException {
        try {
            this.tutorplusIntf = (TutorPlusUserFunctionIntf)Naming.lookup(this.tutorialyServerURL);
        } catch (NotBoundException | MalformedURLException ex) {
            Logger.getLogger(TutorialClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public TutorPlusUserFunctionIntf gettutorplusIntf(){
    return this.tutorplusIntf;
    }
         
}
