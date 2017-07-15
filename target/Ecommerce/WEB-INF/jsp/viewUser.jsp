<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="navigation.jsp"%>
<div class="container">

	<div class="well text-center">
		<strong>List of Users</strong>
	</div>

	<table class="table table-bordered table-hover">
		<thead class="thead-inverse">
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Email</th>
			</tr>
		</thead>
		<tbody>

			<c:forEach var="user" items="${listUser}">
				<tr>
					<th scope="row">${user.id}</th>
					<td>${user.userName}</td>
					<td>${user.userEmail}</td>
					<td><a class="btn btn-warning" href="update/${user.id}">Edit</a></td>
					<td><a class="btn btn-danger" href="delete/${user.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="footer.jsp"%>