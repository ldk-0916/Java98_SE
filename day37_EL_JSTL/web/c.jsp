<%@ page import="com.yys.pojo.Person" %>
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
        Person person = new Person();
        person.setName("张三");
        person.setPhones(new String[]{"4008823823","10086","40048517517","10010"});

        List<String> cities = new ArrayList<>();
        cities.add("南京");
        cities.add("苏州");
        cities.add("无锡");
        person.setCities(cities);

        Map<String,Object> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        person.setMap(map);
        pageContext.setAttribute("p",person);
    %>
    获取Person: ${p}<br>
    获取Person的name属性:${p.name}<br>
    获取person中的cities集合的元素的值:${p.cities}<br>
    获取Person的cities集合中元素为"苏州"的值:${p.cities[1]}<br>
    获取person对象中Map集合的元素:${p.map}<br>
    获取Person的Map集合中的某个元素:${p.map.key3}
</body>
</html>
