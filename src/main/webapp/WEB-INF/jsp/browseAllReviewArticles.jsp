<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>所有文章</title>

<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.5.2/themes/default/easyui.css" />

<link rel="stylesheet" type="text/css"
	href="js/jquery-easyui-1.5.2/themes/icon.css" />

<script type="text/javascript"
	src="js/jquery-easyui-1.5.2/jquery.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.5.2/jquery.easyui.min.js"></script>

<script type="text/javascript"
	src="js/jquery-easyui-1.5.2/easyloader.js"></script>

<script type="text/javascript"
	src="js/jquery-easyui-1.5.2/locale/easyui-lang-zh_CN.js"></script>

<script>
	function user_formatter(val, row, index) {
		return row.user.userName;
	}

	function editUser() {
		//获取选中行
		var row = $('#dg').datagrid('getSelected');
		if (row) {
			location.href = "getAppointArticle?articleId=" + row.articleId;
		}
	}
</script>
</head>
<body>

	<table id="dg" title="所有文章" class="easyui-datagrid"
		url="browseAllReviewArticles" toolbar="#toolbar" rownumbers="true"
		fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<th field="articleId" width="50">文章Id</th>
				<th field="articleTitle" width="50">文章主题</th>
				<th field="articleDate" width="50">发布日期</th>
				<th field="user" width="50" formatter="user_formatter">发布用户</th>
				<th field="state" width="50">文章状态</th>
			</tr>
		</thead>
	</table>

	<div id="toolbar">
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="editUser()">查看文章详情</a>
	</div>

</body>
</html>