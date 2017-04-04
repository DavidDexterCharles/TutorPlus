/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorplus.controllers;


import com.tutorplus.application_core.TutorPlusApplicationIntf;
import java.rmi.RemoteException;

/**
 *
 * @author David Charles
 */
public class login extends TutorialClient {
    TutorPlusApplicationIntf loginInterface;
    public login() throws RemoteException{
        loginInterface=gettutorplusIntf();// loginInterface object would be used to get access to the remote methods
    }
    
}
