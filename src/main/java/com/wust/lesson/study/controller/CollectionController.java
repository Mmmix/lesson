package com.wust.lesson.study.controller;

import com.wust.lesson.study.model.Message;
import com.wust.lesson.study.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/collection")
public class CollectionController {
    @Autowired
    CollectionService collectionService;

    @RequestMapping(value = "/getCollection",method = RequestMethod.GET)
    public Message getCollection(Integer userId){
        if (userId!=null){
            return Message.success().add("data",collectionService.getByUserId(userId));
        }
        return Message.fail();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Message delete(Integer tdId){
        if(tdId!=null){
            if(collectionService.deleteCollection(tdId))
                return Message.success();
        }
        return Message.fail();
    }
}
