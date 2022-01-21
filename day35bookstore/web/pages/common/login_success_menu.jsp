<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
    <span>欢迎<span class="um_span">${sessionScope.user.username}</span>光临风云书城</span>
    <%--如果已经登录,则显示登录成功之后的用户信息--%>
    <c:if test="${not empty sessionScope.user}">
        <a href="../order/order.jsp">我的订单</a>
        <a href="/userServlet?action=logout">注销</a>&nbsp;&nbsp;
        <a href="../../index.jsp">返回</a>
    </c:if>
</div>