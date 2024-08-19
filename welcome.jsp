<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
    response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome | Java Developer Hub</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(to right, #1c1c1c, #4b79a1);
            color: #ffffff;
            text-align: center;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background: rgba(0, 0, 0, 0.7);
            padding: 40px 60px;
            border-radius: 15px;
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.5);
            max-width: 800px;
            width: 100%;
        }

        .welcome-header {
            margin-bottom: 30px;
        }

        .welcome-header h1 {
            font-size: 3.5em;
            margin: 0;
            color: #e0e0e0;
        }

        .welcome-header p {
            font-size: 1.2em;
            margin: 15px 0;
            color: #b0b0b0;
        }

        .welcome-content h2 {
            font-size: 2.5em;
            margin-bottom: 20px;
            color: #f0f0f0;
        }

        .welcome-content p {
            font-size: 1.2em;
            margin: 20px 0;
            color: #c0c0c0;
        }

        .btn {
            display: inline-block;
            padding: 12px 24px;
            font-size: 1.2em;
            color: #ffffff;
            background: #e67e22;
            text-decoration: none;
            border-radius: 5px;
            transition: background 0.3s ease, transform 0.3s ease;
            margin: 15px;
        }

        .btn:hover {
            background: #d35400;
            transform: translateY(-2px);
        }

        .btn:active {
            background: #a04000;
            transform: translateY(0);
        }

        .footer {
            margin-top: 40px;
            font-size: 0.9em;
            color: #a0a0a0;
        }

        .footer a {
            color: #ffffff;
            text-decoration: none;
            margin: 0 10px;
        }

        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
	
    <% 
        if (session.getAttribute("username") == null) 
        {
            response.sendRedirect("login.jsp");
        }
    %>
    <div class="container">
        <div class="welcome-header">
            <h1>Welcome, <%= session.getAttribute("username") %>!</h1>
            <p>We're thrilled to see your interest in Java development.</p>
        </div>
        <div class="welcome-content">
            <h2>Your Java Journey Starts Here</h2>
            <p>Explore your dashboard, manage projects, and connect with fellow Java enthusiasts.</p>
            <a href="profile.jsp" class="btn">Go to Profile</a>
            <a href="projects.jsp" class="btn">View Projects</a>
            <form action="Logout" method="post">
            	<button type="submit" class="btn">Logout</button>
            </form>
        </div>
        <div class="footer">
            <p>&copy; 2024 Java Developer Hub. All rights reserved.</p>
            <a href="contact.jsp">Contact Us</a> | 
            <a href="privacy.jsp">Privacy Policy</a> | 
            <a href="terms.jsp">Terms of Service</a>
        </div>
    </div>
</body>
</html>
