package org.lanqiao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Daypic {
	private BigDecimal daypicId;

	private String introduction;

	private Picture picture;

	private String daypicTitle;

	private Date daypicDate;

	public BigDecimal getDaypicId() {
		return daypicId;
	}

	public void setDaypicId(BigDecimal daypicId) {
		this.daypicId = daypicId;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction == null ? null : introduction.trim();
	}

	// public BigDecimal getPictureId() {
	// return pictureId;
	// }
	//
	// public void setPictureId(BigDecimal pictureId) {
	// this.pictureId = pictureId;
	// }

	public String getDaypicTitle() {
		return daypicTitle;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public void setDaypicTitle(String daypicTitle) {
		this.daypicTitle = daypicTitle == null ? null : daypicTitle.trim();
	}

	public Date getDaypicDate() {
		return daypicDate;
	}

	public void setDaypicDate(Date daypicDate) {
		this.daypicDate = daypicDate;
	}
}