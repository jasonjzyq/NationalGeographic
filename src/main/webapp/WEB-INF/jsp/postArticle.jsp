<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="bootstrap-3.3.7-dist/css/bootstrap.min.css">
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
	src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
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
		var E = window.wangEditor;
		var editor = new E('#div1');
		editor.create();
		$("#div1").attr("height", "1000px");

		$("input[name='articleContent']").hide();
		$("input[name='userId']").parent().hide();
		$("#btn1").click(function() {
			var articleContent = editor.txt.html();
			var i = 0;
			$("input[name='articleTitle']").parent().removeClass("has-error");
			$("input[name='articleLead']").parent().removeClass("has-error");
			$("input[name='articleDate']").parent().removeClass("has-error");
			$("input[name='articleImg']").parent().removeClass("has-error");

			$("input[name='articleContent']").val(articleContent);

			if ($("input[name='articleTitle']").val() == "") {
				$("input[name='articleTitle']").parent().addClass("has-error");
				i = 1;
			}
			if ($("input[name='articleLead']").val() == "") {
				$("input[name='articleLead']").parent().addClass("has-error");
				i = 1;
			}
			if ($("input[name='articleDate']").val() == "") {
				$("input[name='articleDate']").parent().addClass("has-error");
				i = 1;
			}
			if ($("input[name='articleImg']").val() == "") {
				$("input[name='articleImg']").parent().addClass("has-error");
				i = 1;
			}
			if (i != 1) {
				$("form[name='form']").submit();
			}

		})
	})
</script>
</head>
<body>
	<div class="container">
		<div class="center-block" text-align="center">
			<h1>
				妙笔生花<span>（请发表文章）</span>
			</h1>
		</div>
		<form action="postArticleSuccess" method="post" name="form">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="用户Id"
					name="userId" value="${user.userId}">
			</div>
			<div class="form-group">
				<label for="articleTitle">文章标题：</label> <input type="text"
					class="form-control" id="articleTitle" name="articleTitle"
					placeholder="文章标题">
			</div>
			<div class="form-group">
				<label for="articleLead">文章导语：</label> <input type="text"
					class="form-control" id="articleLead" name="articleLead"
					placeholder="文章导语">
			</div>
			<div class="form-group">
				<label for="articleDate">发布日期：</label> <input type="date"
					class="form-control" id="articleDate" name="articleDate"
					placeholder="发布日期">
			</div>
			<div class="form-group">
				<label for="articleImg">文章主图：</label> <input type="file"
					class="form-control" id="articleImg" name="articleImg"
					placeholder="主图地址">
			</div>
			<input type="text" name="articleContent" class="form-group">
		</form>
		<!-- 富文本编辑器 -->
		<div id="div1"></div>
		<button id="btn1" class="btn">提交文章，进入审核</button>
	</div>
</body>
</html>