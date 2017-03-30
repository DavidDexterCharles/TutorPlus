package comp6601.src.server;

import java.beans.Statement;
import java.rmi.Naming;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Created by jason on 29/03/2017.
 */
public class Server {

    public static TutorPlusApplication tutorPlusApplication;
    public  static String SERVER_ADDR = "localhost";
    public  static String SERVER_PORT = "1099";

    public static void main(String [] args){

        try {
            System.out.println("Server starting...");
            Thread.sleep(500);
            System.out.println("Instantiating classes...");
            Thread.sleep(500);

            tutorPlusApplication = new TutorPlusApplication();
            System.out.println("Finish Instantiating classes!");
            Thread.sleep(500);
            Thread.sleep(500);
            System.out.printf("Binding the tutorplus user functions to RMI registry at port: %s ...\n",SERVER_PORT);
            Thread.sleep(500);
            Naming.rebind("//"+ SERVER_ADDR +":"+SERVER_PORT+"/TutorPlusApplication", tutorPlusApplication);
            System.out.println("Binding complete!");


//            boolean result = tutorPlusApplication.login("stu_jdoe", "adm1n123");

//            System.out.println(result);
        } catch(Exception e){

            e.printStackTrace();
        }


        /*
        try {
            Statement statement = TutorPlusApplication.dbHelper.conn();
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
