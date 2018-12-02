<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: weilai
  Date: 2018/7/17
  Time: 下午3:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<c:set var="BASE" value="${pageContext.request.contextPath}"/>
<html>
<head>
    <title>客户管理 - 创建客户</title>
</head>
<body>
<h1>创建客户界面</h1>

<form id="customer_form" enctype="multipart/form-data">
    <table>
        <tr>
            <td><label for="name">客户名称：</label></td>
            <td>
                <input type="text" id="name" name="name" value="${customer.name}">
            </td>
        </tr>
        <tr>
            <td><label for="contact">联系人：</label></td>
            <td>
                <input type="text" id="contact" name="contact" value="${customer.contact}">
            </td>
        </tr>
        <tr>
            <td><label for="telephone">电话号码：</label></td>
            <td>
                <input type="text" id="telephone" name="telephone" value="${customer.telephone}">
            </td>
        </tr>
        <tr>
            <td><label for="email">邮箱地址：</label></td>
            <td>
                <input type="email" id="email" name="email" value="${customer.email}">
            </td>
        </tr>
        <tr>
            <td><label for="photo">照片：</label></td>
            <td>
                <input type="file" id="photo" name="photo" value="${customer.photo}">
            </td>
        </tr>
    </table>
    <button type="submit">保存</button>
</form>

<script src="${BASE}/asset/lib/jquery/jquery.min.js"></script>
<script src="${BASE}/asset/lib/jquery-form/jquery.form.min.js"></script>
<script>
    $(function () {
        $('#customer_form').ajaxForm({
            type: 'post',
            url: '${BASE}/customer_create',
            success: function (data) {
                if (data) {
                    location.href = '${BASE}/customer';
                }
            }
        })
    })
</script>

</body>
</html>
