package com.example.jpajoin;

import com.example.jpajoin.repository.UserRepositoryImproved;
import com.example.jpajoin.repository.UserRepositoryOriginal;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaJoinApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaJoinApplicationTests.class);

    @Autowired
    private UserRepositoryOriginal userRepositoryOriginal;
    @Autowired
    private UserRepositoryImproved userRepositoryImproved;

    @Test
    void oneToOneTest() {
        LOGGER.info("===============ONE-TO-ONE-ORIGINAL-SQL=========================");
        userRepositoryOriginal.findAll();
        LOGGER.info("===============ONE-TO-ONE-ORIGINAL-SQL=========================");
        LOGGER.info("===============ONE-TO-ONE-IMPROVED-SQL=========================");
        userRepositoryImproved.findAll();
        LOGGER.info("===============ONE-TO-ONE-IMPROVED-SQL=========================");
    }

}

