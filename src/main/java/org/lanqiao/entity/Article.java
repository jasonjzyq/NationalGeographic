package org.lanqiao.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Article {
	private BigDecimal articleId;

	private String articleTitle;

	private String articleLead;

	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date articleDate;

	private User user;

	private BigDecimal clickCount;

	private String state;

	private String articleImg;

	private String articleContent;

	public BigDecimal getArticleId() {
		return articleId;
	}

	public void setArticleId(BigDecimal articleId) {
		this.articleId = articleId;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle == null ? null : articleTitle.trim();
	}

	public String getArticleLead() {
		return articleLead;
	}

	public void setArticleLead(String articleLead) {
		this.articleLead = articleLead == null ? null : articleLead.trim();
	}

	public Date getArticleDate() {
		return articleDate;
	}

	public void setArticleDate(Date articleDate) {
		this.articleDate = articleDate;
	}

	// public BigDecimal getUserId() {
	// return userId;
	// }
	//
	// public void setUserId(BigDecimal userId) {
	// this.userId = userId;
	// }

	public BigDecimal getClickCount() {
		return clickCount;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setClickCount(BigDecimal clickCount) {
		this.clickCount = clickCount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state == null ? null : state.trim();
	}

	public String getArticleImg() {
		return articleImg;
	}

	public void setArticleImg(String articleImg) {
		this.articleImg = articleImg == null ? null : articleImg.trim();
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent == null ? null : articleContent.trim();
	}
}