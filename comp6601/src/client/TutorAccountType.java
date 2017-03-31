package comp6601.src.client;

import comp6601.src.server.UserAccountType;

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
