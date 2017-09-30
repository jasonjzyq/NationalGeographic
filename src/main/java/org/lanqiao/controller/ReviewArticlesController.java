package org.lanqiao.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.lanqiao.entity.Article;
import org.lanqiao.service.ReviewArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewArticlesController {

	// 查看按钮
	@RequestMapping("testBrowseReviewArticles")
	public String toReviewArticles() {
		return "testBrowseReviewArticles";
	}

	@Autowired
	ReviewArticlesService reviewArticlesService;

	// 跳转所有文章页
	@RequestMapping("toBrowseReviewArticles")
	public String lalala() {
		return "browseAllReviewArticles";
	}

	// ajax获取文章
	@RequestMapping("browseAllReviewArticles")
	@ResponseBody
	public Map<String, Object> getAllReviewArticles(String page, String rows) {
		// 获取总记录数
		int count = reviewArticlesService.getAllArticleNum();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", count);
		List<Article> articles = reviewArticlesService.getAllReviewArticles(Integer.parseInt(page),
				Integer.parseInt(rows));
		// SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		// 把获取的记录放入rows中
		map.put("rows", articles);
		return map;
	}

	// 获取该文章内容
	@RequestMapping("getAppointArticle")
	public String getAppointArticle(BigDecimal articleId, Model model) {
		reviewArticlesService.getAppointArticle(articleId);
		Article article = reviewArticlesService.getAppointArticle(articleId);
		model.addAttribute("article", article);
		return "showAppointArticle";
	}

	// 修改文章结果
	@RequestMapping("reviewAppointArticle")
	public String reviewAppointArticle(String results, Article article) {
		if (results.equals("pass")) {
			article.setState("通过");
			reviewArticlesService.modifyArticleStatus(article);
		} else if (results.equals("unPass")) {
			article.setState("未通过");
			reviewArticlesService.modifyArticleStatus(article);
		} else {

		}
		return "browseAllReviewArticles";
	}
}
