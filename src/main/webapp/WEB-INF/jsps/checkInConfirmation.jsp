<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Check-In Confirmation</title>
</head>
<body>
${updatedReservation.passenger.firstName} Checked-In Successfully<br/>
<a href="/flightCheckIn">Home</a>
</body>
</html>