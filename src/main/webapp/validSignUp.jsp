<%--
  Created by IntelliJ IDEA.
  User: ekanshgupta
  Date: 25/7/19
  Time: 11:33 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
       <%= request.getAttribute("result")%> <br><br>
       <a href="profile.jsp">Go to Profile.</a><br><br>
       <a href="index.jsp">Go Back to Home Page.</a>
</body>
</html>
