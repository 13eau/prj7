<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="findAll">
		uname<INPUT TYPE="text" NAME="uname" value="${log.uname }">action<INPUT
			TYPE="text" value="${log.action }" NAME="action"><input
			type="submit" value="Query">
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
					<TD>${projectMan.pmId}</TD>
					<TD>${projectMan.pmName}</TD>
					<TD>${projectMan.pmSex}</TD>
					<TD>${projectMan.pmAge}</TD>
					<TD>${projectMan.pmPhone}</TD>
					<TD>${projectMan.pmSal}</TD>
					<TD>${projectMan.pmAddress}</TD>
					<TD>${projectMan.status}</TD>
					<TD>${projectMan.company}</TD>
				</TR>
			</c:forEach>
		</TABLE>
	</form>
</body>
</html>