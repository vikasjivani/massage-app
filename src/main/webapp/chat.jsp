<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.axelor.service.MessageService"%>
    <%@page import="com.axelor.pojo.Message"%>
    <%@page import="java.util.List"%>
    
    <%
    MessageService message = new MessageService();
    
    List<Message> lm = (List<Message>)MessageService.getMessage();
    %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<link rel="stylesheet"
	href="other/chat.css">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	

	<div class="chat_window">
		<div class="top_menu">
			<div class="buttons">
				<div class="button close"></div>
				<div class="button minimize"></div>
				<div class="button maximize"></div>
			</div>
			<div class="title">Chat</div>
			
		</div>
		<ul class="messages">
		
		<% for(Message m : lm){ %>
		<div>
		<div class="content11" ><%= m.getMessage() %></div>
		<div class="content12" ><%= m.getName() %></div>
		</div>
		<% } %>
		
		
		</div>
	
	<div class="bottom_wrapper clearfix">
			<form action="ChatExplore" method="POST">
			<div class="message_input_wrapper">
				<input class="message_input" name = "message" placeholder="Type your message here..." />
			</div>
			
			<br/>
			
				
				<input type="submit" name="uppercase" value="UpperCase" class="btn-primary">
				<input type="submit" name="lowercase" value="LowerCase" class="btn-success">
				

			</from>
		</div>
	<div class="message_template">
		<li class="message"><div class="avatar"></div>
			<div class="text_wrapper">
				<div class="text"></div>
			</div></li>
	</div>

</body>
</html>