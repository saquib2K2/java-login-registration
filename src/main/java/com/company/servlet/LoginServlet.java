package com.company.servlet;

import java.io.IOException;

import java.net.ResponseCache;

import com.company.dao.UserDao;
import com.company.dao.UserDaoImp;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet{
		/**
	 * 
	 */
	    private static final long serialVersionUID = 1L;
		private static UserDao userDao =  new UserDaoImp();
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
			String username = req.getParameter("username");
			String password = req.getParameter("password");
						
			if(userDao.isValidUser(username , password)) {
				HttpSession session = req.getSession();
				session.setAttribute("username", username);
				resp.sendRedirect("welcome.jsp");
			}else {
				resp.sendRedirect("login.jsp?error=1");
				System.out.println("Error aagaya");
			}		
		}
	
}
