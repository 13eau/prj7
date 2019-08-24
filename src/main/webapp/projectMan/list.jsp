<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="findAll">
uname<INPUT TYPE="text" NAME="uname" value="${log.uname }">action<INPUT TYPE="text" value="${log.action }" NAME="action"><input type="submit" value="Query">
<TABLE border="1" width="100%">
<TR>
	<TD>id</TD>
	<TD>name</TD>
	<TD>sex</TD>
	<TD>age</TD>
	<TD>phone</TD>
	<TD>sal</TD>
	<TD>address</TD>
	<TD>status</TD>
	<TD>company</TD>
</TR>
<c:forEach items="${list}" var="projectMan">
<TR>
	<TD>${projectMan.logid}</TD>
	<TD>${projectMan.uid}</TD>
	<TD>${projectMan.action}</TD>
	<TD><fmt:formatDate value="${log.actiontime}" pattern="yyyy-MM-dd hh:mm:ss"/></TD>
	<TD>${log.uname}</TD>
</TR>
</c:forEach>
</TABLE>
</form>
</body>
</html>