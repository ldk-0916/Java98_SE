<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    三元运算表达式:
        表达式1 ? 表达式2:表达式3
        如果1为真,返回值为2,如果为假,返回3

--%>
    ${ 100 != 100 ? "别玩手机了":"一起敲代码"}<br>

    <%--
        .运算符;中括号运算符
        .点运算,可以输出JavaBean对象中某个属性的值
        []中括号运算,可以输出有序集合中的某个元素的值
    --%>
    <%
        Map<String,Object> map = new HashMap<>();
        map.put("q.q.q","qqqvalue");
        map.put("w+w+w","wwwvalue");
        map.put("e-e-e","eeevalue");
        request.setAttribute("map",map);
    %>
    ${map["q.q.q"]}<br>
    ${map["w+w+w"]}<br>
    ${map["e-e-e"]}<br>
</body>
</html>
