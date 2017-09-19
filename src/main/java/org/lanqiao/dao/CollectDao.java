package org.lanqiao.dao;

import org.lanqiao.entity.Collect;

public interface CollectDao {
    int insert(Collect record);

    int insertSelective(Collect record);
}