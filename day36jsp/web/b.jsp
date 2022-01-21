<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--声明属性、方法--%>
    <%!
        private Integer id;
        private String name;
        private static Map<String,Object>map;
    %>
    <%--声明静态代码块--%>
    <%!
        static {
            map = new HashMap<>();
            map.put("1","one");
            map.put("2","two");
            map.put("3","three");
        }
    %>

    <%--声明内部类--%>
    <%!
        public static class A{
            private Integer id = 10;
            private String s = "abc";
        }
    %>


    <%--练习--%>
   <%-- 输出整数型
    浮点型
    字符串
    对象型--%>
    <%=12 %><br>
    <%= 12.12 %><br>
    <%="我是张三" %><br>
    <%=map %><br>
    <%= request.getParameter("username")%>


    <%--代码脚本--%>
    <%
        int i = 10;
        if (i == 100){

    %>
    <h3>亡里红</h3>
    <%
        }else{

    %>
    <h3>完犊子了</h3>
    <%
        }
    %>

<%--for循环--%>
    <table border="1" cellspacing="0">
    <%
        for (int j = 0; j < 10; j++) {
            System.out.println("你完犊子了..");
        }
    %>
    </table>

    <%--翻译后的java文件中的_jspService()方法内的代码都可以写--%>
    <%
        String username = request.getParameter("username");
        System.out.println("用户名参数值:"+username);
    %>
</body>
</html>
