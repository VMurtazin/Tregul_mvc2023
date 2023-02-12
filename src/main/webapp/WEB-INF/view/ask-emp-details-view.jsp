<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>

<body>

<br>
<br>
<h2>Enter you details</h2>
<%--<form action="/showDetails" method="get">--%>
<%--    <input type="text" name="employeeName"--%>
<%--           placeholder="write you name"/>--%>
<%--    <input type="submit"/>--%>
<%--</form>--%>
<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    Select Car:
    BMW <form:radiobutton path="carBrend" value="BMW 320"/>
    Ford<form:radiobutton path="carBrend" value="Ford Fokus"/>
    Audi<form:radiobutton path="carBrend" value="Audi 100"/>
    <br><br>
    Language(s)
    EN<form:checkbox path="langs" value="English"/>
    FR<form:checkbox path="langs" value="Franch"/>
    CH<form:checkbox path="langs" value="China"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>