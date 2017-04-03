package comp6601.src.server;

import java.io.Serializable;

/**
 * Created by jason on 29/03/2017.
 */
public class User implements Serializable {

    protected int userId;
    protected String firstName;
    protected String lastName;
    protected String otherName;
    protected String email;
    protected boolean isEnabled;
    protected UserRole userRole;
    protected String userSessionId;
    public Login login;

    public User(int userId, String firstName, String lastName, String email, UserRole userRole,
                   String username, String password){

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isEnabled = true;
        this.userRole = userRole;

        this.login = new Login(username,password);
//        this.userPrivileges = new Privilege(true,true,)
//        this.userPrivileges.

    }

    public User (){

        this.login = new Login();
        this.isEnabled = true;

    }

    //getters
    public int getUserId() {
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



    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserSessionId(String userSessionId) {
        this.userSessionId = userSessionId;
    }

}
