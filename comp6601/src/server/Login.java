package comp6601.src.server;

/**
 * Created by jason on 29/03/2017.
 */
public class Login {

    private String username;
    private String password;

    public Login(String username, String password){

        this.username = username;
        this.password = password;
    }

    public Login(){

    }

    public boolean validate(String username, String password){
        boolean result = false;
        if (this.username.equalsIgnoreCase(username) && this.password.equalsIgnoreCase(password)){

            result = true;
        }

        this.password = null;
        this.username = null;
        return result;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
