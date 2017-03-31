package comp6601.src.client;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by jason on 29/03/2017.
 */
public class UserAccountType implements Serializable {

//    private int accountTypeId;
    private String accountTypeName;
    private ArrayList<String> accountPriviledges;

    public UserAccountType(String accountTypeName, ArrayList<String> accountPrivileges){
        this.accountPriviledges = new ArrayList<>();
//        this.accountTypeId = accountTypeId;
        this.accountTypeName = accountTypeName;

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
