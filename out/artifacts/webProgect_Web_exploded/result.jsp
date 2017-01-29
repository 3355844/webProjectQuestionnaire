<%--
  Created by IntelliJ IDEA.
  User: 33558
  Date: 29.01.2017
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<p>Here is survey results</p>
<table border="2">
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanAge()}</td>
        <td>years old</td>
    </tr>
    <tr>
        <td>number of surveyed men</td>
        <td>${statisticManager.getHumanMan()}</td>
        <td>people</td>
    </tr>
    <tr>
        <td>number of surveyed women</td>
        <td>${statisticManager.getHumanWomen()}</td>
        <td>people</td>
    </tr>
    <tr>
        <td>average salary</td>
        <td>${statisticManager.getHumanSalary()}</td>
        <td>$</td>
    </tr>
    <tr>
        <td>the presence of surveyed car</td>
        <td>${statisticManager.getHumanCar()}</td>
        <td>units</td>
    </tr>
    <tr>
        <td>the presence of surveyed bicycle</td>
        <td>${statisticManager.getHumanBicycle()}</td>
        <td>units</td>
    </tr>
    <tr>
        <td>the presence of surveyed motorcycle</td>
        <td>${statisticManager.getHumanMotorcycle()}</td>
        <td>units</td>
    </tr>
    <tr>
        <td>the presence of surveyed boat</td>
        <td>${statisticManager.getHumanBoat()}</td>
        <td>units</td>
    </tr>
</table>
<p><a href="welcome.jsp">To Questionnaire </a> </p>
</body>
</html>
