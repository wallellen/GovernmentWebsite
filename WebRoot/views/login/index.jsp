<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="path"
	scope="page" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>登录</title>
<link rel="stylesheet" type="text/css" href="${path}/css/login.css">
<script type="text/javascript" src="${path}/js/login.js"></script>
</head>
<body>
	<div class="container">
		<div class="panel panel-primary form-signin">
			<div class="panel-heading">
				<h3 class="panel-title">登 录</h3>
			</div>
			<div class="panel-body">
				<form action="login.htm" method="post">
					<div class="form-group">
						<label for="exampleInputEmail1">用户名</label> <input type="text"
							class="form-control input-sm" id="name" name="name"
							placeholder="请输入用户名">
					</div>

					<div class="form-group">
						<label for="exampleInputPassword1">密码</label> <input
							type="password" class="form-control input-sm" id="password"
							name="password" placeholder="请输入密码">
					</div>

					<button type="submit" class="btn btn-default">登录</button>
				</form>
			</div>
		</div>
	</div>
	<!-- /container -->
</body>
</html>
