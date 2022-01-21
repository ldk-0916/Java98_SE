<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        <c:choose> <c:when> <c:otherWise>
        作用:多路判断,跟switch... case ..default非常像
        choose:标签开始的选择
        when:表示每一种判断情况
        otherWise:就是剩下的情况

        test:表示当前判断条件的结果
       --%>
    <%
        request.setAttribute("course","java");
    %>
    <%-- html注释   --%>
    <c:choose>
        <c:when test="${requestScope.course == 'java'}">
            学习java
        </c:when>
        <c:when test="${requestScope.course == 'php'}">
            狗都不学
        </c:when>
        <c:when test="${requestScope.course == 'c'}">
            入门即放弃
        </c:when>
        <c:otherwise>
            其他语言
        </c:otherwise>
    </c:choose>

</body>
</html>
