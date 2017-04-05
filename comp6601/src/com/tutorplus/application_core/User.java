package com.tutorplus.application_core;

import com.tutorplus.roles.UserRole;

import java.io.Serializable;

/**
 * Created by jason on 29/03/2017.
 */
public class User implements Serializable {

    protected String userId;
    protected String firstName;
    protected String lastName;
    protected String otherName;
    protected String email;
    protected boolean isEnabled;
    protected UserRole userRole;
    protected String userSessionId;
    public Login login;

    public User(String userId, String firstName, String lastName, String email, UserRole userRole,
                   String username, String password){

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isEnabled = true;
        this.userRole = userRole;

        this.login = new Login(username,password);

    }

    public User (){

        this.login = new Login();
        this.isEnabled = true;

    }
    public User (String userId){

        this.login = new Login();
        this.isEnabled = true;
        this.userId = userId;

    }

    //getters
    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getOtherName() {
        return otherName;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public String getUserSessionId() {
        return userSessionId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", otherName='" + otherName + '\'' +
                ", email='" + email + '\'' +
                ", isEnabled=" + isEnabled +
                ", userRole=" + userRole +
                ", userSessionId='" + userSessionId + '\'' +
                ", login=" + login +
                '}';
    }
}
