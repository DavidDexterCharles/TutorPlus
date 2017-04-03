package comp6601.src.server;

import comp6601.src.utils.UserMgmtException;

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



    //setters

    public void setFirstName(String firstName, User user) throws UserMgmtException {
        UserMgmtPermission userMgmtPermission =
                (UserMgmtPermission) user.getUserRole().getRolePermissions().get("userMgmtPermissions");
        if (userMgmtPermission.isCanEdit() || (userMgmtPermission.isCanEditSelf() && user.getUserId() == this.userId))
            this.firstName = firstName;
        else throw new UserMgmtException(UserMgmtException.EDIT_USER);

    }

    public void setLastName(String lastName, User user) throws UserMgmtException {
        UserMgmtPermission userMgmtPermission =
                (UserMgmtPermission) user.getUserRole().getRolePermissions().get("userMgmtPermissions");
        if (userMgmtPermission.isCanEdit() || (userMgmtPermission.isCanEditSelf() && user.getUserId() == this.userId))
            this.lastName = lastName;
        else throw new UserMgmtException(UserMgmtException.EDIT_USER);

    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public void setEmail(String email, User user) throws UserMgmtException {
        UserMgmtPermission userMgmtPermission =
                (UserMgmtPermission) user.getUserRole().getRolePermissions().get("userMgmtPermissions");
        if (userMgmtPermission.isCanEdit() || (userMgmtPermission.isCanEditSelf() && user.getUserId() == this.userId))
            this.email = email;
        else throw new UserMgmtException(UserMgmtException.EDIT_USER);

    }

    public void setUserRole(UserRole userRole, User user) throws UserMgmtException {
        UserMgmtPermission userMgmtPermission =
                (UserMgmtPermission) user.getUserRole().getRolePermissions().get("userMgmtPermissions");
        if (userMgmtPermission.isCanEdit() || (userMgmtPermission.isCanEditSelf() && user.getUserId() == this.userId))
            this.userRole = userRole;
        else throw new UserMgmtException(UserMgmtException.EDIT_USER);

    }

    public void setEnabled(boolean enabled, User user) throws UserMgmtException {
        UserMgmtPermission userMgmtPermission =
                (UserMgmtPermission) user.getUserRole().getRolePermissions().get("userMgmtPermissions");
        if (userMgmtPermission.isCanEdit() || (userMgmtPermission.isCanEditSelf() && user.getUserId() == this.userId))
            isEnabled = enabled;
        else throw new UserMgmtException(UserMgmtException.EDIT_USER);

    }





}
