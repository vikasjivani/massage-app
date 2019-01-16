package com.axelor.servlet;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.axelor.service.Login;


public class MyServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {

			boolean result = Login.ckeckLogin(request.getParameter("email"), request.getParameter("password"));

			if (result) {
				RequestDispatcher rd = request.getRequestDispatcher("home.jsp");
                request.setAttribute("", "");
                rd.forward(request, response);
			} else {
				response.sendRedirect("index.html");
			}

		}
	}

}
