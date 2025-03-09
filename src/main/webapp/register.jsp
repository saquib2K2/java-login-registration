<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>
<link rel="stylesheet" href="./style1.css">
</head>
<body>
	<div class="signup-box">
		<div class="signup-header">
			<header>Sign Up</header>
		</div>
		<form action="Register" method="post">
			<div class="input-box">
				<input type="text" class="input-field" name="username"
					placeholder="Username" required />
			</div>

			<div class="input-box">
				<input type="email" class="input-field" name="email"
					placeholder="Email" required />
			</div>

			<div class="input-box">
				<input type="password" class="input-field" name="password"
					placeholder="Password" required />
			</div>

			<div class="input-submit">
				<button type="submit" class="submit-btn" id="submit"></button>
				<label for="submit">Sign Up</label>
			</div>
		</form>

		<div class="login-link">
			<p>
				Already have an account? <a href="login.jsp">Login here</a>
			</p>
		</div>
	</div>
</body>
</html>
