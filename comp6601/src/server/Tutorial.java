package comp6601.src.server;

import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class Tutorial {

    private String tutorialId;
    private String tutorialName;
    private String createdBy;
    private String tutorialType;
    private boolean isPublished;
    private HashMap<String,TutorialComponent> components;

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

    public Tutorial() {
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

    //==========================Setters=========================

    public void setTutorialName(String tutorialName) {
        this.tutorialName = tutorialName;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public void setTutorialType(String tutorialType) {
        this.tutorialType = tutorialType;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public void setComponents(HashMap<String, TutorialComponent> components) {
        this.components = components;
    }


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
     * Put additional components in this tutorial
     * @param componentName
     */
    public void addComponents(String componentName) throws Exception {

        TutorialComponent tutorialComponent = TutorPlusApplication.componentManager.getATutorialComponent(componentName);
        if (tutorialComponent != null) this.components.put(componentName,tutorialComponent);
        else throw new Exception("Tutorial Component not available to add");
    }
    /**
     * Remove a component from this tutorial
     * @param componentName
     */
    public void removeComponent(String componentName) throws Exception {
        TutorialComponent tutorialComponent = this.components.get(componentName);
        if (tutorialComponent != null) this.components.remove(componentName);
        else throw new Exception("Tutorial Component not available to remove");

    }


}
