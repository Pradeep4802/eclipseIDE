package com.practice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserServlet() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String contact = request.getParameter("contact");
			out.println("<html>");
			out.println("<head>");
			out.println("<style>");
			out.println("body { background-color : red; } h1 {color: aqua;}"
					+ "");
			out.println("</style>");
			out.println("</head>");
			out.println("<h1 >ID : "+id+"</h1>");
			out.println("<h1>Name : "+name+"</h1>");
			out.println("<h1>Email : "+email+"</h1>");
			out.println("<h1>Contact : "+contact+"</h1>");
			
			out.println("<p>Return Home : <a href='index.html'>Home</a></p>");
			out.println("</html>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			int number = Integer.parseInt(request.getParameter("numbers"));
			out.println("<h1>Amount is : "+number+"</h1>");
			
			int twoTh = 0;
			int fiveHun = 0;
			int twoHun = 0;
			int oneHun = 0;
			
			while(number != 0) {
				if(number >= 2000) {
					twoTh = number / 2000;
					number = number % 2000;
				}
				else if(number >= 500) {
					fiveHun = number / 500;
					number  = number % 500;
				}
				else if(number >= 200) {
					twoHun = number / 200;
					number  = number % 200;
				}
				else if(number >= 100) {
					oneHun = number / 100;
					number  = number % 100;
				}
			}
			out.println("<html>");
			out.println("<head>");
			out.println("<style>");
			out.println("body { background-color : lightgreen; } p {color: aqua;}"
					+ ".para p {color : red; font-weight: bolder;}");
			out.println("</style>");
			out.println("<p>Notes are : </p>");
			out.println("<div class='para'>");
			out.println("<p>2000 : "+twoTh+"</p>");
			out.println("<p>500 : "+fiveHun+"</p>");
			out.println("<p>200 : "+twoHun+"</p>");
			out.println("<p>100 : "+oneHun+"</p>");
			out.println("</div>");
			out.println("</html>");
		}
	}

}
