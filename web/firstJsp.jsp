<%--
  Created by IntelliJ IDEA.
  User: ivang
  Date: 7/16/2020
  Time: 6:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP</h1>
    <p>
        <%
            String name = request.getParameter("name");
            String surname = request.getParameter("surname");
        %>
        <%= "Hello, " + name +" "+surname+"!"%>
    </p>

</body>
</html>
