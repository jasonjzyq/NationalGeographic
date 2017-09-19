<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.toolbar {
	background-color: #f1f1f1;
	border: 1px solid #ccc;
}

.text {
	border: 1px solid #ccc;
	height: 600px;
}
</style>
<script type="text/javascript"
	src="bootstrap-3.3.7-dist/jquery-3.2.1.min.js"></script>
<script type="text/javascript"
	src="wangEditor-3.0.8/release/wangEditor.min.js"></script>
<script type="text/javascript">
	//window.onload = function() {
	//document.getElementById('btn1').addEventListener('click', function() {
	// 读取 html
	//alert(editor.txt.html())
	//}, false)

	//document.getElementById('btn2').addEventListener('click', function() {
	// 读取 text
	//alert(editor.txt.text())
	//}, false)

	//var E = window.wangEditor
	//var editor = new E('#div1')

	// 下面两个配置，使用其中一个即可显示“上传图片”的tab。但是两者不要同时使用！！！
	//editor.customConfig.uploadImgShowBase64 = true // 使用 base64 保存图片
	// editor.customConfig.uploadImgServer = '/upload'  // 上传图片到服务器
	// 隐藏“网络图片”tab
	//editor.customConfig.showLinkImg = false

	//editor.create()
	//}
	$(function() {
		var E = window.wangEditor
		var editor = new E('#div1')
		editor.create()

		$("input[name='articleContent']").hide();
		$("#btn1").click(function() {
			var articleContent = editor.txt.html();

			$("input[name='articleContent']").val(articleContent);

			$("form[name='form']").submit();
		})

	})
</script>
</head>
<body>
	<form action="postArticleSuccess" method="post" name="form">
	<input type="text" name="userId" value="${user.userId}">
		标题：<input type="text" name="articleTitle"> 导语：<input
			type="text" name="articleLead"> 日期：<input type="date"
			name="articleDate"> <input type="text" name="articleImg">
			<input type="text" name="articleContent">
	</form>
	<!-- 富文本编辑器 -->
	<div id="div1"></div>
	<button id="btn1">提交文章，进入审核</button>
</body>
</html>