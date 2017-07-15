<%@ include file="navigation.jsp"%>

<div class="container">
	<div class="well text-center"><strong>User Sign Up</strong></div>

	<div class="form-group">
		<form:form method="POST" action="save" commandName="user">
								Name:
								<form:input path="userName" />
			<form:errors cssClass="error" path="userName" />
								E Mail:
								<form:input path="userEmail" />
			<form:errors cssClass="error" path="userEmail" />

			<button type="submit" class="btn btn-primary">Submit</button>
		</form:form>
	</div>

</div>

<%@ include file="footer.jsp"%>