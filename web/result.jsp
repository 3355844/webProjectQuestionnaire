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
<table>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanAge()}</td>
    </tr>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanMan()}</td>
    </tr>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanWomen()}</td>
    </tr>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanSalary()}</td>
    </tr>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanCar()}</td>
    </tr>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanBicycle()}</td>
    </tr>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanMotorcycle()}</td>
    </tr>
    <tr>
        <td>the average age of respondents</td>
        <td>${statisticManager.getHumanBoat()}</td>
    </tr>
</table>
</body>
</html>
