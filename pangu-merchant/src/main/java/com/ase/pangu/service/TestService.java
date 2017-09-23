package com.ase.pangu.service;

import com.ase.pangu.dao.TestTableMapper;
import com.ase.pangu.enity.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("testService")
public class TestService {
    @Autowired
    private TestTableMapper testTableMapper;

    @Transactional
    public TestTable getTestTable(Long id) {
        return testTableMapper.selectByPrimaryKey(id);
    }
}
