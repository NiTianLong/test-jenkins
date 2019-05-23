package com.longe.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianl on 2019/5/22.
 */
@RestController
public class IndexController {

    @Value("${env}")
    private String ENV;

    @RequestMapping("/index")
    public String index(){

        return "此时的环境为:" + ENV + "测试选择分支后自动化部署";
    }
}
