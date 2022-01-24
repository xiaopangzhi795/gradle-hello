/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ClassName: TestConfig
 * @Decription:
 * @Author: rubik
 *  rubik create TestConfig.java of 2022/1/24 4:27 下午
 */
@ConfigurationProperties(prefix = "test")
public class TestConfig {

    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
