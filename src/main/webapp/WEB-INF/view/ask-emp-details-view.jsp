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
    <br><br>
    Surname <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resourses" label="HR"/>
    <form:option value="Sales" label="SALES"/>
    </form:select>
    <br><br>
    <input type="submit" value="OK">
</form:form>

</body>
</html>