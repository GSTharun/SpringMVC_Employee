<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveemployee" modelAttribute="employee">

		<form:label path="name">Name</form:label>
		<form:input path="name" />

		<form:label path="job">Job</form:label>
		<form:input path="job" />

		<form:label path="email">Email</form:label>
		<form:input path="email" />

		<form:label path="password">Password</form:label>
		<form:input path="password" />

		<input type="submit" value="submit">

	</form:form>

</body>
</html>