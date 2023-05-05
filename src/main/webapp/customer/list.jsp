<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 5/4/2023
  Time: 4:22 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="color: blue">===========LIST CUSTOMERS ==================</h1>
<a href="/customer?action=create">Create Customer</a>
<table style="width: 100%;" border="1">
    <tr>
        <th>STT</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>ADDRESS</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
    <c:forEach
    <c:forEach items= '${requestScope["listCustomers"]}' var="ctm" varStatus="loop">

    </c:forEach>
</table>
</body>
</html>
