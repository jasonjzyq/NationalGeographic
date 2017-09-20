<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		var articleId = $("span[name='articleId']").text();
		$("#pass").click(function() {
			location.href="reviewAppointArticle?results=pass&articleId="+articleId;
		})
		$("#unPass").click(function() {
			location.href="reviewAppointArticle?results=unPass&articleId="+articleId;
		})
		$("#cancel").click(function() {
			location.href="reviewAppointArticle?results=cancel&articleId="+articleId;
		})
	})
</script>
</head>
<body>
	<div>
		文章id：<span name="articleId">${article.articleId}</span> <br>
		标题：${article.articleTitle} <br> 导语：${article.articleLead} <br>
		日期：${article.articleDate} <br> 用户id：${article.user.userId} <br>
		点击量：${article.clickCount} <br> 状态：${article.state} <br>
		主图：${article.articleImg}<br> 内容：${article.articleContent}
	</div>
	<button id="pass">通过</button>
	<button id="unPass">未通过</button>
	<button id="cancel">取消</button>
</body>
</html>