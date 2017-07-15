<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="navigation.jsp"%>

<div class="container">
	<div class="well text-center">
		<strong>List of Products</strong>
	</div>
	<table class="table table-bordered table-hover">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Description</th>
				<th>Price</th>
			</tr>
		<thead>
		<tbody>
	<c:forEach var="product" items="${listProduct}">
				<tr>
					<th scope="row">${product.id}</th>
					<td>${product.productName}</td>
					<td>${product.productDescription}</td>
					<td>${product.productPrice}</td>
					<td><a class="btn btn-warning"
						href="updateProduct/${product.id}">Edit</a></td>
					<td><a class="btn btn-danger"
						href="deleteProduct/${product.id}">Delete</a></td>
				</tr>
			</c:forEach>
			</tbody>
			</table>
	<br>
</div>
