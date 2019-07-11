<%--
  Created by IntelliJ IDEA.
  User: tomas
  Date: 11.07.2019
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="/calculateLength" method="post">
    <fieldset>
        <legend>Przelicznik metryczny</legend>
        <input type="text" placeholder="metry" name="meter"/>
        <input type="text" placeholder="centymetry" name="centymeter"/>
        <input type="text" placeholder="milimetry" name="milimeter"/>
        <button type="submit" value="przelicz" name="calcualtemeter">Przelicz</button>
    </fieldset>
</form>
<form action="/calculateWeight" method="post">
    <fieldset>
        <legend>Przelicznik wag</legend>
        <input type="text" placeholder="kilogramy" name="kilogram"/>
        <input type="text" placeholder="gramy" name="gram"/>
        <input type="text" placeholder="miligramy" name="miligram"/>
        <button type="submit" value="przelicz" name="calcualtemeter">Przelicz</button>

    </fieldset>
</form>
</form>
</body>
</html>
