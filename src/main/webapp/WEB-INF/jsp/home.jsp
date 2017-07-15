<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="navigation.jsp"%>
<div class="container">

	<a class="btn btn-link text-center" href="mycart">My Cart</a>
	<div class="alert alert-success text-center" role="alert">
			<strong>Well done!</strong> You successfully Logged In.
		</div>
		
	<table class="table table-bordered table-hover">
		<thead>
		<tr>
			<th>Name</th>
			<th>Description</th>
			<th>Price</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach var="product" items="${listProduct}">
			<tr>
				<td>${product.productName}</td>
				<td>${product.productDescription}</td>
				<td>${product.productPrice}</td>
				<td><a class="btn btn-success"	role="button" href="addToCart/${product.id}">Add to cart</a></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	<br>
</div>
</body>
</html>