package com.aadhi.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;

public class LoginDao {
    private static final String URL = "jdbc:mysql://localhost:3306/client_data";
    private static final String USER = "root";
    private static final String PASSWORD = "123456";

    // Method to check if the login credentials are correct
    public boolean checkLogin(String c_username, String c_password) throws SQLClientInfoException
    {
        String sql_login = "SELECT * FROM users WHERE username=? AND password=?";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            PreparedStatement st = con.prepareStatement(sql_login);
        
            
            st.setString(1, c_username);
            st.setString(2, c_password);
            ResultSet rs = st.executeQuery();
                
            return rs.next();  // Returns true if a row exists
            
        }
        catch (Exception e) 
        {
            System.out.println("Login error: " + e+"  please signin and try again");
            
        }
        return false;
    }

    // Method to sign up a new user
    public boolean checkSignup(String c_username, String c_password) throws SQLClientInfoException
    {
        String sql_check = "SELECT * FROM users WHERE username=?";
        String sql_signup = "INSERT INTO users (username, password) VALUES (?, ?)";
        try 
        {
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            // Check if the username already exists
        	
            PreparedStatement stCheck = con.prepareStatement(sql_check);
            
            stCheck.setString(1, c_username);
                
            ResultSet rs = stCheck.executeQuery(); 
                
            if (rs.next()) 
            {
            	return false;  // Username already exists 
            }
                
            

            // Insert new user
            try (PreparedStatement stInsert = con.prepareStatement(sql_signup)) 
            {
                stInsert.setString(1, c_username);
                stInsert.setString(2, c_password);
                int rowsAffected = stInsert.executeUpdate();
                return rowsAffected > 0;  // Returns true if the insertion was successful
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Sign-up error: " + e);
        }
        return false;
    }
}
