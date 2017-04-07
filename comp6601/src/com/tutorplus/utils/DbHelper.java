package com.tutorplus.utils;

import com.tutorplus.application_core.QuestionOptions;
import com.tutorplus.application_core.TopicQuestions;
import com.tutorplus.application_core.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbHelper {
    public Connection conn;

    public  DbHelper(){

        String user = "TPLUS";//"tutorplus";
        String password ="TPLUS"; //"adm1n123";

        JDBCConnection jdbcConnection = new JDBCConnection(user, password);
        conn = jdbcConnection.conn;
    }

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
            
            String sql = "select u.userid, u.account_id, u.firstname, "
                    + "u.lastname, u.email, u.status_id, u.password, u.othername\n" +
                            "from users u\n" +
                            "where u.email = '"+username+"'";
            
            ResultSet rs = statement.executeQuery(sql);
            if (rs.next()){
                userData.put("userId",rs.getString(1));
                userData.put("accountType",rs.getString(2));
                userData.put("firstName",rs.getString(3));
                userData.put("lastName",rs.getString(4));
                userData.put("email",rs.getString(5));
                userData.put("status",rs.getString(6));
                userData.put("password",rs.getString(7));
                userData.put("otherName",rs.getString(8));

            }

            return userData;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            return userData;
        }
        
    }
    
    
    public boolean saveUser(User user){
        try {

            String userAccountId;
            if (user.getUserRole().getUserRoleName().equalsIgnoreCase("student")){
                userAccountId = "ST";
            }
            else {
                userAccountId  = "TT";
            }
            System.out.println(user.login.getUsername());
            System.out.println(user.login.getPassword());
            String saveUserSql = "INSERT INTO users(userid,account_id,firstname"
                    + ",lastname, othername,email,status_ID,password)\n" +
                    "VALUES (?,?,?,?,?,?,?,?)\n";
            
            int userId = Integer.parseInt(user.getUserId());
            PreparedStatement saveUser = conn.prepareStatement(saveUserSql);
            saveUser.setInt(1, userId);
            saveUser.setString(2, userAccountId);
            saveUser.setString(3, user.getFirstName());
            saveUser.setString(4, user.getLastName());
            saveUser.setString(5, user.getOtherName());
            saveUser.setString(6, user.getEmail());
            saveUser.setString(7, "A");
            saveUser.setString(8, user.login.getPassword());
            
            
            saveUser.execute();

            return true;

        }catch (Exception e){

            e.printStackTrace();
           return false;
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

    public HashMap<String,TopicQuestions> getTopicQuestions (String topicId){
        
        try {
            Statement statement = conn.createStatement();
            HashMap<String,TopicQuestions> topicQuestionsData = new HashMap();

             topicId = topicId.toUpperCase();
            String sql = "select c.course_number, c.name, ct.topic_id, ct.topic_name,"
                    + " q.question_id, q.questions as question, q.answer_id as answer\n" +
                        "from courses c \n" +
                        "join course_topics ct on c.course_number = ct.course_number\n" +
                        "join questions q on q.topic_id = ct.topic_id\n" +
                        "where ct.topic_id = '"+topicId+"'\n" +
                        "order by c.course_number, q.question_id";
                    


                  ResultSet rs = statement.executeQuery(sql);
                  
            while (rs.next()) {

                    String courseNumber = rs.getString(1);
                    String courseName = rs.getString(2);
                    String topicName = rs.getString(4);
                    String questionId = rs.getString(5);
                    String question = rs.getString(6);
                    String answer = rs.getString(7);
                    
                    
                    TopicQuestions topicQuestions = 
                            new TopicQuestions(courseNumber, courseName, topicId,
                                    topicName, questionId, question, answer);
                    
                    topicQuestionsData.put(topicId +"_"+ questionId,topicQuestions);
            }
            
            return topicQuestionsData;
        }catch (SQLException e){
            return null;
        }
             
    }
    
    public  HashMap<String,QuestionOptions> getQuestionOptions (String topicId){
        

        try {
            Statement statement = conn.createStatement();
            HashMap<String,QuestionOptions> questionOptionsData = new HashMap();

             topicId = topicId.toUpperCase();
            String sql = "select ct.topic_id, q.question_id,  q.answer_id as answer, o.answer_id as option_id, o.answer \"OPTION\"\n" +
                    "from courses c \n" +
                    "join course_topics ct on c.course_number = ct.course_number\n" +
                    "join questions q on q.topic_id = ct.topic_id\n" +
                    "join options o on o.topic_id= q.topic_id and o.question_id = q.question_id\n" +
                    "where ct.topic_id = '"+topicId+"'\n" +
                    "order by c.course_number, o.question_id,o.answer_id";
                    


                  ResultSet rs = statement.executeQuery(sql);
                  
            while (rs.next()) {

                String questionId = rs.getString(2);
                String answer = rs.getString(3);
                String optionId = rs.getString(4);
                String option = rs.getString(5);
                
                
                QuestionOptions questionOption = 
                        new QuestionOptions(optionId, option, questionId, answer, topicId);
                
                questionOptionsData.put(topicId +"_"+ questionId + "_"+optionId,questionOption);

            }

            
            return questionOptionsData;
        }catch (SQLException e){
            return null;
        }
        
        
    }
    
    public boolean updateUser(User user){
        
        boolean firstLine = false; // first line is not set as yet
        String sql = "update users set\n";
        
        if (user.getFirstName() != null) {
            sql += "firstname = ?\n";
            firstLine = true;
        }
        if (user.getLastName() != null){    
            if (firstLine) {
                 sql += ",lastname = ?\n";
            }
            else {
                sql += "lastname = ?\n";
                firstLine = true;
            }
        }
        if (user.getOtherName() != null) {
            if (firstLine) {
                 sql += ",othername = ?\n";
            }
            else {
                sql += "othername = ?\n";
                firstLine = true;
            }
        }
        if (user.getEmail() != null) {

            if (firstLine){ 
                sql += ",email = ?\n";
            }
            else {
                sql += "email = ?\n";
                firstLine = true;

            }
        }
        if (user.login.getPassword() != null) {
            if (firstLine){
                sql += ",password = ?\n";
            }
            else {

                sql += "password = ?\n";

            }
        }
        
        sql += "where userid= '"+user.getUserId()+"'";
        System.out.println(sql);
        try {
            int posCounter  = 0;
            PreparedStatement updateStaement = conn.prepareStatement(sql);
            if (user.getFirstName() != null){
                updateStaement.setString(++posCounter,user.getFirstName());
                        System.out.println(posCounter);

            }
            if (user.getLastName()!= null) {
                updateStaement.setString(++posCounter,user.getLastName());
                                        System.out.println(posCounter);

            }
            if (user.getOtherName()!= null) {
                updateStaement.setString(++posCounter,user.getOtherName());
                                        System.out.println(posCounter);

            }
            if (user.getEmail()!= null) {
                updateStaement.setString(++posCounter,user.getEmail());
                                        System.out.println(posCounter);

            }
            if (user.login.getPassword()!= null) {
                updateStaement.setString(++posCounter,user.login.getPassword());
                                        System.out.println(posCounter);

            }
            updateStaement.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } 
       
    }
    
    
    /*Added by David*/
    
     public String  getMyCourses(User userInfo,String request) {
        try {
            Statement statement = conn.createStatement();
            try {
                //            HashMap<String,String> data = new HashMap();
                // ArrayList<HashMap<String, String>> mycourses= new ArrayList<HashMap<String, String>>();;
                
                String sql ="select * from STUDENT_COURSE SC,COURSES C WHERE SC.USERID="+userInfo.getUserId()+" AND SC.COURSE_NUMBER=C.COURSE_NUMBER";
                String s="";
                
                
                ResultSet rs = statement.executeQuery(sql);
                
                while (rs.next()) {
                    s=rs.getString("USERID")+"-"+rs.getString("COURSE_NUMBER")+"-"+rs.getString("NAME")+"~"+s;
                }
                
                
                try { rs.close(); } catch (Exception ignore) { }
                return s;
            } catch (SQLException ex) {
                Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                try { statement.close(); } catch (Exception ignore) { }
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
         return "getMyCourses failed";

    }
    
       public String  getAllCourses() {
        try {
            Statement statement = conn.createStatement();
            try {
                
                
                String sql ="select * from COURSES";
                String s="";
                
                
                ResultSet rs = statement.executeQuery(sql);
                
                while (rs.next()) {
                    s=rs.getString("COURSE_NUMBER")+"-"+rs.getString("NAME")+"~"+s;
                }
                
                
                try { rs.close(); } catch (Exception ignore) { }
                return s;
            } catch (SQLException ex) {
                Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                try { statement.close(); } catch (Exception ignore) { }
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
          return "getAllCourses failed";
    }
    
     public String  getCourseTopics(String Data) {
        try {
            Statement statement = conn.createStatement();
            try {
                
                
                String sql ="select * from course_topics where course_number='"+Data+"'";
                String s="";
                
                ResultSet rs = statement.executeQuery(sql);
                
                while (rs.next()) {
                    s=rs.getString("COURSE_NUMBER")+"-"+rs.getString("TOPIC_NAME")+"-"+rs.getString("TOPIC_ID")+"~"+s;
                }
                
                try { rs.close(); } catch (Exception ignore) { }
                
                return s;
            } catch (SQLException ex) {
                Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                try { statement.close(); } catch (Exception ignore) { }
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
           return "getCourseTopics faled";
    }
     public String  registerForCourse(User userInfo,String Data) {
        try {
            Statement statement = conn.createStatement();
            try {
                
                
                String sql ="insert into STUDENT_COURSE (USERID, COURSE_NUMBER, STATUS_ID) values ('"+userInfo.getUserId()+"','"+Data+"','A')";
                String s="success";
                
                ResultSet rs = statement.executeQuery(sql);
                
//                while (rs.next()) {
//                    s=rs.getString("COURSE_NUMBER")+"-"+rs.getString("TOPIC_NAME")+"~"+s;
//                }
                
                try { rs.close(); } catch (Exception ignore) { }
                
                return s;
            } catch (SQLException ex) {
                Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                try { statement.close(); } catch (Exception ignore) { }
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
           return "registerForCourse failed";
    }
    
     public String  deregisterCourse(User userInfo,String Data) {
        try {
            Statement statement = conn.createStatement();
            try {
                
                
                String sql ="DELETE FROM STUDENT_COURSE WHERE USERID = '"+userInfo.getUserId()+"' and COURSE_NUMBER='"+Data+"'";
                String s="success";
                
                ResultSet rs = statement.executeQuery(sql);
                
                try { rs.close(); } catch (Exception ignore) { }
                
                return s;
            } catch (SQLException ex) {
                Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
            }finally {
                try { statement.close(); } catch (Exception ignore) { }
            }
         
        } catch (SQLException ex) {
            Logger.getLogger(DbHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
           return "deregisterCourse failed";
    }
    
    
    
    
    

}
