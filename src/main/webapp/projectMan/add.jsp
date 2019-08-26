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
		id: <input type="text" name="tmId" /> <br /> name: <input
			type="text" name="tmName" /> <br /> sex: <input type="text"
			name="tmSex" /> <br /> age: <input type="text" name="tmAge" /> <br />
		phone: <input type="text" name="tmPhone" /> <br /> sal: <input
			type="text" name="tmSal" /> <br /> address: <input type="text"
			name="tmAddress" /> <br /> status: <input type="text" name="status" />
		<br /> company: <input type="text" name="company" /> <br /> <input
			type="submit" value="添加" />
	</form>
</body>
</html>