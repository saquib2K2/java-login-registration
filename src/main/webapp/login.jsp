<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login-register</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
	<div class="login-box">
		<div class="login-header">
			<header>Login</header>
		</div>
		<form action="Login" method="post">
			<div class="input-box">
				<input type="text" name="username" class="input-field" placeholder="username" required />
			</div>

			<div class="input-box">
				<input type="password" name="password" class="input-field" placeholder="Password"
					required />
			</div>

			<div class="forgot">
				<section>
					<input type="checkbox" id="check"> <label for="check">Remember
						me</label>
				</section>
				<section>
					<a href="#">Forgot password</a>
				</section>
			</div>
			<div class="input-submit">
				<button class="submit-btn" id="submit"></button>
				<label for="submit">Sign In</label>
			</div>
		</form>

		<div class="sign-up-link">
			<p>
				Don't have an account? <a href="register.jsp">Sign Up</a>
			</p>
			<!-- displaying the error message -->
		    <%
			String error =request.getParameter("error");
				if(error != null && error.equals("1")) {%>
				<p style="color: red;">Invalid Username or Password</p>
			<%} %>
			
			<!-- displaying the message if user registered or not -->
			<%
				String rs = request.getParameter("registration");
					if(rs != null && rs.equals("success")){ %>
					<p style="color:blue;" >Your registration is successfull. please Login</p>
				<%} %>
		</div>
		
	

	</div>
</body>
</html>