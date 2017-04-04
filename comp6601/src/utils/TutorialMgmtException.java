package comp6601.src.utils;

/**
 *  This class provides a means to give customized remote exception message to users when making unauthorized requests
 *  on tutorials.
 * Created by jason on 03/04/2017.
 */
public class TutorialMgmtException extends Exception {



        public final static String CREATE_TUTORIAL = "User not allowed to create tutorials";
        public final static String EDIT_TUTORIAL = "User not allowed to edit tutorials";

        public TutorialMgmtException(String message) {
            super(message);
        }

}