/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tutorplus.roles;

import com.tutorplus.permissions.TutorPlusPermission;
import com.tutorplus.permissions.TutorialMgmtPermission;
import com.tutorplus.permissions.UserMgmtPermission;
import java.util.HashMap;

/**
 *
 * @author jason
 */
public class AdminRole extends UserRole {
    
    public AdminRole(){
        
         this.rolePermissions = new HashMap<String, TutorPlusPermission>();
        HashMap<String, TutorPlusPermission> permissions = new HashMap<>();

        //Customize permissions for the tutor role
        boolean canCreateUser = true;
        boolean canEditUser = true;
        boolean canDeleteUser = true;
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
        this.userRoleName = "admin";
    }
    
}
