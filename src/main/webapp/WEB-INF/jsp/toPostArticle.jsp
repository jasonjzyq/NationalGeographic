<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>去发表文章</title>
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("button").click(function(){
			location.href="postArticle?userId=1";
		})
	})
</script>
</head>
<body>
	<button>去发表文章</button>
</body>
</html>