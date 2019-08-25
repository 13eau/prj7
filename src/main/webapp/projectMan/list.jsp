<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
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
				<TD>delete</TD>
				<TD>update</TD>
			</TR>
			<c:forEach items="${list}" var="projectMan">
				<TR>
					<TD>${projectMan.pmId}</TD>
					<TD>${projectMan.pmName}</TD>
					<TD>${projectMan.pmSex}</TD>
					<TD>${projectMan.pmAge}</TD>
					<TD>${projectMan.pmPhone}</TD>
					<TD>${projectMan.pmSal}</TD>
					<TD>${projectMan.pmAddress}</TD>
					<TD>${projectMan.status}</TD>
					<TD>${projectMan.company}</TD>
					<TD><a href="delete?pmId=${projectMan.pmId}">删除</a></TD>
					<TD><a href="findById?pmId=${projectMan.pmId}">修改</a></TD>
					
				</TR>
			</c:forEach>
		</TABLE>
</body>
</html>