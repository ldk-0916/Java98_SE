<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--
        if标签
            <c: if/>
            就是用来做if判断的
            test属性:表示判断的条件(使用El表达式)
           特点:
            如果test里面的是true, if标签体里面的就会执行
            如果test里面的是false, if标签体里面的就不会执行
            没有else的
    --%>
    <c:if test="${10 == 10}">
        <h3>10等于10</h3>
    </c:if>
    <c:if test="${10 != 10}">
        <h3>10不等于10</h3>
    </c:if>
</body>
</html>
