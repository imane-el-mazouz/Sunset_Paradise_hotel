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

<form action="CreateReservationServlet" method="post">
     <label for="checkInDate">Check-In Date:</label> <input type="date" name="checkInDate" required><br>   
     <label for="checkOutDate">Check-Out Date:</label> <input type="date" name="checkOutDate" required><br>   
     <label for="numberofGuests">number-of-Guests:</label> <input type="number" name="numberofGuests" required><br>   
     <input type="submit" value="Reserve">
      
 
</form>

</body>
</html>