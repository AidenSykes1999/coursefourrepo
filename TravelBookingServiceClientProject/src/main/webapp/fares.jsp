<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Calculate Fare</title>
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
</head>
<body>
    <div>
        <h2>Calculate Fare</h2>
        <form id="fareForm" action="/fare" method="post">
            <label>Distance (in KM):</label>
            <input type="number" id="distance" name="distance" step="0.1" required><br><br>

            <label>Type of Cab:</label>
            <select id="cabType" name="cabType" required>
                <option value="">-- Select --</option>
                <option value="Basic">Basic</option>
                <option value="Premium">Premium</option>
                <option value="Premium+">Premium+</option>
            </select><br><br>

            <button type="submit">Calculate Fare</butzton>
        </form>

        <br>

        <c:if test="${not empty error}">
            <p style="color: red;">${error}</p>
        </c:if>

        <c:if test="${not empty fare}">
            <p>The calculated fare is: £${fare}</p>
        </c:if>
    </div>
</body>
</html>