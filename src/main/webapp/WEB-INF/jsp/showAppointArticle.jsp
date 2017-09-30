<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>审查文章</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="wangEditor-3.0.8/release/wangEditor.min.js"></script>
<script type="text/javascript">
	$(function() {
		var articleId = $("span[name='articleId']").text();
		$("#pass")
				.click(
						function() {
							location.href = "reviewAppointArticle?results=pass&articleId="
									+ articleId;
						})
		$("#unPass")
				.click(
						function() {
							location.href = "reviewAppointArticle?results=unPass&articleId="
									+ articleId;
						})
		$("#cancel")
				.click(
						function() {
							location.href = "reviewAppointArticle?results=cancel&articleId="
									+ articleId;
						})
	})
</script>
</head>
<body>
	<div class="container">
		<h1>请审核文章，给出最公正的评定！</h1>
		<div>
			<ul class="list-group">
				<li class="list-group-item">文章id：<span name="articleId">${article.articleId}</span></li>
				<li class="list-group-item">标题：${article.articleTitle}</li>
				<li class="list-group-item">导语：${article.articleLead}</li>
				<li class="list-group-item">日期：${article.articleDate}</li>
				<li class="list-group-item">用户id：${article.user.userId}</li>
				<li class="list-group-item">点击量：${article.clickCount}</li>
				<li class="list-group-item">状态：${article.state}</li>
				<li class="list-group-item">主图：${article.articleImg}</li>
				<li class="list-group-item">内容：${article.articleContent}</li>
			</ul>
		</div>
		<button id="pass" class="btn btn-success col-md-2">通过</button>
		<div class="col-md-3"></div>
		<button id="cancel" class="btn btn-info col-md-2">取消</button>
		<div class="col-md-3"></div>
		<button id="unPass" class="btn btn-danger col-md-2">未通过</button>
	</div>
</body>
</html>