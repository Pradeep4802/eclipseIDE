package com.webjdbc.pract;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServ1
 */
@WebServlet("/myserv1")
public class MyServ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */


	public static Connection getConnection1() throws SQLException, ClassNotFoundException {
		String url = "jdbc:mysql://localhost:3306/student";
		String user = "root";
		String pass = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,pass);
		return con;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			out.println("Connected to the Database!!");
			out.println("2");
			
			String query = "insert into id1(id, name, email, contact) values(?,?,?,?)";
			
			Connection con = getConnection1();
			out.println("1");
			
			PreparedStatement ps = con.prepareStatement(query);
			out.println("2");
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			int contact = Integer.parseInt(request.getParameter("contact"));
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setString(3, email);
			ps.setInt(4, contact);
			//    		out.println("This is first servlet");
			//    		out.println(name);		
			int result = ps.executeUpdate();			
			out.println("Inserted successfully "+result);
			ps.close();
			con.close();
		} catch (SQLException e) {
			PrintWriter out = response.getWriter();
			// TODO Auto-generated catch block
			out .println(e.getMessage());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


}
