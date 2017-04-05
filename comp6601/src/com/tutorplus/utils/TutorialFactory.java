package com.tutorplus.utils;

import com.tutorplus.application_core.TutorPlusApplication;
import com.tutorplus.application_core.Tutorial;

/**
 * Created by jason on 03/04/2017.
 */
public class TutorialFactory {

    /**
     * Get a new instance of a Tutorial object
     * @return
     */
    public static Tutorial getNewInstance(){

        String tutorialId = "tut_"+ TutorPlusApplication.nextAvailTutorialId;
        TutorPlusApplication.nextAvailTutorialId++;
        Tutorial tutorial = new Tutorial(tutorialId);

        return tutorial;

    }

}
