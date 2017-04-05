package com.tutorplus.tutorial_components;

/**
 * Created by jason on 29/03/2017.
 */
public abstract class TutorialComponent {

    private String componentName;

    /**
     * Get the name of a component
     * @return
     */
public abstract String getComponentName();

    /**
     * Verifies if a component is registered
     * @return
     */
    public abstract boolean isRegisteredComponent();

}
