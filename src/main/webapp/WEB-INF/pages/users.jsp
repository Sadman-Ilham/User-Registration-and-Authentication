<%--
  Created by IntelliJ IDEA.
  User: Sadman
  Date: 8/18/2015
  Time: 3:49 PM
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
  <table border="1" style="width: 100%">
    <tr>
      <th>Name</th>
      <th>Email</th>
      <th>History</th>
      <th>Action</th>
    </tr>
    <c:forEach var="user" items="${users}">
      <tr>
        <td>${user.getFullName()}</td>
        <td>${user.getEmail()}</td>
        <td><a href="/history?id=${user.getId()}">Show History</a></td>
        <td>
          <form action="/users" method="post">
            <input type="hidden" name="id" value=${user.getId()} />
            <input type="submit" value="Delete" />
          </form>
        </td>
      </tr>
    </c:forEach>
  </table>

  <br/>
  <a href="/users">All Users</a>    |    <a href="/login">Login</a>    |    <a href="/">Sign Up</a>
</body>
</html>
