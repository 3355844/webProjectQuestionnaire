<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 27.01.2017
  Time: 13:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Questionnaire</title>
</head>
<body>
<form action="/" method="post" name="answer">
    <p>Write your name and age</p>
    <p><input type="text" name="name">Your Name</p>
    <p><input type="text" name="age">Your Age</p>
    <p>What your sex</p>
    <p>
        <input type="radio" name="sex" value="man"> Man
        <input type="radio" name="sex" value="women"> Women
    </p>
    <p>What salary you want? </p>
    <p><select name="salary" size="1">
        <option value="500">Start salary 500$</option>
        <option value="600">Start salary 600$</option>
        <option value="800">Start salary 800$</option>
        <option value="1000">Start salary 1000$</option>
    </select>
    </p>
    <p>What kind of transport you have? </p>
    <p>
        <input type="checkbox" name="transport" value="car">Car<br/>
        <input type="checkbox" name="transport" value="bicycle">Bicycle<br/>
        <input type="checkbox" name="transport" value="motorcycle">Motorcycle<br/>
        <input type="checkbox" name="transport" value="boat">Boat<br/>
    </p>
    <p><input type="submit" value="RESULT"></p>
</form>
</body>
</html>
