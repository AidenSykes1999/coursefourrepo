<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Bookings</title>
</head>
<body>
    <h2>List of Bookings</h2>
    <c:forEach items="${bookings}" var="booking">
        <div style="color:brown; margin-bottom:2px; padding:20px;">
            <p>Booked From: ${booking.fromLocation}</p>
            <p>Booked To: ${booking.toLocation}</p>
            <p>Cab Type: ${booking.cabType}</p>
            <p>Distance: ${booking.distance}</p>
            <p>Fare: ${booking.fare}</p>
            <hr/>
        </div>
    </c:forEach>
</body>
</html>
