package com.axelor.servlet;

import java.io.IOException;
import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.axelor.guice.ServiceConfigur;
import com.axelor.messageservice.MessageGenerated;
import com.axelor.pojo.User;
import com.axelor.service.MessageService;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Singleton;

/**
 * Servlet implementation class ChatExplore
 */

@Singleton
public class ChatExplore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ChatExplore() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("hello world");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String message = request.getParameter("message");
		String casetype = request.getParameter("uppercase");

		if (casetype == null) {
			casetype = "LowerCase";
		}
		System.out.println(message);
		System.out.println(casetype);

		Injector i = Guice.createInjector(new ServiceConfigur(casetype));
		MessageGenerated m = i.getInstance(MessageGenerated.class);

		String text = m.getMessage(message);
		System.out.println(text);

		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");

		try {
			boolean res = MessageService.addMessage(user.getUid(), user.getName(), text);

			if (res) {
				RequestDispatcher rd = request.getRequestDispatcher("chat.jsp");
				request.setAttribute("", "");
				rd.forward(request, response);
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
