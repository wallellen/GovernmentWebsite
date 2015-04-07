<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="path"
	scope="page" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>


<title>登录</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<link rel="stylesheet" type="text/css"
	href="${path}/js/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${path}/js/bootstrap/css/bootstrap-theme.min.css">
<script type="text/javascript" src="${path}/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src="${path}/js/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${path}/js/login.js"></script>
</head>
<style>
body {
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #eee;
}

.form-signin {
	max-width: 400px;
	margin: 0 auto;
}

.input-block {
	display: block;
	width: 100%;
}
</style>
<body>

	<div class="container">
		<div class="panel panel-primary form-signin">
			<div class="panel-heading">
				<h3 class="panel-title">登 录</h3>
			</div>
			<div class="panel-body">
				<form>
					<div class="form-group">
						<label for="exampleInputEmail1">用户名</label> <input
							type="email" class="form-control input-sm" id="exampleInputEmail1"
							placeholder="请输入用户名">
					</div>
					
					<div class="form-group">
						<label for="exampleInputPassword1">密码</label> <input
							type="password" class="form-control input-sm" id="exampleInputPassword1"
							placeholder="请输入密码">
					</div>
					
					<button type="submit" class="btn btn-default">登录</button>
				</form>
			</div>
		</div>


	</div>
	<!-- /container -->

</body>
</html>
