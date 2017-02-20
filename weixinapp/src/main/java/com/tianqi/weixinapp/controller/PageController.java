package com.tianqi.weixinapp.controller;

import com.tianqi.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: huyuanzhi
 * @version: 1.0
 * @date: 2017/2/20
 * @project: tianqi
 * @packageName: com.tianqi.weixinapp.com
 * @description: XXXXXX
 */
@Controller
public class PageController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/")
    private String index(){
        Integer in = userService.findAll();
        System.out.println(in);
        return "index";
    }
}
