package com.TimedTasks.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author:LZH
 * @Date:2020/11/30 11:11
 * @Description
 */
@Service
public class AnnuallyTask {
    @Resource
    JavaMailSenderImpl sender;
    @Scheduled(cron = "0/10 * * * * MON-SAT")
    void contextLoads() {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setSubject("开会");
        message.setText("今晚七点四十在xxx开会");
        message.setTo("3185577396@qq.com");
        message.setFrom("lzh211@126.com");
        sender.send(message);
    }

}
