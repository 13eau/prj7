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
		id: <input type="text" name="pmId" value="${projectMan.pmId}" /> <br />
		name: <input type="text" name="pmName" value="${projectMan.pmName}" />
		<br /> sex: <input type="text" name="pmSex"
			value="${projectMan.pmSex}" /> <br /> age: <input type="text"
			name="pmAge" value="${projectMan.pmAge}" /> <br /> phone: <input
			type="text" name="pmPhone" value="${projectMan.pmPhone}" /> <br />
		sal: <input type="text" name="pmSal" value="${projectMan.pmSal}" /> <br />
		address: <input type="text" name="pmAddress"
			value="${projectMan.pmAddress}" /> <br /> status: <input
			type="text" name="status" value="${projectMan.status}" /> <br />
		company: <input type="text" name="company"
			value="${projectMan.company}" /> <br /> <input type="submit"
			value="修改" />
	</form>
</body>
</html>