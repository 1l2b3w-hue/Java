package com.itlbw;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourageController {


    @RequestMapping("/endeavor")
    public String endeavor(String name) {
        System.out.println("name = " + name);
        return "加油" + name +  "~,你会做出来的!";
    }


}
