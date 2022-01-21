<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    <c: set/>很少使用
    作用:往作用域里面保存数据
    域对象:setAttribute(key,value)
    scope属性设置保存到哪个作用域
        page表示pageContext域
        request....
        session....
        application...表示ServletContext域
        var 属性设置key为多少
        value属性设置值
--%>
    保存之前:${sessionScope.qwe}<br>
    <c:set scope="session" var="qwe" value="qweValue"/>
    保存之后:${sessionScope.qwe}
</body>
</html>
