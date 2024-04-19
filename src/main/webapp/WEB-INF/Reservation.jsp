<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Booking room </h1>

<form action="CreateReservationServlet" method="get">
    <label for="id">ID:</label> <input type="text" id="id" name="id" required><br>   
    <label for="reservedRoom">Reserved Room:</label> <input type="text" id="reservedRoom" name="reservedRoom" required><br>   
    <label for="checkInDate">Check-In Date:</label> <input type="date" id="checkInDate" name="checkInDate" required><br>   
    <label for="checkOutDate">Check-Out Date:</label> <input type="date" id="checkOutDate" name="checkOutDate" required><br>   
    <label for="numberOfGuests">Number of Guests:</label> <input type="number" id="numberOfGuests" name="numberOfGuests" required><br> 
    <input type="submit" value="Book">
</form>


</body>
</html>