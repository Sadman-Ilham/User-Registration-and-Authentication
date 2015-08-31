<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 8/14/2015
  Time: 11:42 AM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Sign Up Here</title>
</head>
<body>
	<form:form commandName="user">

		<table>
			<tr>
				<td>First Name</td>
				<td><form:input path="firstName" /></td>
				<td><form:errors path="firstName" /></td>
			</tr>

			<tr>
				<td>Last Name</td>
				<td><form:input path="lastName" /></td>
				<td><form:errors path="lastName" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>
				<td><form:errors path="password" /></td>
			</tr>
		</table>

		<input type="submit" value="Sign Up" />

	</form:form>

	<a href="/users">All Users</a>    |    <a href="/login">Login</a>    |    <a href="/">Sign Up</a>
</body>
</html>