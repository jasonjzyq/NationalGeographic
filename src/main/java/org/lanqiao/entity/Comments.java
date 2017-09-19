package org.lanqiao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Comments {
	private BigDecimal commentId;

	private Date commentDate;

	private User user;

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

	// public BigDecimal getUserId() {
	// return userId;
	// }
	//
	// public void setUserId(BigDecimal userId) {
	// this.userId = userId;
	// }

	public String getCommentContent() {
		return commentContent;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent == null ? null : commentContent.trim();
	}
}