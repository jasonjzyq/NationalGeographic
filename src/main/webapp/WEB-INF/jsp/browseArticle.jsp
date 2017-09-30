<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>文章名字</title>
<link href="bootstrap-3.3.7-dist/css/bootstrap.min.css" type="text/css"
	rel="stylesheet">
<link href="css/backstage.css" type="text/css" rel="stylesheet">
<script src="bootstrap-3.3.7-dist/jquery-3.2.1.min.js"></script>
<script src="bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
	<div id="black"
		style="background-color: black; height: 200px; width: 100%"></div>
	<div class="container">
		<div class="col-md-8">
			<div class="jumbotron">
				<h3>${article.articleTitle}</h3>
				<br>
				<h5>
					<span class="col-md-4">发布日期:${article.articleDate}</span><span class="col-md-4">文章作者:${article.user.userId}</span><span
						class="col-md-4">点击量:${article.clickCount}</span>
				</h5>
				<br>
				<br>
				<h5>
					<h5>
						<b>导语：</b>
					</h5>
					${article.articleLead}
				</h5>
			</div>
			<div>
				<div class="col-md-1"></div>
				<div class="col-md-10">
					${article.articleContent}
				</div>
				<div class="col-md-1"></div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="panel panel-default">
				<!-- Default panel contents -->
				<div class="panel-heading">热门排行</div>
				<div class="panel-body">
					<ul class="list-group">
						<li class="list-group-item list-group-item-success">岛城</li>
						<li class="list-group-item list-group-item-info">稻城</li>
						<li class="list-group-item list-group-item-warning">康城</li>
						<li class="list-group-item list-group-item-danger">鹅城</li>
					</ul>
				</div>
			</div>
			<div class="panel panel-default">
				<!-- Default panel contents -->
				<div class="panel-heading">广告招租</div>
				<div class="panel-body">
					<div class="row">
						<div class="thumbnail">
							<img
								src="http://photocdn.sohu.com/20151016/mp35887683_1444927182424_1.jpg"
								alt="广告位">
							<div class="caption">
								<h3>七步成诗</h3>
								<p>七步成诗广告位招租</p>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="thumbnail">
							<img
								src="http://photocdn.sohu.com/20151016/mp35887683_1444927182424_1.jpg"
								alt="广告位">
							<div class="caption">
								<h3>七步成诗</h3>
								<p>七步成诗广告位招租</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>