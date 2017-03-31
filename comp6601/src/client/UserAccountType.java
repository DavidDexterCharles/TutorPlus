package comp6601.src.client;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jason on 29/03/2017.
 */
public abstract class UserAccountType implements Serializable {

//    private int accountTypeId;
    protected String accountTypeName;
    protected ArrayList<String> accountPriviledges;



    public void addPrivileges (ArrayList<String> accountPrivileges){

        for (String privilege: accountPrivileges) {
            this.accountPriviledges.add(privilege);
        }
    }

    /**
     *
     * @return A list with all the privilages associated with an account type.
     */
    public ArrayList<String> getAccountPriviledges() {
        return accountPriviledges;
    }

    public String getAccountTypeName() {
        return accountTypeName;
    }
}
