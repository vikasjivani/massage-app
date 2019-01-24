<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">


<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>



<br/><br/>

	<div class="container">	
	<div class="row">
	<h2><strong>Axelor</strong>  <br/></h2><br/>
		<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			<!-- Start form -->
                    <form action = "leave" method = "POST">
                      <div class="form-group">
                        <label for="exampleInputEmail1">Leave Date</label>
                        <input type="date" class="form-control" id="leaveDate" name="leaveDate"  placeholder="Date">
                      </div>
                      <div class="form-group">
                        <label for="exampleInputPassword1">Return Date</label>
                        <input type="date" class="form-control" name="returnDate" id="returnDate" placeholder="date">
                      </div>
                       <div class="form-group">
                        <label for="exampleInputPassword1">Reason</label>
                        <input type="text" class="form-control" name="reason" id="reason" placeholder="reason">
                      </div>
                      <div class="form-check">
                        <button type="submit" class="btn btn-primary">Submit</button>
                      </div>
                      
                    </form>


			<!-- End form -->
		</div>
		
	
		
	</div>
</div>

</body>
</html>