package org.lanqiao.service;

import java.math.BigDecimal;

import org.lanqiao.entity.Article;

public interface BrowseArticleService {
	public Article getAppointArticle(BigDecimal articleId);
}
