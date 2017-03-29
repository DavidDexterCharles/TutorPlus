package comp6601.src.server;

import comp6601.src.utils.DbHelper;
import comp6601.src.utils.UserFactory;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by jason on 29/03/2017.
 */
public class Server {

    public static DbHelper dbHelper;
    public static UserManager userManager;
    public static UserFactory userFactory;
    public static TutorPlusUserInterface tutorPlusUserInterface;

    public static void main(String [] args){

        dbHelper =  new DbHelper();
        userFactory = new UserFactory();
        userManager = new UserManager();
        tutorPlusUserInterface = new TutorPlusUserInterface();

       boolean result =  tutorPlusUserInterface.login("stu_jdoe","adm1n123");

        System.out.println(result);


        /*
        try {
            Statement statement = dbHelper.conn.createStatement();
            String sql = "select * from privilege";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                System.out.println("privilege id: " + rs.getInt(1) + " privilage name: " + rs.getString("privilege_name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        */

    }
}
