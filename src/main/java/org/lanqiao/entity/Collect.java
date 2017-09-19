package org.lanqiao.entity;

import java.math.BigDecimal;

public class Collect {
    private BigDecimal userId;

    private BigDecimal articleId;

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public BigDecimal getArticleId() {
        return articleId;
    }

    public void setArticleId(BigDecimal articleId) {
        this.articleId = articleId;
    }
}