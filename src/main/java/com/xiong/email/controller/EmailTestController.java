package com.xiong.email.controller;

import com.xiong.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("emailTest")
public class EmailTestController {
    @Autowired
    private EmailService emailService;
    @Value ("${spring.mail.username}")
    private String from;

    //localhost:8080/emailTest/simpleEmail?receive=1435295017@qq.com&subject="我爱盼盼"&content="真的太爱了！"
    @RequestMapping("simpleEmail")
    public String sendSimple(String receive,String subject,String content){

        emailService.sendSimpleMail(from,receive,subject,content);

        return "ok";
    }

}
