<!DOCTYPE html>
<html lang="en">
<head>
<title>Web Store</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	  <style type="text/css">
   body {background: #E55D87;  /* fallback for old browsers */
background: -webkit-linear-gradient(to right, #5FC3E4, #E55D87);  /* Chrome 10-25, Safari 5.1-6 */
background: linear-gradient(to right, #5FC3E4, #E55D87); /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
   }
</style>
</head>
<body>

	<div class="jumbotron">
		<h1>Web Store</h1>
		<p>The central concept of this application is to allow the
			customer to shop using internet and allow customer to buy items of
			their desire. The information pertaining to the products are stored
			on a database at the server side.</p>
		<div class="btn-group btn-group-justified">
			<a href="${pageContext.request.contextPath}/addUser"
				class="btn btn-info" role="button"> Add User</a> <a
				href="${pageContext.request.contextPath}/addProduct"
				class="btn btn-info" role="button"> Add Product</a> <a
				href="${pageContext.request.contextPath}/viewProduct"
				class="btn btn-info" role="button">View Product</a> <a
				href="${pageContext.request.contextPath}/viewUser"
				class="btn btn-info" role="button">View User</a> <a
				href="${pageContext.request.contextPath}/loginUser"
				class="btn btn-info" role="button">Login User</a>

		</div>
	</div>
</body>
</html>