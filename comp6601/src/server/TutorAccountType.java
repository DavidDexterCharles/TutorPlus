package comp6601.src.server;

import java.util.ArrayList;

/**
 * Created by jason on 31/03/2017.
 */
public class TutorAccountType extends UserAccountType {

    public TutorAccountType() {
        this.accountPriviledges = new ArrayList<>();
        this.accountTypeName = "student";
    }
}
