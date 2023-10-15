package com.telusko;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class AddServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		
		Cookie cookie = new Cookie("k", k + " ");
		res.addCookie(cookie);
		
		// HttpSession interface working implementation
		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
		
		/*
		 * PrintWriter out = res.getWriter();
		 * 
		 * out.println("result is " + k);
		 */
		
		// To call servlet from servlet their are two method like requestDispatcher and redirect
		
//		req.setAttribute("k", k);
		
		res.sendRedirect("sq?k="+k);
		
//		RequestDispatcher rd = req.getRequestDispatcher("/sq");
//		rd.forward(req, res);
		
	}
	
}
