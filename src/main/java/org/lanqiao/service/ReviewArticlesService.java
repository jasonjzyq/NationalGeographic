package org.lanqiao.service;

import java.math.BigDecimal;
import java.util.List;

import org.lanqiao.entity.Article;

public interface ReviewArticlesService {
	public List<Article> getAllReviewArticles(int page,int rows); 
	
	public Article getAppointArticle(BigDecimal articleId);
	
	public void modifyArticleStatus(Article article);
	
	public int getAllArticleNum();
}
