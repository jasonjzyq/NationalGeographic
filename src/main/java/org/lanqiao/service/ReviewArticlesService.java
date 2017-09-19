package org.lanqiao.service;

import java.math.BigDecimal;
import java.util.List;

import org.lanqiao.entity.Article;

public interface ReviewArticlesService {
	public List<Article> getAllReviewArticles();
	
	public Article getAppointArticle(BigDecimal articleId);
}
