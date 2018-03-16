package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HellowConteoller {

    @RequestMapping("jj")
    public String index(){
        return  "index";
    }


}
