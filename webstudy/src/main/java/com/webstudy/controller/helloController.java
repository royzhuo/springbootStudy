package com.webstudy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {

    @Value("${fangke.name}")
    private String fkName;

    @RequestMapping(value = "/sayHello",method = RequestMethod.GET)
    @ResponseBody
    public String sayhello(String name){
        return "hi,"+name;
    }


    @RequestMapping(value = "/sayHelloFangke",method = RequestMethod.GET)
    @ResponseBody
    public String sayhellofangke(){
        return "hi,"+fkName;
    }
}
