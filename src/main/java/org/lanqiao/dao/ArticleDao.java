package org.lanqiao.dao;

import java.math.BigDecimal;
import org.lanqiao.entity.Article;

public interface ArticleDao {
    int deleteByPrimaryKey(BigDecimal articleId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(BigDecimal articleId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
    
    //添加文章
    void insertArticle(Article article);
}