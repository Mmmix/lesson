package com.wust.lesson.study.controller;

import com.wust.lesson.study.model.Friends;
import com.wust.lesson.study.model.Message;
import com.wust.lesson.study.service.FriendService;
import com.wust.lesson.study.service.Impl.UserServiceImpl;
import com.wust.lesson.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/friends",method = RequestMethod.GET)
public class FriendController {
    @Autowired
    FriendService friendService;
    @Autowired
    UserService userService;

    @RequestMapping(value = "/getFriendsByUserId",method = RequestMethod.GET)
    public Message getFriendsByUserId(Integer userid){
        if (userid!=null){
            return Message.success().add("data",friendService.getFriends(userid));
        }
        return Message.fail();
    }

    @RequestMapping(value = "/deleteFriend",method = RequestMethod.GET)
    public Message delete(Integer tdId){
        if (tdId!=null){
            if(friendService.deleteFriendsByid(tdId))
                return Message.success();
        }
        return Message.fail();
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public Message update(Integer tdId,Integer tdStatus){
        if (tdId!=null&&tdStatus!=null){
            Friends friends = new Friends();
            friends.setTdId(tdId);
            friends.setTdStatus(tdStatus);
            if(friendService.updateFriends(friends))
                return Message.success();
        }
        return Message.fail();
    }
}
