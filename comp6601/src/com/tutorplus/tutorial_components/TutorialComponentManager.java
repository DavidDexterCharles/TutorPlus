package com.tutorplus.tutorial_components;

import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class TutorialComponentManager {

    private HashMap<String,TutorialComponent> registeredComponents;

    public TutorialComponentManager() {
        this.registeredComponents = new HashMap<String,TutorialComponent>();
        this.registerSystemComponents();
    }

    //initializes instances of tutorial tutorial_components
    public void registerSystemComponents(){

        CourseTutorialComponent courseTutorialComponent =  new CourseTutorialComponent();
        this.registeredComponents.put(courseTutorialComponent.getComponentName(),courseTutorialComponent);
    }

    /**
     * Gets the list of registered tutorial tutorial_components
     * @return The list of tutorial tutorial_components that are registered in the system.
     */
    public HashMap<String, TutorialComponent> getRegisteredComponents() {
        return registeredComponents;
    }

    /**
     * Gets a registered component
     * @param componentName
     * @return The specified component of the name given
     */
    public TutorialComponent getATutorialComponent(String componentName){

       return this.registeredComponents.get(componentName);
    }
}
