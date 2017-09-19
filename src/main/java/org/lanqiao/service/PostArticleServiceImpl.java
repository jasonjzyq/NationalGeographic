package org.lanqiao.service;

import org.lanqiao.dao.ArticleDao;
import org.lanqiao.entity.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostArticleServiceImpl implements PostArticleService{

	@Autowired
	ArticleDao articleDao;
	
	@Override
	public void postArticle(Article article) {
		articleDao.insertArticle(article);
	}

}
