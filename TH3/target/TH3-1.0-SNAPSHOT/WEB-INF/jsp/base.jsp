<%-- 
    Document   : base
    Created on : Mar 27, 2021, 1:51:57 PM
    Author     : Admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <h3 style="color:red">${message}</h3>
        <ul>
            <c:forEach items="${categories}" var="cate">
                <li>${cate.id} - ${cate.name}</li>
            </c:forEach>
        </ul>
    </body>
</html>
