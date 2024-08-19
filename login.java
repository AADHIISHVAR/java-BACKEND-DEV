package com.aadhi; 

import jakarta.servlet.http.*;
import jakarta.websocket.Session;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.*;



@WebServlet("/login")
public class login extends HttpServlet 
{
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	// Assuming this is in your login servlet
    	
    	HttpSession session = request.getSession();
    	session.setAttribute("username", username);

    	// Optionally, redirect to a welcome page or another servlet
    	

    	PrintWriter out = response.getWriter();
    	if(username !=null&&password!=null&&username.length()>1)
    	{
    		
    		response.sendRedirect("welcome.jsp");
    	}
    	else
    	{
    		out.print("Login 1st and the user name should not be in single character");
    	}
    	
    	 
        
    }
}
