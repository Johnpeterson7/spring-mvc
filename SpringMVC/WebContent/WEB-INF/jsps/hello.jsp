<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Hello How are you </h1>
<c:if test="${not empty requestScope.message}">
				      <span id="ErrorMsg">${requestScope.message}</span>
				      <br/>
				</c:if>
<form method="get" action="login" >
Enter userName <input type="text" name="userName"/>
Enter pwd <input type="text" name="pwd"/>
<input type="submit" value="submit" name="submit"/>

</form>

</body>
</html>