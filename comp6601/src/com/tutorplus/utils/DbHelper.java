package com.tutorplus.utils;

import com.tutorplus.application_core.Tutorial;
import com.tutorplus.application_core.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;


public class DbHelper {
    public Connection conn;

    public  DbHelper(){

        String user = "system";//"tutorplus";
        String password ="Flowerz*27"; //"adm1n123";

        JDBCConnection jdbcConnection = new JDBCConnection(user, password);
        conn = jdbcConnection.conn;
    }

    /**
     *Get a list of all the privileges in tutor plus
     * @return A string array list with all the privilege types
     */
    /*
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
        */
    /**
     *Gets a the data of a user of tutor plus
     * @param username
     * @return An object that contains all the data about a given user
     */
    public HashMap getUserData(String username){

        ArrayList<String> userPrivilegeTypes = new ArrayList<>();
        HashMap<String,Object> userData = new HashMap();


        try {
            Statement statement = conn.createStatement();
//            String sql = "select tu.userid,tu.firstname, tu.lastname, uc.acount_id," +
//                    " tu.password,tu.email\n" +
//                    "join account uc on ucp.account_id = uc.account_id \n" +
//                    "join users tu on ucp.account_id = tu.account_id\n" +
//                    "where tu.username = '"+username+"'";
            
            String sql = "select tu.userid,tu.firstname, tu.lastname, a.account_id,tu.password,tu.email" +
                        "from account a, users tu" +
                        "where a.account_id = tu.account_id" +
                        "and tu.email = 'jpeters@gmail.com'";
            
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()){
                userData.put("userid",rs.getString(1));
                userData.put("firstname",rs.getString(2));
                userData.put("lastname",rs.getString(3));
                userData.put("account_id",rs.getString(4));
                userData.put("password",rs.getString(6));
                userData.put("email",rs.getString(8));

                userPrivilegeTypes.add(rs.getString(5));

                while (rs.next()) userPrivilegeTypes.add(rs.getString(5));

//                userData.put("privileges",userPrivilegeTypes);
            }

            return userData;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            return userData;
        }
        
    }

    public void saveUser(User user){
        try {

            int userAccountId;
            if (user.getUserRole().getUserRoleName().equalsIgnoreCase("student")){
                userAccountId = 1;
            }
            else {
                userAccountId =2;
            }
            String saveUserSql = "INSERT INTO users\n" +
                    "VALUES (?,?,?,?,?,?,?,?)\n";

            PreparedStatement saveUser = conn.prepareStatement(saveUserSql);
            saveUser.setString(1, user.getUserId());
            saveUser.setInt(2, userAccountId);
            saveUser.setString(3, user.getFirstName());
            saveUser.setString(4, user.getLastName());
            saveUser.setString(5, "");
            saveUser.setString(6, user.getEmail());
            saveUser.setString(7, user.login.getUsername());
            saveUser.setString(8, user.login.getPassword());
            saveUser.execute();



        }catch (Exception e){

            e.printStackTrace();

        }

    }

    public int getNumberOfUsers(){

        try {
            int numberOfUsers = 0;
            Statement statement = conn.createStatement();
            String sql = "select count(*) from users";

            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                numberOfUsers = rs.getInt(1);
            }
            return numberOfUsers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getNumberOfTutorials(){

        try {
            int numberOfUsers = 0;
            Statement statement = conn.createStatement();
            String sql = "select count(*) from tutorial";

            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()) {
                numberOfUsers = rs.getInt(1);
            }
            return numberOfUsers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public void saveTutorial(Tutorial tutorial){

    }

}
