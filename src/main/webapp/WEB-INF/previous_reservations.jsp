<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Previous Reservations</title>
</head>
<body>
    <h1>Previous Reservations</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Reservation ID</th>
                <th>Check-In Date</th>
                <th>Check-Out Date</th>
                <th>Number of Guests</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="reservation" items="${previousReservations}">
                <tr>
                    <td>${reservation.id}</td>
                    <td>${reservation.checkInDate}</td>
                    <td>${reservation.checkOutDate}</td>
                    <td>${reservation.numberOfGuests}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>






