<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<body>
	<h2>Templates list</h2>

	<label> templates</label>
	<select name="template">
		<c:forEach items="${templates}" var="template">
			<option>${template.name}</option>
		</c:forEach>
	</select>
</body>
</html>