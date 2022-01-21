<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    pageContext对象的作用
        1.协议
        2.服务器ip
        3.服务器端口号
        4.获取工程路径
        5.获取请求方法
        6.获取客户端
        7.获取会话的id

        request.getScheme():获取请求的协议
        request.getServerName(): 获取请求服务器的ip或域名
        request.getServerPort():获取服务器的端口号
        getContextPath():获取工程路径
        getMethod():获取请求方式
        getRemoteHost():获取客户端的ip地址
        getId():获取会话的唯一id
--%>
<%--    <%= request.getScheme()%><br>--%>
    <%
        pageContext.setAttribute("req",request);
    %>
        1.协议: ${req.scheme}<br>
        2.服务器ip: ${req.serverName}<br>
        3.服务器端口号: ${req.serverPort}<br>
        4.工程路径; ${req.contextPath}<br>
        5.请求方法: ${req.method}<br>
        6.客户端ip ${req.remoteHost}<br>
        7.获取会话id: ${req.session.id}<br>
        ${pageContext.request.serverName}

</body>
</html>
