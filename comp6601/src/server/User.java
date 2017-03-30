package comp6601.src.server;

import java.io.Serializable;

/**
 * Created by jason on 29/03/2017.
 */
public class User implements Serializable {

    private int userId;
    private String firstName;
    private String lastName;
    private String otherName;
    private String email;
    private boolean isEnabled;
    private UserAccountType accountType;
    public Login login;

    public User(int userId, String firstName, String lastName, String email, UserAccountType accountType,
                String username, String password){

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.isEnabled = true;

        this.login = new Login(username,password);

    }
    public User(int userId){
        this.userId = userId;
        this.login = new Login();

    }

    public User(){

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

    public UserAccountType getAccountType() {
        return accountType;
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

    public void setAccountType(UserAccountType accountType) {
        this.accountType = accountType;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
