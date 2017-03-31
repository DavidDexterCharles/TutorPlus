package comp6601.src.server;

import java.util.ArrayList;

/**
 * Created by jason on 31/03/2017.
 */
public class StudentAccountType extends UserAccountType {

    public StudentAccountType ( ){
        this.accountPriviledges = new ArrayList<>();
        this.accountTypeName = "student";

    }
}
