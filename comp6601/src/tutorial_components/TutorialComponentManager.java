package comp6601.src.components;

import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class ComponentManager {

    private HashMap<String,TutorialComponent> registeredComponents;

    public ComponentManager() {
        this.registeredComponents = new HashMap<String,TutorialComponent>();
    }

    //initializes instances of tutorial components
    public void registerSystemComponents(){

    }

    /**
     * Gets the list of registered tutorial components
     * @return The list of tutorial components that are registered in the system.
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
