<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>
<%@ page import="com.yys.pojo.Student" %>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>foreach标签</title>
</head>
<body>
    <%--
           需求:遍历1-10,输出
           begin:属性设置开始的索引
           end:结束的索引
           var:循环变量
    --%>
   <%-- <table border="1">
        <c:forEach begin="1" end="10" var="i">
            <tr>
                <td>第${i}行</td>
            </tr>
        </c:forEach>
    </table>
--%>
    <%--
        遍历object数组
        for(Objec item : arr)
        items:表示我们要遍历的数据源(遍历的集合)
        var:表示当前遍历的数据

    --%>
        <%--    遍历数组 --%>
    <%
        request.setAttribute("arr",new String[]{"zs","ls","ww"});
    %>
    <c:forEach items="${requestScope.arr}" var="item">
        ${item}
    </c:forEach>
    <hr/>

    <%--遍历Map集合--%>
    <%
        Map<String,Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");
        request.setAttribute("map",map);
    %>
    <c:forEach items="${requestScope.map}" var="entry">
        ${entry}
    </c:forEach>
    <hr/>
    <%--遍历List集合 list里面存放一个Student对象,有属性:编号,用户名,密码,年龄,电话--%>
    <%
        List<Student> studentList = new ArrayList<>();
        for (int i = 1; i < 10 ; i++) {
            studentList.add(new Student(i,"username"+i,"password"+i,18+i,"phone"+i));
        }
        request.setAttribute("stus",studentList);
    %>
    <table border="1">
        <tr>
            <th>编号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>年龄</th>
            <th>电话</th>
        </tr>
    </table>
    <%--
        step:遍历的步长值
        varStatus:表示当前遍历的数据的状态
    --%>
    <c:forEach begin="2" end="8" step="2" varStatus="status" items="${requestScope.stus}" var="stu">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.password}</td>
            <td>${stu.age}</td>
            <td>${stu.phone}</td>
            <td>${status.step}</td>
        </tr>
    </c:forEach>
</body>
</html>
