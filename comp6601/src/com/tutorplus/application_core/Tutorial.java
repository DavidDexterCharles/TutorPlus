package com.tutorplus.application_core;

import com.tutorplus.permissions.TutorialMgmtPermission;
import com.tutorplus.tutorial_components.TutorialComponent;
import com.tutorplus.utils.TutorialMgmtException;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class Tutorial implements Serializable{

    protected String tutorialId;
    protected String tutorialName;
    protected String createdBy;
    protected String updatedBy;
    protected String tutorialType;
    protected boolean isPublished;
    protected Date createdDate;
    protected Date publishedDate;
    protected HashMap<String,TutorialComponent> components;

    public Tutorial(String tutorialId, String tutorialName, String createdBy,
                    String tutorialType, boolean isPublished,String componentName,
                    TutorialComponent tutorialComponent) {

        components = new HashMap<String,TutorialComponent>();
        this.tutorialId = tutorialId;
        this.tutorialName = tutorialName;
        this.createdBy = createdBy;
        this.tutorialType = tutorialType;
        this.isPublished = isPublished;
        this.components.put(componentName,tutorialComponent);
    }

    public Tutorial(String tutorialId) {
        this.tutorialId = tutorialId;
    }
    public Tutorial(){

    }

    //=======================getters====================

    public String getTutorialId() {
        return tutorialId;
    }

    public String getTutorialName() {
        return tutorialName;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public String getTutorialType() {
        return tutorialType;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public HashMap<String, TutorialComponent> getComponents() {
        return components;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    //==========================Setters=========================

//    public void setTutorialName(String tutorialName, User user) throws TutorialMgmtException {
//        TutorialMgmtPermission tutorialMgmtPermissions =
//                (TutorialMgmtPermission) user.getUserRole().getRolePermissions().get("tutorialMgmtPermissions");
//      if (tutorialMgmtPermissions.isCanEdit())  this.tutorialName = tutorialName;
//      else throw new TutorialMgmtException(TutorialMgmtException.EDIT_TUTORIAL);
//    }
//
//    public void setTutorialType(String tutorialType, User user) throws TutorialMgmtException {
//        TutorialMgmtPermission tutorialMgmtPermissions =
//                (TutorialMgmtPermission) user.getUserRole().getRolePermissions().get("tutorialMgmtPermissions");
//        if (tutorialMgmtPermissions.isCanEdit()) this.tutorialType = tutorialType;
//        else throw new TutorialMgmtException(TutorialMgmtException.EDIT_TUTORIAL);
//
//    }
//
//    public void setPublished(boolean published, User user) throws TutorialMgmtException {
//        TutorialMgmtPermission tutorialMgmtPermissions =
//                (TutorialMgmtPermission) user.getUserRole().getRolePermissions().get("tutorialMgmtPermissions");
//        if (tutorialMgmtPermissions.isCanEdit()) isPublished = published;
//        else throw new TutorialMgmtException(TutorialMgmtException.EDIT_TUTORIAL);
//
//    }
//
//    public void setComponents(HashMap<String, TutorialComponent> components, User user) throws TutorialMgmtException {
//        TutorialMgmtPermission tutorialMgmtPermissions =
//                (TutorialMgmtPermission) user.getUserRole().getRolePermissions().get("tutorialMgmtPermissions");
//        if (tutorialMgmtPermissions.isCanEdit()) this.components = components;
//        else throw new TutorialMgmtException(TutorialMgmtException.EDIT_TUTORIAL);
//
//    }

    @Override
    public String toString() {
        return "Tutorial{" +
                "tutorialId='" + tutorialId + '\'' +
                ", tutorialName='" + tutorialName + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", tutorialType='" + tutorialType + '\'' +
                ", isPublished=" + isPublished +
                '}';
    }

    /**
     * Put additional tutorial_components in this tutorial
     * @param componentName
     */
//    public void addComponents(String componentName) throws Exception {
//
//        TutorialComponent tutorialComponent = TutorPlusApplication.tutorialComponentManager.getATutorialComponent(componentName);
//        if (tutorialComponent != null) this.tutorial_components.put(componentName,tutorialComponent);
//        else throw new Exception("Tutorial Component not available to add");
//    }
    /**
     * Remove a component from this tutorial
     * @param componentName
     */
//    public void removeComponent(String componentName) throws Exception {
//        TutorialComponent tutorialComponent = this.tutorial_components.get(componentName);
//        if (tutorialComponent != null) this.tutorial_components.remove(componentName);
//        else throw new Exception("Tutorial Component not available to remove");
//
//    }


}
