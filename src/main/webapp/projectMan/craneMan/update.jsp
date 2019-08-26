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
	<form action="update" method="post">
		id: <input type="text" name="cmId" value="${CraneMan.cmId}" /> <br />
		name: <input type="text" name="cmName" value="${CraneMan.cmName}" />
		<br /> sex: <input type="text" name="cmSex"
			value="${CraneMan.cmSex}" /> <br /> age: <input type="text"
			name="cmAge" value="${CraneMan.cmAge}" /> <br /> phone: <input
			type="text" name="cmPhone" value="${CraneMan.cmPhone}" /> <br />
		sal: <input type="text" name="cmSal" value="${CraneMan.cmSal}" /> <br />
		address: <input type="text" name="cmAddress"
			value="${CraneMan.cmAddress}" /> <br /> status: <input
			type="text" name="status" value="${CraneMan.status}" /> <br />
		company: <input type="text" name="company"
			value="${CraneMan.company}" /> <br /> <input type="submit"
			value="修改" />
	</form>
</body>
</html>