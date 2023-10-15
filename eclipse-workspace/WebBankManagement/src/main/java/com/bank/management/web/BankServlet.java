package com.bank.management.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.management.bean.User;
import com.bank.management.dao.UserDao;

/**
 * Servlet implementation class BankServlet
 */
//@WebServlet("/BankServlet")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static User myuser = new User();
//	static int count = 0;

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher dis = request.getRequestDispatcher("User-Info.jsp");
//		dis.include(request, response);
		UserDao ud = new UserDao();
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			
			String UserId = request.getParameter("user_id");
			String Name = request.getParameter("user_name");
			String Password = request.getParameter("user_password");
			String Email = request.getParameter("user_email");
			String Contact = request.getParameter("user_contact");
			String AccountNo = request.getParameter("user_accountno");
			String AccountType = request.getParameter("user_accounttype");

			myuser = new User(UserId,Name,Password,Email,Contact,AccountNo,AccountType);
			int status = ud.register(myuser);
//			count++;
			if(status>0) {
//				System.out.println("Success");
				RequestDispatcher req = request.getRequestDispatcher("User-Info.jsp");
				req.include(request, response);
				out.println("Registered Succesfully");
				out.println("<h1 style='Background-color: red; color: white;'>"+UserId+"</h1>");
//				out.println(Name);
//				out.println(Password);
					
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
