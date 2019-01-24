
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@page import="com.axelor.pojo.User"%>

<% User user = (User)session.getAttribute("user"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
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
	<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">axelor erp</a>
		</div>							
		
		
		
		
		
		
		
	</div>
	</nav>
	<br>
	<br>
	<div class="jumbotron">
		<div class="container">
			<h1>Welcome <% out.println(user.getName()); %></h1>
		</div>
	</div>

	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-3">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h2>Explore Chat</h2>
					</div>
					<div class="panel-body">
						<p>This library management system allows you to search for
							books that are available in the library. Using the link below you
							will be able to search for books, check their availability and
							check out that book.</p>
						<p>
							<a class="btn btn-primary" href="chat.jsp"
								role="button">Search Book &raquo;</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h2>Book Loan</h2>
					</div>
					<div class="panel-body">
						<p>This library management system allows you to loan books
							that are available in the library. Using the link below you will
							be able to check out and check in the books that are available in
							the library.</p>
						<p>
							<a class="btn btn-primary" href="BookLoanController"
								role="button">Check out &raquo;</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h2>Leave Apply</h2>
					</div>
					<div class="panel-body">
						<p>This library management system allows you to track the fine
							payments of all the borrowers. Using the link below you will be
							able to find the pending / paid fine amounts of the different
							borrowers.</p>
						<p>
							<a class="btn btn-primary" href="leave.jsp"
								role="button">Track fines &raquo;</a>
						</p>
					</div>
				</div>
			</div>
			<div class="col-md-3">
				<div class="panel panel-info">
					<div class="panel-heading">
						<h2>My Profile</h2>
					</div>
					<div class="panel-body">
						<p>This library management system allows you to add new
							borrowers. Using the link below you will be able to add new
							borrowers to the library management system by entering all their
							details.</p>
						<p>
							<a class="btn btn-primary" href="myprofile.jsp"
								role="button">My profile &raquo;</a>
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>


</body>
</html>