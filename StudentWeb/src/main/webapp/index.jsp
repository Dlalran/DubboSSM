<%--
  Created by IntelliJ IDEA.
  User: Howard Zhong
  Date: 2019/12/20
  Time: 5:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="StudentController/queryStudent.action" method="get">
        学号:<input name="stuNo"/>
        <input type="submit" value="查询"/>
    </form>
    <form action="StudentController/addStudent.action" method="post">
        学号:<input name="stuNo"/>
        姓名:<input name="stuName"/>
        年龄:<input name="stuAge"/>
        <input type="submit" value="提交"/>
    </form>
</body>
</html>
