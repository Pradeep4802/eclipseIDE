package com.servletconfig.serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */
@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out = response.getWriter()) {
			out.println("GEtContext:"+request.getServletContext());
			out.println("GEtConfig:"+response.getStatus());
			out.println("GEtContextConfig:"+request.getContextPath());
			out.println("GEtContextConfig:"+request.getServerName());
			out.println("GEtContextConfig:"+request.getServerPort());
			out.println("GEtContextConfig:"+request.getProtocol());
			out.println("GEtContextConfig:"+request.getServletContext());
			
			List<Integer> list = new ArrayList();
			list.add(23);
			list.add(45);
			list.add(67);
			
			request.setAttribute("pradeep", list);
			
			RequestDispatcher dis = request.getRequestDispatcher("ContextServlet");
			dis.include(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
