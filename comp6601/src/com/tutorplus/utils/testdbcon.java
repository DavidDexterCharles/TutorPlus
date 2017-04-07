package com.tutorplus.utils;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author David Charles
 */
public class testdbcon {
 
    private static Connection con;
    private  static Statement st;
    private static ResultSet rs;
    //PreparedStatement pst = null;
      public static void main(String args[]) {
      
      System.out.println(ListTutors());
      
      }
   
     
    public testdbcon(){
        CreateConnection();
     }
     public boolean CreateConnection() {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:8080/tutorplus","root","1q2w3e");
            st = con.createStatement();
            return true;
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex);
              JOptionPane.showMessageDialog(null,"Error occured in database connection");
            return false;
        }
    }
    
    public static String ListTutors(){
      String query="SELECT Account_Type FROM `account` WHERE 1";
      String s="";
        try {
            rs = st.executeQuery(query);
        
          
            
	    while(rs.next())
            {

			 s = s + rs.getString("Account_Type");
	    }
      
        }catch(Exception ex)
        {
            System.out.println(ex);                                                                                                
        }
        return s;
    }
    
}
