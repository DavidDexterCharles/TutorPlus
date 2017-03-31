package comp6601.src.server;

import java.io.Serializable;


/**
 * Created by jason on 29/03/2017.
 */
public class Privilege implements Serializable {


    private boolean permissionView = false;
    private boolean permissionExecute = false;
    private boolean permissionDelete = false;
    private boolean permissionModify = false;
    private boolean permissionFullControl = false;


    public Privilege(boolean permissionView, boolean permissionExecute,
                     boolean permissionDelete, boolean permissionModify, boolean permissionFullControl) {
        this.permissionView = permissionView;
        this.permissionExecute = permissionExecute;
        this.permissionDelete = permissionDelete;
        this.permissionModify = permissionModify;
        this.permissionFullControl = permissionFullControl;
    }

    public boolean isPermissionView() {
        return permissionView;
    }

    public boolean isPermissionExecute() {
        return permissionExecute;
    }

    public boolean isPermissionDelete() {
        return permissionDelete;
    }

    public boolean isPermissionModify() {
        return permissionModify;
    }

    public boolean isPermissionFullControl() {
        return permissionFullControl;
    }
}

