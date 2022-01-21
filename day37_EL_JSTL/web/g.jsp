<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--
    El表达式的隐含对象11个
    El表达式中自己定义的,可以直接使用
变量                  类型                              作用
   pageContext		    PageContextImpl 			它可以获取 jsp 中的九大内置对象
   pageScope 		    Map<String,Object>       	它可以获取 pageContext 域中的数据
   requestScope 	    Map<String,Object> 	      	它可以获取 Request 域中的数据
   sessionScope	        Map<String,Object> 			它可以获取 Session 域中的数据
   applicationScope 	Map<String,Object> 			它可以获取 ServletContext 域中的数据
   param			    Map<String,String>		    它可以获取请求参数的值
   paramValues		    Map<String,String[]>		它也可以获取请求参数的值，获取多个值的时候使用。
   header 		     	Map<String,String> 			它可以获取请求头的信息
   headerValues		    Map<String,String[]> 		它可以获取请求头的信息，它可以获取多个值的情况
   cookie 			    Map<String,Cookie>			它可以获取当前请求的 Cookie 信息
   initParam	    	Map<String,String> 			它可以获取在 web.xml 中配置的<context-param>上下文参数

    El获取四个特定域中的属性
    pageScope 		    Map<String,Object>       	它可以获取 pageContext 域中的数据
   requestScope 	    Map<String,Object> 	      	它可以获取 Request 域中的数据
   sessionScope	        Map<String,Object> 			它可以获取 Session 域中的数据
   applicationScope 	Map<String,Object> 			它可以获取 ServletContext 域中的数据

--%>
    <%
        pageContext.setAttribute("key1","pageContext1");
        pageContext.setAttribute("key2","pageContext2");
        request.setAttribute("key2","request");
        session.setAttribute("key2","session");
        application.setAttribute("key2","application");
    %>
    ${applicationScope.key2}<br>
    ${requestScope.key2}<br>
</body>
</html>
