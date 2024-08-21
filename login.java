package com.aadhi;

import jakarta.servlet.http.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.*;
import java.sql.SQLClientInfoException;

import com.aadhi.dao.LoginDao;

@WebServlet("/login")
public class login extends HttpServlet 
{

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.length() <= 1) {
            // Validate username length
            PrintWriter out = response.getWriter();
            out.print("Username must be longer than one character.");
            return;  // Exit if validation fails
        }
        
        HttpSession session = request.getSession();
        session.setAttribute("username", username);

        LoginDao dao = new LoginDao();
        PrintWriter out = response.getWriter();
        try 
        {
			if (dao.checkLogin(username, password)) 
			{
			    response.sendRedirect("welcome.jsp");
			} 
			else 
			{
			    out.print("Invalid credentials, please login again.");
			}
		} 
        catch (Exception e) 
        {
			// TODO Auto-generated catch block
			System.out.println("error : "+e);
		} 
    }
}
