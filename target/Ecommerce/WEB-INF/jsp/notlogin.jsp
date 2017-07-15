<%@ include file="navigation.jsp"%>
<body>   
<div class="container">
 <div class="alert alert-danger" role="alert">
  <h3>You do not have permission to access this page!</h3> 
 </div>
<a class="btn btn-outline-primary btn-lg" href="${pageContext.request.contextPath}/loginUser">Login Again</a>
</div> 
<%@ include file="footer.jsp"%>