<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/02/28
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
用户信息
<br>
    <c:forEach items="${userList }" var="user">
        ${user.uid }&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.uname }&nbsp;&nbsp;&nbsp;&nbsp;
        ${user.usex }<br>
    </c:forEach>
</body>
</html>
