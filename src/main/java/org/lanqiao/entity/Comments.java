package org.lanqiao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Comments {
    private BigDecimal commentId;

    private Date commentDate;

    private BigDecimal userId;

    private String commentContent;

    public BigDecimal getCommentId() {
        return commentId;
    }

    public void setCommentId(BigDecimal commentId) {
        this.commentId = commentId;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }
}