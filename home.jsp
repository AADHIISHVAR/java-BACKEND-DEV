<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome to Aadhi's Java Hub</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #2c3e50;
            color: #ecf0f1;
            line-height: 1.6;
        }

        .header {
            background-color: #2980b9;
            padding: 20px 0;
            color: white;
            text-align: center;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.3);
            position: relative;
        }

        .header h1 {
            margin: 0;
            font-size: 2.5em;
            font-weight: 600;
        }

        .header p {
            margin: 10px 0 0;
            font-size: 1.2em;
            font-weight: 300;
        }

        .login-button {
            position: absolute;
            right: 20px;
            top: 20px;
            padding: 10px 20px;
            font-size: 1.1em;
            color: white;
            background-color: #e74c3c;
            text-decoration: none;
            border-radius: 5px;
            transition: background 0.3s ease, transform 0.3s ease;
        }

        .login-button:hover {
            background-color: #c0392b;
            transform: translateY(-2px);
        }

        .content {
            max-width: 1000px;
            margin: 40px auto;
            padding: 0 20px;
        }

        .intro {
            text-align: left;
            margin-bottom: 30px;
        }

        .intro h2 {
            font-size: 2em;
            color: #e74c3c;
        }

        .intro p {
            margin-bottom: 15px;
            font-size: 1.2em;
        }

        .btn {
            display: inline-block;
            padding: 12px 25px;
            font-size: 1.1em;
            color: white;
            background-color: #e74c3c;
            text-decoration: none;
            border-radius: 5px;
            margin-top: 20px;
            transition: background 0.3s ease, transform 0.3s ease;
        }

        .btn:hover {
            background-color: #c0392b;
            transform: translateY(-2px);
        }

        .section-title {
            margin-top: 40px;
            font-size: 1.8em;
            color: #3498db;
            border-bottom: 2px solid #3498db;
            padding-bottom: 5px;
        }

        .footer {
            margin-top: 40px;
            padding: 20px;
            background-color: #34495e;
            color: white;
            text-align: center;
            font-size: 0.9em;
        }

        .footer a {
            color: #ecf0f1;
            text-decoration: none;
            margin: 0 10px;
        }

        .footer a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

    <header class="header">
        <h1>Welcome to Aadhi's Java Hub</h1>
        <p>Crafting Java solutions, one line of code at a time.</p>
        <a href="login.jsp" class="login-button">Login</a>
    </header>
    <div class="content">
        <section class="intro">
            <h2>About Me</h2>
            <p>Hi, I'm Aadhi, a passionate Java developer with a deep interest in creating efficient and scalable Java applications. From backend development to data structures and algorithms, I enjoy tackling complex problems with elegant code.</p>
            <p>This site is a hub for all my Java-related projects, tutorials, and insights. Whether you're here to explore my work, learn something new, or just connect, I'm glad to have you here!</p>
        </section>
        
        <section>
            <h2 class="section-title">My Projects</h2>
            <p>Explore some of the projects I've worked on:</p>
            <ul>
                <li><strong>Project 1:</strong> A Java-based web application using Servlets and JSP to manage user data.</li>
                <li><strong>Project 2:</strong> Implementation of data structures in Java, including linked lists, stacks, and queues.</li>
                <li><strong>Project 3:</strong> RESTful API development with Jersey, integrated with a MySQL database.</li>
            </ul>
            <a href="projects.jsp" class="btn">View All Projects</a>
        </section>

        <section>
            <h2 class="section-title">Contact Me</h2>
            <p>If you're interested in collaborating, have any questions, or just want to say hello, feel free to reach out!</p>
            <a href="contact.jsp" class="btn">Contact Me</a>
        </section>
    </div>
    <footer class="footer">
        <p>&copy; 2024 Aadhi's Java Hub. All rights reserved.</p>
        <a href="privacy.jsp">Privacy Policy</a> | 
        <a href="terms.jsp">Terms of Service</a>
    </footer>
</body>
</html>
