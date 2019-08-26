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
		id: <input type="text" name="cmId" /> <br /> name: <input
			type="text" name="cmName" /> <br /> sex: <input type="text"
			name="cmSex" /> <br /> age: <input type="text" name="cmAge" /> <br />
		phone: <input type="text" name="cmPhone" /> <br /> sal: <input
			type="text" name="cmSal" /> <br /> address: <input type="text"
			name="cmAddress" /> <br /> status: <input type="text" name="status" />
		<br /> company: <input type="text" name="company" /> <br /> <input
			type="submit" value="添加" />
	</form>
</body>
</html>