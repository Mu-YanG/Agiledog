package org.dennis.agiledog.web.controller;

import org.dennis.agiledog.model.Email;
import org.dennis.agiledog.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author deng.zhang
 * @since 1.0.0
 * Created on 2016-09-29 19:26
 */
@Controller
@RequestMapping("/email")
public class EmailController {
    /**
     * 邮件服务
     */
    @Autowired
    private EmailService emailService;

    /**
     * 发送邮件
     */
    @RequestMapping("/send")
    @ResponseBody
    public void send() {
        Email email = new Email();
        email.setTo("denniszd@163.com");
        email.setBody("test");
        emailService.send(email);
    }
}
