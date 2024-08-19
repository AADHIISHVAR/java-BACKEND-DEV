package com.aadhi;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/Logout")

public class Logout extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get the current session, but don't create a new one if it doesn't exist
        HttpSession session = request.getSession(false);
        //session.removeAttribute("username");

        if (session != null) {
            session.invalidate(); // Invalidate the session to log out the user
        }

        // Prevent caching
        response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);

        // Redirect to login page after logging out
        response.sendRedirect("login.jsp");
    }
}
