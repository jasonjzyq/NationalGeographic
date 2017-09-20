package org.lanqiao.dao;

import java.math.BigDecimal;
import org.lanqiao.entity.Admin;

public interface AdminDao {
    int deleteByPrimaryKey(BigDecimal adminId);

    int insert(Admin record);

    int insertSelective(Admin record);

    Admin selectByPrimaryKey(BigDecimal adminId);

    int updateByPrimaryKeySelective(Admin record);

    int updateByPrimaryKey(Admin record);

}