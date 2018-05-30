package com.gdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by YJN on 2018/5/31.
 */
@RequestMapping("/index")
public class TestController {


    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String index(){
        return "hello world";
    }
}
