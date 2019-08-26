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
			<c:forEach items="${list}" var="CraneMan">
				<TR>
					<TD>${CraneMan.cmId}</TD>
					<TD>${CraneMan.cmName}</TD>
					<TD>${CraneMan.cmSex}</TD>
					<TD>${CraneMan.cmAge}</TD>
					<TD>${CraneMan.cmPhone}</TD>
					<TD>${CraneMan.cmSal}</TD>
					<TD>${CraneMan.cmAddress}</TD>
					<TD>${CraneMan.status}</TD>
					<TD>${CraneMan.company}</TD>
					<TD><a href="delete?cmId=${CraneMan.cmId}">删除</a></TD>
					<TD><a href="findById?cmId=${CraneMan.cmId}">修改</a></TD>
					
				</TR>
			</c:forEach>
		</TABLE>
</body>
</html>