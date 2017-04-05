package com.tutorplus.application_core;

import com.tutorplus.tutorial_components.TutorialComponent;
import com.tutorplus.utils.TutorialFactory;
import com.tutorplus.utils.TutorialMgmtException;

import java.util.*;

/**
 * Created by jason on 29/03/2017.
 */
public class TutorialManager {


    private ArrayList<Tutorial> tutorialList ;

    /**
     * Get the list of tutorials in the system
     * @return
     */
    public ArrayList<Tutorial> getTutorialList() {
        return tutorialList;
    }

    public void createTutorial (String tutorialName,
                                String tutorialType,boolean isPublished,
                                ArrayList<String> tutorialComponents,User user) throws TutorialMgmtException {



        Tutorial tutorial = TutorialFactory.getNewInstance();

        //Adding tutorial components
        //Looks up the registered components on the system. and compares with the names submitted to create the tutorial.
        int matchFoundCompCounter =0;
        HashMap registeredComponents = TutorPlusApplication.tutorialComponentManager.getRegisteredComponents();
        Iterator iterator = registeredComponents.entrySet().iterator();

        for (String tutorialComponentName:tutorialComponents) {

            while (iterator.hasNext()){

                Map.Entry componentNameAndComponentObj = (Map.Entry) iterator.next();
                String componentName  = (String) componentNameAndComponentObj.getKey();
                TutorialComponent tutorialComponent = (TutorialComponent) componentNameAndComponentObj.getValue();

                if (componentName.equalsIgnoreCase(tutorialComponentName)){
                    matchFoundCompCounter++;
                    tutorial.components.put(componentName,tutorialComponent);

                }

            }
        }
        if(matchFoundCompCounter != tutorialComponents.size())
            throw new TutorialMgmtException(TutorialMgmtException.MISSING_TUTORIAL_COMP);

        tutorial.tutorialName = tutorialName;
        tutorial.createdBy = user.login.getUsername();
        tutorial.tutorialType = tutorialType;
        tutorial.isPublished = isPublished;
        tutorial.createdDate = new Date();
        if (isPublished) tutorial.publishedDate = new Date();

        //sotre in tutorial list
        this.tutorialList.add(tutorial);

        TutorPlusApplication.dbHelper.saveTutorial(tutorial);

    }
    public void editTutorial (){



    }
    public void deleteTutorial (){



    }
    public void publishTutorial (){



    }
    public Tutorial getAllTutorials (){

        return null;
    }


}
