package com.ase.pangu.controller;

import com.ase.pangu.enity.TestTable;
import com.ase.pangu.service.TestService;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    @Autowired
    private TestService testService;
    private static Logger log = LogManager.getLogger(TestController.class);

    @RequestMapping("/{id}")
    public TestTable queryById(@PathVariable Long id) {
        log.info("进入控制器，请求参数是" + id);
        log.info("test push");
        return testService.getTestTable(id);

    }
}
