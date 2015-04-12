<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set value="${pageContext.request.contextPath}" var="path"
	scope="page" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title><sitemesh:write property="title" /></title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<link rel="stylesheet" type="text/css"
	href="${path}/js/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="${path}/js/bootstrap/css/bootstrap-theme.min.css">
<script type="text/javascript" src="${path}/js/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src="${path}/js/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${path}/js/index.js"></script>

<style>
.dropdown-submenu {
	position: relative;
}

.dropdown-submenu>.dropdown-menu {
	top: 0;
	left: 100%;
	margin-top: -6px;
	margin-left: -1px;
	-webkit-border-radius: 0 6px 6px 6px;
	-moz-border-radius: 0 6px 6px 6px;
	border-radius: 0 6px 6px 6px;
}

.dropdown-submenu:hover>.dropdown-menu {
	display: block;
}

.dropdown-submenu>a:after {
	display: block;
	content: " ";
	float: right;
	width: 0;
	height: 0;
	border-color: transparent;
	border-style: solid;
	border-width: 5px 0 5px 5px;
	border-left-color: #cccccc;
	margin-top: 5px;
	margin-right: -10px;
}

.dropdown-submenu:hover>a:after {
	border-left-color: #ffffff;
}

.dropdown-submenu .pull-left {
	float: none;
}

.dropdown-submenu.pull-left>.dropdown-menu {
	left: -100%;
	margin-left: 10px;
	-webkit-border-radius: 6px 0 6px 6px;
	-moz-border-radius: 6px 0 6px 6px;
	border-radius: 6px 0 6px 6px;
}
.myclearfix{
	text-align:center;
}
</style>
<sitemesh:write property="head" />
</head>
<body>
	<nav class="navbar navbar-default">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#">政府网站</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">信息中心 <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="dropdown-submenu"><a tabindex="-1" href="#">党风廉政信息</a>
							<ul class="dropdown-menu">
								<li><a href="#">意见箱</a></li>
								<li><a href="#">反腐举报</a></li>
							</ul></li>
						<li><a href="#">通知公告</a></li>
						<li><a href="#">便民查询</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">农村名片 <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="dropdown-submenu"><a href="#">村情概况</a>
							<ul class="dropdown-menu">
								<li><a href="#">村简介</a></li>
								<li><a href="#">村工作人员</a></li>
								<li><a href="#">村发展规划</a></li>
							</ul></li>
						<li class="dropdown-submenu"><a href="#">村务公开</a>
							<ul class="dropdown-menu">
								<li><a href="#">年度工作计划</a></li>
								<li><a href="#">村民小组成员</a></li>
								<li><a href="#">理财小组成员</a></li>
								<li><a href="#">建设工程申请</a></li>
								<li><a href="#">政府收入</a></li>
								<li><a href="#">理财结果</a></li>
							</ul></li>
						<li class="dropdown-submenu"><a href="#">惠农政策</a>
							<ul class="dropdown-menu">
								<li><a href="#">农技知识</a></li>
								<li><a href="#">相关政策</a></li>
							</ul></li>
					</ul></li>

				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">人口与资源管理 <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li class="dropdown-submenu"><a href="#">家庭人口与财产信息</a>
							<ul class="dropdown-menu">
								<li><a href="#">家庭财产及住房面积</a></li>
								<li><a href="#">户耕种类及面积</a></li>
								<li><a href="#">人口五保生育信息</a></li>
							</ul></li>
						<li><a href="#">水资源统计</a></li>
						<li><a href="#">土地统计</a></li>
					</ul></li>
			</ul>
			<div class="nav navbar-nav navbar-right">
				<div style="padding-top:10px;">
					<button id="login" type="button" onclick="login()"
						class="btn btn-sm btn-success">登录</button>
					<button id="regist" type="button" class="btn btn-sm btn-default">注册</button>
				</div>
			</div>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>
	<sitemesh:write property="body" />
	<footer>
	<div class="myclearfix">
		<span>©2015 GovernmentWebsite</span>
	</div>
	</footer>
</body>
</html>
