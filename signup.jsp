<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login | Aadhi's Portfolio</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            margin: 0;
            padding: 0;
            background: linear-gradient(135deg, #667eea, #764ba2);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            color: #ffffff;
        }

        .login-container {
            background: rgba(255, 255, 255, 0.1);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.3);
            backdrop-filter: blur(10px);
            text-align: center;
            max-width: 400px;
            width: 100%;
        }

        .login-container h2 {
            margin-bottom: 30px;
            font-size: 2.5em;
            color: #ffffff;
        }

        .input-group {
            margin-bottom: 20px;
            text-align: left;
        }

        .input-group label {
            font-size: 1.1em;
            margin-bottom: 5px;
            display: block;
            color: #ddd;
        }

        .input-group input {
            width: 100%;
            padding: 10px;
            font-size: 1.1em;
            border: none;
            border-radius: 5px;
            background: rgba(255, 255, 255, 0.2);
            color: #fff;
            outline: none;
        }

        .input-group input::placeholder {
            color: #bbb;
        }

        .signup-button {
            width: 100%;
            padding: 12px;
            font-size: 1.2em;
            border: none;
            border-radius: 5px;
            background: #ff7f50;
            color: #ffffff;
            cursor: pointer;
            transition: background 0.3s ease, transform 0.3s ease;
        }

        .signup-button:hover {
            background: #ff6347;
            transform: translateY(-2px);
        }

        .signup-button:active {
            background: #ff4500;
            transform: translateY(0);
        }

        .forgot-password {
            display: block;
            margin-top: 20px;
            color: #ddd;
            text-decoration: none;
            font-size: 1em;
        }

        .forgot-password:hover {
            color: #ffffff;
            text-decoration: underline;
        }
    </style>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
	    response.setHeader("Pragma", "no-cache");
	    response.setDateHeader("Expires", 0);
	%>
    <div class="login-container">
        <h2>Login</h2>
        <form action="signup" method="post">
        	
            <div class="input-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" placeholder="Enter your username" required>
            </div>
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" placeholder="Enter your password" required>
            </div>
            <button type="submit" class="signup-button">Sign Up</button>
            <!--  <a href="login.jsp" class="login-button">Login</a>-->
            <a href="#" class="forgot-password">Forgot Password?</a>
        </form>
    </div>
</body>
</html>
 