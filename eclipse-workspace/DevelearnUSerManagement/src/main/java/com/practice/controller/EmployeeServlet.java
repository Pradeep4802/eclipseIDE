package com.practice.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {

	EmpDAO ed=new EmpDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()) {
			//		System.out.println("Java");
			ArrayList<Employee> list = ed.getEmpList();
			for(Employee emp : list) {

				out.println("<h1>Id : "+emp.getId()+"</h1>");
				out.println("<h1>Name : "+emp.getName()+"</h1>");
				out.println("<h1>Email : "+emp.getEmail()+"</h1>");
				out.println("<h1>Contact : "+emp.getContact()+"</h1>");
				out.println("<h1>Password : "+emp.getPassword()+"</h1>");
			}
			//		list.forEach((x)->System.out.println(x));
			//		response.sendRedirect("index.html");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String password = request.getParameter("password");
		Employee e=new Employee();
		e.setContact(contact);e.setEmail(email);e.setId(id);
		e.setName(name);e.setPassword(password);
		boolean b= ed.addEmp(e);
		if(b) {
			response.sendRedirect("index.html");
		}
	}

}
