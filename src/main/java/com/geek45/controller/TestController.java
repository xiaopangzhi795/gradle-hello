/**
 * From geek45.com
 * Email to : rubixgeek795@gmail.com
 */
package com.geek45.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Decription:
 * @Author: rubik
 *  rubik create TestController.java of 2022/1/24 3:02 下午
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("hello")
    public String hello() {
        return "hello gradle";
    }
}
