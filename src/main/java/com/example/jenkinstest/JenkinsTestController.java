package com.example.jenkinstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsTestController {

    @RequestMapping("/")
    public @ResponseBody
    String helloWorld() {
        return "Hello Jenkins World!";
    }
}
