package com.ase.pangu.dao;

import com.ase.pangu.enity.TestTable;

public interface TestTableMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TestTable record);

    int insertSelective(TestTable record);

    TestTable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TestTable record);

    int updateByPrimaryKey(TestTable record);
}