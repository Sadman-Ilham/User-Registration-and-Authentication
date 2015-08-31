<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 8/18/2015
  Time: 4:29 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User History</title>
</head>
<body>
  <ul>
    <c:forEach var="history" items="${histories}">
      <li>${history.getLoginTime()}</li>
    </c:forEach>
  </ul>

  <a href="/users">All Users</a>    |    <a href="/login">Login</a>    |    <a href="/">Sign Up</a>
</body>
</html>
