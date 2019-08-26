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
			<c:forEach items="${list}" var="trailerMan">
				<TR>
					<TD>${trailerMan.tmId}</TD>
					<TD>${trailerMan.tmName}</TD>
					<TD>${trailerMan.tmSex}</TD>
					<TD>${trailerMan.tmAge}</TD>
					<TD>${trailerMan.tmPhone}</TD>
					<TD>${trailerMan.tmSal}</TD>
					<TD>${trailerMan.tmAddress}</TD>
					<TD>${trailerMan.status}</TD>
					<TD>${trailerMan.company}</TD>
					<TD><a href="delete?tmId=${trailerMan.tmId}">删除</a></TD>
					<TD><a href="findById?tmId=${trailerMan.tmId}">修改</a></TD>
					
				</TR>
			</c:forEach>
		</TABLE>
</body>
</html>