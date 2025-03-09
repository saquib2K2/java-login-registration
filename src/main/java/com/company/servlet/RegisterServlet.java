package com.company.servlet;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import org.apache.catalina.User;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImp;
import com.company.dao.Users;


public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImp();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		Users user = new Users();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		
		
		if(userDao.addUser(user)) {
			response.sendRedirect("login.jsp?registration=success");
		}else {
			response.sendRedirect("register.jsp?error=1");
		}
		
		
		
	}

}
