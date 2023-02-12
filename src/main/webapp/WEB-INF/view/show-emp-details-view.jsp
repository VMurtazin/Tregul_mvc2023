<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<body>

<br>

<h2>You are welcome!!!</h2>
<br>
<br>

<%--Your name:${param.employeeName}--%>

Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your e-mail: ${employee.email}
<br>
Your car: ${employee.carBrend}
<br>

Languages:

<ul>
    <c:forEach var="lang" items="${employee.langs}">

        <li>
            ${lang}
        </li>
    </c:forEach>

</ul>

</body>
</html>