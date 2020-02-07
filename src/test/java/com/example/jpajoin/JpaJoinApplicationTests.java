package com.example.jpajoin;

import com.example.jpajoin.domain.User;
import com.example.jpajoin.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class JpaJoinApplicationTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaJoinApplicationTests.class);

    @Autowired
    private UserRepository userRepository;

    @Test
    void oneToOneTest() {
        LOGGER.info("===============ONE-TO-ONE-SQL=========================");
        List<User> users = userRepository.findAll();
        LOGGER.info("===============ONE-TO-ONE-SQL=========================");
    }

}

