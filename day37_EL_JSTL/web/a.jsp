<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        request.setAttribute("key","value");
    %>
    表达式脚本key的值:<%=request.getAttribute("key")%><br>
    EL表达式输出key的值:${key}

</body>
</html>
