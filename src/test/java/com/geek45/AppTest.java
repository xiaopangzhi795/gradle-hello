/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: AppTest
 * @Decription:
 * @Author: rubik
 * rubik create AppTest.java of 2022/1/24 3:08 下午
 */
@SpringBootTest(classes = App.class)
public class AppTest {
    private static final Logger logger = LoggerFactory.getLogger(AppTest.class);

    @Value("${server.port}")
    private String port;

    @Test
    @DisplayName("测试端口号")
    void contextLoad() {
        logger.info("port is :{}", port);
    }
}
