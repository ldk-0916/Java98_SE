<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${1+1}<br>
    ${15/3}或${15 div 3}<br>
    ${10 % 3} 或 ${10 mod 3}
    <hr>
    ${11 == 11} 或 ${11 eq 11}<br>
    ${11 != 11} 或 ${11 ne 11}<br>
    ${11 > 11} 或 ${11 gt 11}<br>
    ${11 < 11}或 ${11 lt 11}<br>
    ${11 >= 11} 或 ${ 11 ge 11}<br>
    ${11 <= 11} 或 ${11 le 11}<br>
    <hr>
    ${12 == 12 && 12 > 10} 或 ${12 == 12 and 12 > 10}<br>
    ${12 == 12 || 12 > 10} 或 ${12 == 12 or 12 > 10}<br>
    ${! true} 或 ${not true}<br>
</body>
</html>
