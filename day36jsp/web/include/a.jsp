<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%@ include file="/include/f.jsp"%>
<jsp:include page="f.jsp"></jsp:include>这个就是都动态包含--%>
<%--
    动态包含
        <jsp:include page="f.jsp"></jsp:include>
        page属性:就是你要指定包含的jsp页面路径
        动态包含也可以像静态包含一样,把被包含的内容输出到包含位置
        
        动态包含的特点:
            1.会把包含的jsp页面翻译为java代码
            2.动态包含也可以像静态包含一样,把被包含的内容输出到包含位置
            3.还可以传递参数
--%>
<jsp:include page="f.jsp">
    <jsp:param name="username" value="zs"/>
    <jsp:param name="password" value="123456"/>
</jsp:include>
</body>
</html>
