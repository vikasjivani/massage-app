package com.axelor.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.axelor.pojo.Leave;
import com.axelor.pojo.User;
import com.google.inject.Singleton;



@Singleton
//@WebServlet("/leave")
public class LeaveServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String leaveDate = request.getParameter("leaveDate");
		String returnDate = request.getParameter("returnDate");
		String reason = request.getParameter("reason");
		System.out.println(leaveDate);
		System.out.println(returnDate);
		System.out.println(reason);
		
		   HttpSession session=request.getSession();  
	      User user =   (User) session.getAttribute("user");
		
		
		try {
			boolean result = com.axelor.service.LeaveService.leaveApply(leaveDate,returnDate,reason,user.getUid());
			System.out.println("back pointer");
			if(result) {
				RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                request.setAttribute("", "");
                rd.forward(request, response);
			}
			
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}

}
