/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: App
 * @Decription:
 * @Author: rubik
 * rubik create App.java of 2022/1/24 12:01 下午
 */
@SpringBootApplication(scanBasePackages = "com.geek45")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
