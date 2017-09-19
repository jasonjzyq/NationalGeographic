package org.lanqiao.controller;

import java.math.BigDecimal;
import java.util.List;

import org.lanqiao.entity.Article;
import org.lanqiao.service.ReviewArticlesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReviewArticlesController {

	//查看按钮
	@RequestMapping("testBrowseReviewArticles")
	public String toReviewArticles() {
		return "testBrowseReviewArticles";
	}
	
	@Autowired
	ReviewArticlesService reviewArticlesService;

	//跳转所有文章页
	@RequestMapping("toBrowseReviewArticles")
	public String lalala(){
		return "browseAllReviewArticles";
	}
	
	//ajax获取文章
	@RequestMapping("browseAllReviewArticles")
	@ResponseBody
	public List<Article> getAllReviewArticles() {
		List<Article> articles = reviewArticlesService.getAllReviewArticles();
		return articles;
	}

	//获取该文章内容
	@RequestMapping("getAppointArticle")
	public String getAppointArticle(BigDecimal articleId,Model model){
		reviewArticlesService.getAppointArticle(articleId);
		model.addAttribute("article", reviewArticlesService.getAppointArticle(articleId));
		return "showAppointArticle";
	}
}
