<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
<link rel="stylsheet" type="text/css" href="css/Style.css" />
</head>
<body>
<p></p>
	<div class="container">
		<div class="col-md-6 col-xm-12 cal-sm-6 col-md-offset-3"></div>
		<div class="card">
			<div class="panel panel -primary">
				<div class="card-header">Employee Registration System</div>
				
				
				<div class="card-body">
					<form action="<%=request.getContextPath() %>/register" method="Post">
						<div class="form-group">
							<label> First Name:</label> <input class="form-control" type="text" name="first_name"  />
						 </div>

						<div class="form-group">
							<label> Last Name:</label> <input class="form-control" type="text" name="last_name"  />
						</div>


						<div class="form-group">
						
							<label> User Name:</label> <input class="form-control" type="text"
								name="username"  />
						</div>
						<div class="form-group">
						
							<label> User Password :</label> <input class="form-control" type="text"
								name="password"  />
						</div>
						<div class="form-group">
						
							<label> User Address :</label> <input class="form-control" type="text"
								name="address"  />
						</div>
						<div class="form-group">
						
							<label> User Contact :</label> <input class="form-control" type="text"
								name="contact"  />
						</div>
						
 
						<button class="btn btn-success" type="submit"value="Submit">Submit</button>

					</form>
					
				</div>
			</div>
		</div>
	</div>


</body>
</html>