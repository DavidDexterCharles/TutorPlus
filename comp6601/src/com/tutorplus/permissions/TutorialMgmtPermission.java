package com.tutorplus.permissions;

import java.util.HashMap;

/**
 * Created by jason on 02/04/2017.
 */
public class TutorialMgmtPermission extends TutorPlusPermission {

    private static HashMap<String,Boolean>permissions;

    private boolean canView = false;
    private boolean canPublish = false;
    private boolean canStart = false;
    private boolean canEnd = false;


    public TutorialMgmtPermission(boolean canCreate, boolean canEdit, boolean canDelete,
                                  boolean canView, boolean canPublish, boolean canStart, boolean canEnd) {

        this.canCreate = canCreate;
        this.canEdit = canEdit;
        this.canDelete = canDelete;
        this.canView = canView;
        this.canPublish = canPublish;
        this.canStart = canStart;
        this.canEnd = canEnd;

        permissions = new HashMap<String,Boolean>();

    }

    //==================getters=======================

    public boolean isCanView() {
        return canView;
    }

    public boolean isCanPublish() {
        return canPublish;
    }

    public boolean isCanStart() {
        return canStart;
    }

    public boolean isCanEnd() {
        return canEnd;
    }



    @Override
    public String toString() {
        return "TutorialMgmtPermission{" +
                "canView=" + canView +
                ", canCreate=" + canCreate+
                ", canEdit=" + canEdit+
                ", canDelete=" + canDelete+
                ", canPublish=" + canPublish +
                ", canStart=" + canStart +
                ", canEnd=" + canEnd +
                '}';
    }

    @Override
    public HashMap<String, Boolean> getPermissionList() {

        permissions.put("canCreate",canCreate);
        permissions.put("canDelete",canDelete);
        permissions.put("canEdit",canEdit);
        permissions.put("canView",canView);
        permissions.put("canPublish",canPublish);
        permissions.put("canStart",canStart);
        permissions.put("canStart",canEnd);

        return permissions;
    }
}
