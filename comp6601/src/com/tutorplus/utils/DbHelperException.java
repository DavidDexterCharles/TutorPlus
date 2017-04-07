/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorplus.utils;

/**
 *
 * @author jason
 */
public class DbHelperException extends Exception {
    
        public final static String EMAIL_ALREADY_EXISTS = "email already exsist";

        public DbHelperException(String message) {
            super(message);
        }
    
}
