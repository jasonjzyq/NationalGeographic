package org.lanqiao.dao;

import java.math.BigDecimal;
import org.lanqiao.entity.Comments;

public interface CommentsDao {
    int deleteByPrimaryKey(BigDecimal commentId);

    int insert(Comments record);

    int insertSelective(Comments record);

    Comments selectByPrimaryKey(BigDecimal commentId);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKeyWithBLOBs(Comments record);

    int updateByPrimaryKey(Comments record);
}