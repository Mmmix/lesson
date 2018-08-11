package com.wust.lesson.study.controller;

import com.wust.lesson.study.model.Message;
import com.wust.lesson.study.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/getMessage",method = RequestMethod.GET)
    public Message getMessage(Integer userId){
        if(userId!=null){
            return Message.success().add("senders",messageService.getSender(userId)).add("addresses",messageService.getAddress(userId));
        }
        return Message.fail();
    }
}
