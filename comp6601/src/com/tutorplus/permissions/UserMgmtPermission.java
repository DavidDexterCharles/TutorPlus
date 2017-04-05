package com.tutorplus.permissions;

import java.util.HashMap;

/**
 * Created by jason on 02/04/2017.
 */
public class UserMgmtPermission extends TutorPlusPermission {
    private static HashMap<String,Boolean>permissions;


    private boolean canEditSelf = false;
    private boolean canLogin = false;
    private boolean canSuspendUser = false;


    public UserMgmtPermission(boolean canCreate, boolean canEdit, boolean canDelete,
                              boolean canEditSelf, boolean canLogin, boolean canSuspendUser) {

        this.canCreate = canCreate;
        this.canEdit = canEdit;
        this.canDelete = canDelete;
        this.canEditSelf =canEditSelf;
        this.canLogin = canLogin;
        this.canSuspendUser = canSuspendUser;

        permissions = new HashMap<String,Boolean>();

    }
//======================Getters==================

    public boolean isCanEditSelf() {
        return canEditSelf;
    }

    public boolean isCanLogin() {
        return canLogin;
    }

    public boolean isCanSuspendUser() {
        return canSuspendUser;
    }



    @Override
    public String toString() {
        return "UserMgmtPermission{" +
                "canCreate=" + canCreate +
                ", canDelete=" + canDelete +
                ", canEdit=" + canEdit +
                ", canEditSelf=" + canEditSelf +
                ", canLogin=" + canLogin +
                '}';
    }

    @Override
    public HashMap<String, Boolean> getPermissionList() {

        permissions.put("canCreate", canCreate);
        permissions.put("canDelete", canDelete);
        permissions.put("canEdit", canEdit);
        permissions.put("canEditSelf",canEditSelf);
        permissions.put("canLogin",canLogin);
        return permissions;
    }
}
