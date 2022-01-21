<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
        jsp里面是内置session对象，有了session对象，那么浏览器就会携带一个名为"JSESSIONID"的cookie
        我们的目标就是获取"JSESSIONID"的值
    --%>
    <%
        Cookie[] cookies = request.getCookies();
        String cookieValues = null;
        if (cookies != null){
            for (Cookie cookie: cookies) {
                if (cookie.getName().equals("JSESSIONID")){
                    cookieValues = cookie.getValue();
                }
            }
        }
    %>
    获取jessionId:${cookie.JSESSIONID}<br>
    获取jessionId的value:${cookie.JSESSIONID.value}
</body>
</html>
