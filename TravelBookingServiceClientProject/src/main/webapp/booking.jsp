<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Book A Cab</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        div {
            border: 2px solid orange;
            padding: 20px;
            margin: 20px;
        }
    </style>
    <script>
        function calculateFare() {
        	
            const distance = parseFloat(document.getElementById('distance').value);
            const cabType = document.getElementById('cabType').value;

            let fare = 0;

            if (cabType === "Basic") {
                fare = distance * 2;
            } else if (cabType === "Premium") {
                fare = distance * 1.5;
            } else if (cabType === "Premium+") {
                fare = distance * 1.2;
            }

            document.getElementById('fare').value = fare.toFixed(2);
        }
    </script>
</head>
<body>
    <div>
        <h2>Book A Cab</h2>
        <form action="add" method="post" onsubmit="calculateFare()">
            <label>From Location:</label>
            <input type="text" name="fromLocation" required><br><br>
            <label>To Location:</label>
            <input type="text" name="toLocation" required><br><br>
            <label>Distance (in KM):</label>
            <input type="number" id="distance" name="distance" step="0.1" required><br><br>
            <label>Type of Cab:</label>
            <select id="cabType" name="cabType" required>
                <option value="Basic">Basic</option>
                <option value="Premium">Premium</option>
                <option value="Premium+">Premium+</option>
            </select><br><br>

            <input type="hidden" id="fare" name="fare">
            <button type="submit">Submit</button>
        </form>
    </div>
</body>
</html>