package com.tutorplus.utils;

/**
 *  This class provides a means to give customized remote exception message to users when making unauthorized requests
 *  on tutorials.
 * Created by jason on 03/04/2017.
 */
public class UserMgmtException extends Exception {


    public final static String CREATE_USER = "User not allowed to create users";
    public final static String EDIT_USER = "User not allowed to edit users";
    public final static String LOGIN = "User not not logged in.";

    public UserMgmtException(String message) {
        super(message);
    }
}
