<%@ page import="com.yys.pojo.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List<Student> stuList = (List<Student>) request.getAttribute("stuList");
%>
    <table border="1">
        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>年龄</td>
            <td>电话</td>
        </tr>
        <%
            for (Student stu : stuList) {%>
            <tr>
                <td><%=stu.getId()%></td>
                <td><%=stu.getName()%></td>
                <td><%=stu.getAge()%></td>
                <td><%=stu.getPhone()%></td>
            </tr>
            <%}%>
    </table>
</body>
</html>
