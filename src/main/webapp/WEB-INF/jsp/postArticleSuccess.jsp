<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交成功</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="wangEditor-3.0.8/release/wangEditor.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>提交成功,请耐心等待审核结果</h1>
		<div>
			<ul class="list-group">
				<li class="list-group-item">标题：${article.articleTitle}</li>
				<li class="list-group-item">导语：${article.articleLead}</li>
				<li class="list-group-item">日期：${article.articleDate}</li>
				<li class="list-group-item">状态：${article.state}</li>
				<li class="list-group-item">主图：${article.articleImg}</li>
				<li class="list-group-item">内容：${article.articleContent}</li>
			</ul>
		</div>
	</div>
</body>
</html>