<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style2.css">
</head>
<body>

	<%
		HttpSession session1 = request.getSession(false);
	
		//check if the session is not null and the attribute too
		if(session1 != null && session1.getAttribute("username") != null){
			//get the username form the user and store it in username
			String username = (String) session1.getAttribute("username");
			String email =(String) session1.getAttribute("email");
			
		
	%>

	<div class="welcome-box">
       <h2>Welcome, <%= username %>!</h2>
        <p>Email: <%= email %> </p> 
        <p>Your account has been successfully created.</p>
        <form action="Logout" method="post">
        	<button type="submit">LOGOUT</button>
        </form>   
        
    </div>

    <% 
		} else{
			//if login failed return to login page
				response.sendRedirect("login.jsp"); 
		}
    
    %>
</body>
</html>