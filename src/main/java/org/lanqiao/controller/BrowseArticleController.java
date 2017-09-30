package org.lanqiao.controller;

import java.math.BigDecimal;

import org.lanqiao.entity.Article;
import org.lanqiao.service.BrowseArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BrowseArticleController {

	@Autowired
	BrowseArticleService browseArticleService;
	
	@RequestMapping("BrowseArticle")
	public String BrowseArticle(Integer articleId, Model model) {
		//从数据库获取文章
		Article article = browseArticleService.getAppointArticle(BigDecimal.valueOf(articleId));
		model.addAttribute("article", article);
		return "browseArticle";
	}
	
	@RequestMapping("addClick")
	public String addClick(){
		return null;
	}

}
