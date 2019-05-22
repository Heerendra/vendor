<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<jsp:useBean id="vendor" class="beans.vendorBeans" scope="session"></jsp:useBean>
<body>
<table>
<c:forEach var='vid'  items='${sessionScope.vendor.listOfVendor()}'>
<tr>
<td>${vid.id}</td>
<td>${vid.email}</td>
<td>${vid.password}</td>
<td>${vid.name}</td>
<td>${vid.city}</td>
<td>${vid.phoneno}</td>
</tr>
</c:forEach>
</table>

</body>
</html>