package com.jekainfinity.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping(value = "/**")
    public String salutation() {
        return "Hi, it's 'Where you going ... ?'.  I am glad to see you here. \n" +
                "To see popular places enter /places. \n " +
                "For count the best way to destination places from you departure point enter /count/{departure point}/{destination place} \n" +
                "To see all routes by train enter /train/all \n" +
                "To see all routes by bus enter /bus/all \n";
    }


}
