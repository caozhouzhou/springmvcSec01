<%--
  Created by IntelliJ IDEA.
  User: czz
  Date: 2019/9/12
  Time: 16:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="third_part/jquery/3.4.1/js/jquery-3.4.1.min.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"username":"czz","password":"123","age":"30"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                         alert(data);
                         alert(data.username);
                    }
                });
            });
        });
    </script>
</head>
<body>
    <h3>resonseTest</h3>
    <a href="user/testString">testString</a>
    <br/>
    <a href="user/testVoid">testVoid</a>
    <br/>
    <a href="user/testModelAndView">testModelAndView</a>
    <br/>
    <a href="user/testForWard">testForWard</a>
    <br/>
    <a href="user/testRedirect">testRedirect</a>
    <br/>
    <button id="btn">发送ajax请求</button>

</body>
</html>
