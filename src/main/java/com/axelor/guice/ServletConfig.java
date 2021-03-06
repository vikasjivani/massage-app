package com.axelor.guice;

import com.axelor.servlet.*;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;

public class ServletConfig extends GuiceServletContextListener {

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new ServletModule(){

            @Override

            protected void configureServlets() {

              serve("/ChatExplore").with(ChatExplore.class);
              serve("/login").with(LoginServlet.class);
              serve("/leave").with(LeaveServlet.class);
            }

        });	}

}