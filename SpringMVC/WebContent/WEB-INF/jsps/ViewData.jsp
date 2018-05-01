<!-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Please find the report below.</h1>
				      <br/>
<table border="1" class="confirmation-table" width="100%" style="table-layout: fixed;">
				<col width="6%">
				<col width="15%">
				<col width="12%">
				<col width="6%">
				<col width="5%">
				<col width="12%">
				<tr class="heading">
				<th align="left">Hour</th>
					<th>LOCATION</th>
					<th>COMMODITY</th>
					<th>Min</th>
					<th>Actual</th>
					<th>Cumulative</th>
				</tr>
				<c:set var="cumulativesum" value="${0}"/>
				<c:forEach items="${result}"
					var="hoistObj" varStatus="rowNum">
									<c:set var="cumulativesum" value="${cumulativesum+hoistObj.actual}"/>
					
				<tr><td>${hoistObj.hours} </td><td>${hoistObj.location}</td><td>${hoistObj.min}</td><td>${hoistObj.actual}</td>
				<td>${hoistObj.actual}</td> <td>${cumulativesum}</td> 
				</tr>
				</c:forEach>    
			
				
</body>
</html>