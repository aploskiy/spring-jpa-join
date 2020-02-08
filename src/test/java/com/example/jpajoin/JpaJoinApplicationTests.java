package com.example.jpajoin;

import com.example.jpajoin.repository.*;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.concurrent.TimeUnit;

@SpringBootTest
@Transactional
class JpaJoinApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaJoinApplicationTests.class);

    @Autowired
    private UserRepositoryOriginal userRepositoryOriginal;
    @Autowired
    private UserRepositoryImproved userRepositoryImproved;

    @Autowired
    private DepartmentRepositoryOriginal departmentRepositoryOriginal;
    @Autowired
    private DepartmentRepositoryBatchImproved departmentRepositoryBatchImproved;
    @Autowired
    private DepartmentRepositorySubSelectImproved departmentRepositorySubSelectImproved;

    @Test
    void oneToOneTest() {
        LOGGER.info("===============ONE-TO-ONE-ORIGINAL-SQL=========================");
        userRepositoryOriginal.findAll();
        LOGGER.info("===============ONE-TO-ONE-ORIGINAL-SQL=========================");
        LOGGER.info("===============ONE-TO-ONE-IMPROVED-SQL=========================");
        userRepositoryImproved.findAll();
        LOGGER.info("===============ONE-TO-ONE-IMPROVED-SQL=========================");
    }

    @Test
    void oneToManyTest() {
        LOGGER.info("===============ONE-TO-MANY-ORIGINAL-SQL===================================");
        departmentRepositoryOriginal.findAll();
        LOGGER.info("===============NE-TO-MANY-ORIGINAL-SQL====================================");
        LOGGER.info("===============NE-TO-MANY-IMPROVED-BUTCH-SQL==============================");
        departmentRepositoryBatchImproved.findAll();
        LOGGER.info("===============NE-TO-MANY-IMPROVED-BUTCH-SQL==============================");
        LOGGER.info("===============NE-TO-MANY-IMPROVED-SUB-SELECT-SQL=========================");
        departmentRepositorySubSelectImproved.findAll();
        LOGGER.info("===============NE-TO-MANY-IMPROVED-SUB-SELECT-SQL=========================");
    }

}

