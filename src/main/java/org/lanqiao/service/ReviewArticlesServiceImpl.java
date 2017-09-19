package org.lanqiao.service;

import java.math.BigDecimal;
import java.util.List;

import org.lanqiao.dao.ArticleDao;
import org.lanqiao.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ReviewArticlesServiceImpl implements ReviewArticlesService{

	@Autowired
	ArticleDao articleDao;
	
	@Override
	public List<Article> getAllReviewArticles() {
		return articleDao.selectAllArticle();
	}

	@Override
	public Article getAppointArticle(BigDecimal articleId) {
		return articleDao.selectArticleById(articleId);
	}

}
