package com.bit2020.helloweb.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		System.out.println(id);
//		
//		PrintWriter pw = response.getWriter(); // 브라우저에 출력 
//		
//		pw.println("<h1>" + "hello " + id + "</h1>");
		String greeting = "Hello " + id;
		request.setAttribute("greeting",greeting);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/hello.jsp");
		rd.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
