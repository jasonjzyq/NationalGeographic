package org.lanqiao.service;

import java.math.BigDecimal;
import java.util.List;

import org.lanqiao.dao.ArticleDao;
import org.lanqiao.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewArticlesServiceImpl implements ReviewArticlesService {

	@Autowired
	ArticleDao articleDao;

	@Override
	public List<Article> getAllReviewArticles(int page, int rows) {
		int begin = (page - 1) * rows;
		int end = begin + rows;
		return articleDao.selectAllArticle(begin, end);
	}

	@Override
	public Article getAppointArticle(BigDecimal articleId) {
		return articleDao.selectArticleById(articleId);
	}

	@Override
	public void modifyArticleStatus(Article article) {
		articleDao.updateArticleStatusById(article);
	}

	@Override
	public int getAllArticleNum() {
		List<Article> articles = articleDao.selectAllArticleR();
		return articles.size();
	}

}
