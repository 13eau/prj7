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
	<form action="save" method="post">
		id: <input type="text" name="pmId" /> <br /> name: <input
			type="text" name="pmName" /> <br /> sex: <input type="text"
			name="pmSex" /> <br /> age: <input type="text" name="pmAge" /> <br />
		phone: <input type="text" name="pmPhone" /> <br /> sal: <input
			type="text" name="pmSal" /> <br /> address: <input type="text"
			name="pmAddress" /> <br /> status: <input type="text" name="status" />
		<br /> company: <input type="text" name="company" /> <br /> <input
			type="submit" value="添加" />
	</form>
</body>
</html>