package com.tutorplus.permissions;

import java.io.Serializable;
import java.util.HashMap;

/**
 * Created by jason on 02/04/2017.
 */
public abstract class TutorPlusPermission implements Serializable {

    protected boolean canCreate = false;
    protected boolean canDelete = false;
    protected boolean canEdit = false;

    /**
     * Get a list of permissions from the permission type
     * @return
     */
    public abstract HashMap<String, Boolean>getPermissionList();


    public boolean isCanCreate() {
        return canCreate;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }


}
