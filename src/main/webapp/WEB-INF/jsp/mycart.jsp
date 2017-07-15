<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.*"%>
<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="navigation.jsp"%>
   <table >  
<tr><th>Name</th><th>Description</th><th>Price</th></tr>   
   
<c:forEach var="cart" items="${listCart}">   
   <tr>  
   <td>${cart.productName}</td>  
   <td>${cart.productDescription}</td>  
   <td>${cart.productPrice}</td> 
  
   <td><a class="btn btn-outline-primary" href="update/${product.id}">Edit</a></td>  
   <td><a class="btn btn-outline-warning" href="delete/${product.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  	
</table>

<%@ include file="footer.jsp"%>