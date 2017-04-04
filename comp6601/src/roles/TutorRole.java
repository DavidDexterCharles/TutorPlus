package comp6601.src.roles;

import comp6601.src.permissions.TutorPlusPermission;
import comp6601.src.permissions.TutorialMgmtPermission;
import comp6601.src.permissions.UserMgmtPermission;

import java.util.HashMap;

/**
 * Created by jason on 31/03/2017.
 */
public class TutorRole extends UserRole {

    public TutorRole() {

        this.rolePermissions = new HashMap<String, TutorPlusPermission>();
        HashMap<String, TutorPlusPermission> permissions = new HashMap<>();

        //Customize permissions for the tutor role
        boolean canCreateUser = false;
        boolean canEditUser = false;
        boolean canDeleteUser = false;
        boolean canEditSelf = true;
        boolean canLogin = true;
        boolean canSuspendUser = true;

        UserMgmtPermission userMgmtPermissions = new UserMgmtPermission(canCreateUser,canEditUser,canDeleteUser,canEditSelf,
                canLogin,canSuspendUser);

        boolean canView = true;
        boolean canStart = true;
        boolean canEnd = true;
        boolean canPublish = true;
        boolean canCreateTutorial = true;
        boolean canDeleteTutorial = true;
        boolean canEditTutorial = true;

        TutorialMgmtPermission tutorialMgmtPermissions = new TutorialMgmtPermission(canCreateTutorial,canEditTutorial,
                canDeleteTutorial,canView,canPublish,canStart,canEnd);



        permissions.put("userMgmtPermissions", userMgmtPermissions);
        permissions.put("tutorialMgmtPermissions", tutorialMgmtPermissions);
        this.rolePermissions = permissions;
        this.userRoleName = "tutor";
    }
}
