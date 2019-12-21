package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author tyler.chen
 * @date 2019/12/21 11:56
 */
@Controller
public class TestController {

    @RequestMapping("/test")
    public void test() {
        System.out.println ("helloworld,测试成功");
    }
}
