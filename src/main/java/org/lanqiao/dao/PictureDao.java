package org.lanqiao.dao;

import java.math.BigDecimal;
import org.lanqiao.entity.Picture;

public interface PictureDao {
    int deleteByPrimaryKey(BigDecimal pictureId);

    int insert(Picture record);

    int insertSelective(Picture record);

    Picture selectByPrimaryKey(BigDecimal pictureId);

    int updateByPrimaryKeySelective(Picture record);

    int updateByPrimaryKey(Picture record);
}