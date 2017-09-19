<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>提交成功</title>
</head>
<body>
	<p>提交成功,请耐心等待审核结果</p>
	<div>
		文章id：${article.articleId} <br> 标题：${article.articleTitle} <br>
		导语：${article.articleLead} <br> 日期：${article.articleDate} <br>
		用户id：${article.user.userId} <br> 点击量：${article.clickCount} <br>
		状态：${article.state} <br> 主图：${article.articleImg}<br>
		内容：${article.articleContent}
	</div>
</body>
</html>