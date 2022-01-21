<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope.jsp</title>
</head>
<body>
    <h1>Scope.jsp页面</h1>
    <%
        //分别向四个作用域存储数据
        pageContext.setAttribute("key","pageContext");
        request.setAttribute("key","request");
        session.setAttribute("key","session");
        application.setAttribute("key","application");
    %>
    pageContext域是否有值:<%= pageContext.getAttribute("key")%><br>
    request域是否有值:<%=request.getAttribute("key")%><br>
    session域是否有值:<%=session.getAttribute("key")%><br>
    application域是否有值:<%=application.getAttribute("key")%><br>

    <%
        //request.getRequestDispatcher("/Scope2.jsp").forward(request,response);
        response.sendRedirect("/Scope2.jsp");
    %>
</body>
</html>
