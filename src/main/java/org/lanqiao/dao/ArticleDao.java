package org.lanqiao.dao;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.lanqiao.entity.Article;

public interface ArticleDao {
	int deleteByPrimaryKey(BigDecimal articleId);

	int insert(Article record);

	int insertSelective(Article record);

	Article selectByPrimaryKey(BigDecimal articleId);

	int updateByPrimaryKeySelective(Article record);

	int updateByPrimaryKeyWithBLOBs(Article record);

	int updateByPrimaryKey(Article record);

	// 添加文章
	void insertArticle(Article article);

	// 查看所有文章(分页)
	List<Article> selectAllArticle(@Param("begin") Integer begin, @Param("end") Integer end);

	// 查看所有文章
	// selectAllArticleR
	List<Article> selectAllArticleR();

	// 查看指定文章
	Article selectArticleById(BigDecimal articleId);

	// 通过id修改文章状态
	void updateArticleStatusById(Article article);
}