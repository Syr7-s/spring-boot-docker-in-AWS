package com.syrisa.springbootdockerinaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aws/")
public class AWSController {

    @GetMapping("/message")
    public String getMessageInAWS(){
        return "Hi From AWS.";
    }

}
