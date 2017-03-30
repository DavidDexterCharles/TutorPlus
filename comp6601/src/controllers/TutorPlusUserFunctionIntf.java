package controllers;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.HashMap;


public interface TutorPlusUserFunctionIntf  extends Remote {

    
//    public User login(String username, String password) throws RemoteException;

  
    public void registerUser(HashMap userData) throws RemoteException;


}