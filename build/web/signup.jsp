<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import = "submit.signin"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html lang="en">
  	<head>
	    <meta charset="utf-8">
	    <title>SD Registration</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="">
	    <meta name="author" content="">

	    <!-- Bootstrap core CSS -->
	        <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
		
		<!-- Font Awesome -->
		<link href="css/font-awesome.min.css" rel="stylesheet">

		<!-- ionicons -->
		<link href="css/ionicons.min.css" rel="stylesheet">
		
		<!-- Simplify -->
		<link href="css/simplify.min.css" rel="stylesheet">
	
  	</head>

  	<body class="overflow-hidden light-background">
		<div class="wrapper no-navigation preload">
			<div class="sign-in-wrapper">
				<div class="sign-in-inner">
					<div class="login-brand text-center">
						<i class="fa fa-database m-right-xs"></i> Software <strong class="text-skin">Dynamics</strong>
					</div>

					<form method="POST" action="/context-path/signupServlet">
                                            
                                                <div class="form-group m-bottom-md">
							<input type="text" class="form-control" placeholder="First Name"  id="firstname" name="firstname">
						</div>
                                                <div class="form-group m-bottom-md">
							<input type="text" class="form-control" placeholder="Last Name" id="lastname" name="lastname" >
						</div>                                               
						<div class="form-group m-bottom-md">
							<input type="text" class="form-control" placeholder="Email Address" id="email" name="email">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" placeholder="Password" id="password" name="password">
						</div>
						<div class="form-group">
							<input type="password" class="form-control" placeholder="Confirm Password" id="password2" name="password2">
						</div>
						<div class="form-group">
							<div class="custom-checkbox">
								<input type="checkbox" id="chkAccept">
								<label for="chkAccept"></label>
							</div>
							I accept the agreement
						</div>

						<div class="m-top-md p-top-sm">
                                                    <!--<button type="submit" class="btn btn-success block">Create an accounts</button>-->
                                                    <a href= "<%=request.getContextPath()%>/signup"  class="btn btn-success block">Create an accounts</a> 
						</div>

						<div class="m-top-md p-top-sm">
							<div class="font-12 text-center m-bottom-xs">Already have an account?</div>
							<a href="signin.jsp" class="btn btn-default block">Sign In</a>
						</div>
					</form>
				</div><!-- ./sign-in-inner -->
			</div><!-- ./sign-in-wrapper -->
		</div><!-- /wrapper -->

		<a href="signup.html" id="scroll-to-top" class="hidden-print"><i class="icon-chevron-up"></i></a>

	    <!-- Le javascript
	    ================================================== -->
	    <!-- Placed at the end of the document so the pages load faster -->
		
		<!-- Jquery -->
		<script src="js/jquery-1.11.1.min.js"></script>
		
		<!-- Bootstrap -->
                <script src="bootstrap/js/bootstrap.min.js"></script>
		
		<!-- Slimscroll -->
		<script src='js/jquery.slimscroll.min.js'></script>
		
		<!-- Popup Overlay -->
		<script src='js/jquery.popupoverlay.min.js'></script>

		<!-- Modernizr -->
		<script src='js/modernizr.min.js'></script>
		
		<!-- Simplify -->
		<script src="js/simplify/simplify.js"></script>
	
  	</body>
</html>
