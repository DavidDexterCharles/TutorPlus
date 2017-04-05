package com.tutorplus.roles;

import com.tutorplus.permissions.TutorPlusPermission;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public abstract class UserRole implements Serializable {

//    private int accountTypeId;
    protected String userRoleName;
    protected HashMap<String, TutorPlusPermission>rolePermissions;


    /**
     * Adds a new TutorPlus permission to a user role.
     * @param permissionName
     * @param tutorPlusPermission
     */
    public void addPermissions(String permissionName,TutorPlusPermission tutorPlusPermission){

            this.rolePermissions.put(permissionName,tutorPlusPermission);
    }

    /**
     *
     * @return A list with all the permissions associated with a user role
     */
    public HashMap<String, TutorPlusPermission> getRolePermissions() {
        return rolePermissions;
    }

    public String getUserRoleName() {
        return userRoleName;
    }
}
