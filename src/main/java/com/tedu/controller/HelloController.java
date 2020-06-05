package com.tedu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
public class HelloController {

    @RequestMapping("info")
    public String doInfo(){
        return "Hello xiongshifei bengdan";
    }
}
