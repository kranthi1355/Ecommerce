<%@ include file="navigation.jsp"%>
<div class="container">
	<div class="well text-center">
		<strong>Add Product</strong>
	</div>
	<form:form class="form-horizontal" method="POST" action="saveProduct"
		commandName="product">
		<div class="form-group">
			<label class="control-label col-sm-2">Product Name:</label>
			<div class="col-sm-2">
				<form:input path="productName" />
				<form:errors cssClass="error" path="productName" />
			</div>
			<br></br> <label class="control-label col-sm-2">Product
				Description :</label>
			<div class="col-sm-2">
				<form:input path="productDescription" />
				<form:errors cssClass="error" path="productDescription" />
			</div>
			<br></br> <label class="control-label col-sm-2">Product
				Price:</label>
			<div class="col-sm-2">
				<form:input path="productPrice" />
				<form:errors cssClass="error" path="productPrice" />
			</div>
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</div>
	</form:form>
</div>
<%@ include file="footer.jsp"%>