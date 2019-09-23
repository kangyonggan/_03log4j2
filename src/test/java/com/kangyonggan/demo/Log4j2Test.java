package com.kangyonggan.demo;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author kangyonggan
 * @since 2019-09-20
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Log4j2Test {

    private static final Logger LOGGER = LogManager.getLogger(Log4j2Test.class);

    /**
     * 测试打印到控制台
     */
    @Test
    public void testConsole() {
        LOGGER.info("1 + {} = 2", 1);
    }

    /**
     * 测试常见级别的日志
     */
    @Test
    public void testLevel() {
        LOGGER.debug("1 + {} = 2", 1);
        LOGGER.info("1 + {} = 2", 1);
        LOGGER.warn("1 + {} = 2", 1);
        LOGGER.error("1 + {} = 2", 1);
    }

}
