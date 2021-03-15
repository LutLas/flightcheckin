<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start Check-In</title>
</head>
<body>
<h3>Flight Check-In</h3>


<form action="startCheckIn" method="post">
<h4>Enter Reservation ID</h4>
<pre>
ID:<input type="text" name="reservationId"/>

<input type="submit" value="Start Check-In"/>
</pre>
</form>
</body>
</html>