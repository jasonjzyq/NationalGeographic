package org.lanqiao.dao;

import java.math.BigDecimal;
import org.lanqiao.entity.Type;

public interface TypeDao {
    int deleteByPrimaryKey(BigDecimal typeId);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(BigDecimal typeId);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);
}