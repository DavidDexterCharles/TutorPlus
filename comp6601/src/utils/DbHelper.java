package comp6601.src.utils;

import comp6601.src.server.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by jason on 29/03/2017.
 */
public class DbHelper {
    private Connection conn;

    public  DbHelper(){

        String user = "comp6601";
        String password = "adm1n123";

        JDBCConnection jdbcConnection = new JDBCConnection(user, password);
        conn = jdbcConnection.conn;
    }

    /**
     *Get a list of all the privileges in tutor plus
     * @return A string array list with all the privilege types
     */
    public ArrayList<String> getPrivileges(){

        ArrayList<String> privilegeTypes = new ArrayList<>();

        try {
            Statement statement = conn.createStatement();
            String sql = "select privilege_name from privilege";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){

                privilegeTypes.add(rs.getString(1));

            }
            return privilegeTypes;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            return privilegeTypes;
        }
    }

    /**
     *Gets a the data of a user of tutor plus
     * @param username
     * @return An object that contains all the data about a given user
     */
    public HashMap getUserData(String username){

//        ArrayList<Object> userData = new ArrayList<>();
        ArrayList<String> userPrivilegeTypes = new ArrayList<>();
        HashMap<String,Object> userData = new HashMap();


        try {
            Statement statement = conn.createStatement();
            String sql = "select tu.user_id,tu.first_name, tu.last_name, uc.account_name, p.privilege_name,tu.username," +
                    " tu.password,tu.email\n" +
                    "from useraccountprivilege ucp \n" +
                    "join privilege p on ucp.privilege_id = p.privilege_id\n" +
                    "join useraccount uc on ucp.account_id = uc.account_id \n" +
                    "join t_user tu on ucp.account_id = tu.user_account_id\n" +
                    "where tu.username = '"+username+"'";
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()){
                userData.put("userId",rs.getInt(1));
                userData.put("firstName",rs.getString(2));
                userData.put("lastName",rs.getString(3));
                userData.put("accountName",rs.getString(4));
                userData.put("username",rs.getString(6));
                userData.put("password",rs.getString(7));
                userData.put("email",rs.getString(8));

                userPrivilegeTypes.add(rs.getString(5));

                while (rs.next()) userPrivilegeTypes.add(rs.getString(5));

                userData.put("privileges",userPrivilegeTypes);
            }

            return userData;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            return userData;
        }
        
    }

}
