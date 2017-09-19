package org.lanqiao.dao;

import java.math.BigDecimal;
import org.lanqiao.entity.Daypic;

public interface DaypicDao {
    int deleteByPrimaryKey(BigDecimal daypicId);

    int insert(Daypic record);

    int insertSelective(Daypic record);

    Daypic selectByPrimaryKey(BigDecimal daypicId);

    int updateByPrimaryKeySelective(Daypic record);

    int updateByPrimaryKey(Daypic record);
}