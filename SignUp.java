package com.aadhi;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLClientInfoException;

import com.aadhi.dao.LoginDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class SignUp extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter out = response.getWriter();
        System.out.println("signup reached");

        LoginDao dao = new LoginDao();
        try 
        {
			if (dao.checkSignup(username, password)) 
			{
			    response.sendRedirect("login.jsp");
			} 
			
			else 
			{
			    out.print("Sign-up failed. The username might already be taken or there was an error.");
			}
		} 
        catch (Exception e) 
        {
			System.out.println("error : "+e);
			
		} 
    }
}
