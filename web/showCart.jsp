<%@ page import="logic.Cart" %><%--
  Created by IntelliJ IDEA.
  User: ivang
  Date: 7/17/2020
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cart</title>
</head>
<body>
    <% Cart cart = (Cart) session.getAttribute("cart");%>
    <p>Наименование: <%= cart.getName()%> </p>
    <p>Количество: <%= cart.getQuantity()%></p>
</body>
</html>
