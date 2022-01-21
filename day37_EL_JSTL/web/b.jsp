<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--搜素域数据的顺序  优先获取的是最小的--%>
    <%
        //往四个作用域里面都保存相同的key
        request.setAttribute("key","request");
        session.setAttribute("key","session");
        application.setAttribute("key","application");
        pageContext.setAttribute("key","pageContext");
    %>
    ${key}
</body>
</html>
