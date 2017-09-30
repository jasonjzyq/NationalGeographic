package org.lanqiao.service;

import java.math.BigDecimal;

import org.lanqiao.dao.ArticleDao;
import org.lanqiao.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrowseArticleServiceImpl implements BrowseArticleService {
	
	@Autowired
	ArticleDao articleDao;

	@Override
	public Article getAppointArticle(BigDecimal articleId) {
		return articleDao.selectArticleById(articleId);
	}

}
