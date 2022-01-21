<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        //1.值为null的时候,为空
        request.setAttribute("emptyValue",null);
        //2.值为空字符串的时候,为空
        request.setAttribute("emptyStr","");
        //3.值为Object类型数组的时候
        request.setAttribute("emptyArr",new Object[]{});
        //4.list集合,元素个数为0
        List<String> list = new ArrayList<>();
        list.add("abc");
        request.setAttribute("emptyList",list);
        //5.map集合,元素个数为0
        Map<String,Object> map = new HashMap<>();
        map.put("key","value");
        request.setAttribute("emptyMap",map);
    %>
    <%--判断是否为空--%>
    ${empty emptyValue}<br>
    ${empty emptyStr}<br>
    ${empty emptyArr}<br>
    ${empty emptyList}<br>
    ${empty emptyMap}<br>
</body>
</html>
