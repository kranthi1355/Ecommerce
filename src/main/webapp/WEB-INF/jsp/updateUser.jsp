<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="navigation.jsp"%>
<div class="container">

	<div class="well text-center">
		<strong>Update User</strong>
	</div>
	<form:form method="POST"
		action="${pageContext.request.contextPath}/saveUpdate"
		ModelAttribute="update">
		<div class="form-group">
			<label class="control-label col-sm-2">Id:</label>
			<div class="col-sm-2">
				<form:input path="id" readonly="true" />
				<form:errors cssClass="error" path="id" />
			</div>
			<br></br> <label class="control-label col-sm-2">Name:</label>
			<div class="col-sm-2">
				<form:input path="userName" />
				<form:errors cssClass="error" path="userName" />
			</div>
			<br></br> <label class="control-label col-sm-2">Email Id:</label>
			<div class="col-sm-2">
				<form:input path="userEmail" />
				<form:errors cssClass="error" path="userEmail" />
			</div>
			 <input  type="submit" value="Update" />
		</div>
	</form:form>
</div>
<%@ include file="footer.jsp"%>