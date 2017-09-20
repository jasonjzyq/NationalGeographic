package org.lanqiao.entity;

import java.math.BigDecimal;

public class Picture {
	private BigDecimal pictureId;

	private String picture;

	private String pictureAuthor;

	private String pictureName;

	private String pictureType;

	// private BigDecimal daypicId;
	private Daypic daypic;

	public BigDecimal getPictureId() {
		return pictureId;
	}

	public void setPictureId(BigDecimal pictureId) {
		this.pictureId = pictureId;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture == null ? null : picture.trim();
	}

	public String getPictureAuthor() {
		return pictureAuthor;
	}

	public void setPictureAuthor(String pictureAuthor) {
		this.pictureAuthor = pictureAuthor == null ? null : pictureAuthor.trim();
	}

	public String getPictureName() {
		return pictureName;
	}

	public void setPictureName(String pictureName) {
		this.pictureName = pictureName == null ? null : pictureName.trim();
	}

	public String getPictureType() {
		return pictureType;
	}

	public void setPictureType(String pictureType) {
		this.pictureType = pictureType == null ? null : pictureType.trim();
	}

	public Daypic getDaypic() {
		return daypic;
	}

	public void setDaypic(Daypic daypic) {
		this.daypic = daypic;
	}

	// public BigDecimal getDaypicId() {
	// return daypicId;
	// }
	//
	// public void setDaypicId(BigDecimal daypicId) {
	// this.daypicId = daypicId;
	// }
}