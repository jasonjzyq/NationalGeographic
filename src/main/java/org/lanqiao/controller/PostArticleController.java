package org.lanqiao.controller;

import java.math.BigDecimal;

import org.lanqiao.entity.Article;
import org.lanqiao.entity.User;
import org.lanqiao.service.PostArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostArticleController {
	// 前往点击按钮处
	@RequestMapping("toPostArticle")
	public String toPostArticle(Model model) {
		return "toPostArticle";
	}

	// 前往文章编辑发表处
	@RequestMapping("postArticle")
	public String postArticle(Model model, User user, Integer userId) {
		user.setUserId(BigDecimal.valueOf(userId));
		model.addAttribute("user", user);
		return "postArticle";
	}

	@Autowired
	PostArticleService postArticleService;

	// 把发表文章存储到数据库
	@RequestMapping("postArticleSuccess")
	public String postArticleSuccess(Article article, Integer userId, User user) {
		user.setUserId(BigDecimal.valueOf(userId));
		article.setClickCount(BigDecimal.valueOf(0));
		article.setUser(user);
		article.setState("未审核");
		postArticleService.postArticle(article);
		System.out.println(123);
		return "postArticleSuccess";
	}
}
