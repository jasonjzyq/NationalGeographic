package org.lanqiao.dao;

import java.math.BigDecimal;
import org.lanqiao.entity.User;

public interface UserDao {
    int deleteByPrimaryKey(BigDecimal userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(BigDecimal userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}