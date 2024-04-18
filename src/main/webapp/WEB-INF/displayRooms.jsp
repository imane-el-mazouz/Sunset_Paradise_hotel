<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List of Available Rooms</title>
</head>
<body>
    <h1>List of Available Rooms</h1>
    <table border="1">
        <thead>
            <tr>
                <th>Type</th>
                <th>Prix</th>
                <th>Equipements</th>
                <th>Availaibility</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="room" items="${availableRooms}">
                <tr>
                    <td>${room.type}</td>
                    <td>${room.price}</td>
                    <td>${room.equipments}</td>
                    <td>${room.available ? 'Available' : 'Not Available'}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
