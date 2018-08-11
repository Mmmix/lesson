package com.wust.lesson.study.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wust.lesson.study.model.Composition;
import com.wust.lesson.study.model.Message;
import com.wust.lesson.study.model.UserInfoEntity;
import com.wust.lesson.study.service.Impl.CompositionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@CrossOrigin
@RestController
@RequestMapping("/Composition")
public class CompositionController {
    @Autowired
    private CompositionServiceImpl compositionService;

    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public Message getAll(String title,Integer pageNum){
        //使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum, 10);
        PageInfo<Composition> pageInfo;
        if (title == null|| title.equals("")) {
            pageInfo = new PageInfo<>(compositionService.getAll(), 5);
        } else {
            pageInfo = new PageInfo<>(compositionService.getByTitle(title), 5);
        }
        return Message.success().add("data", pageInfo);
    }

    @RequestMapping(value = "/getByUserId",method = RequestMethod.GET)
    public Message getComposition(UserInfoEntity userInfoEntity,Integer pageNum,Integer pageSize){
        if (userInfoEntity.getTdId()!=null&&pageNum!=null){
            PageHelper.startPage(pageNum,pageSize);
            PageInfo<Composition> pageInfo=new PageInfo<>(compositionService.getCompositionById(userInfoEntity.getTdId()),5);
            return Message.success().add("data",pageInfo);
        }
        return Message.fail();
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Message delete(Integer id){
        if (id!=null){
            if(compositionService.delete(id))
                return Message.success();
        }
        return Message.fail();
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public Message update(Composition composition){
        if (composition.getTbId()!=null){
            if(compositionService.update(composition))
                return Message.success();
        }
        return Message.fail();
    }

    @RequestMapping(value = "/createComposition",method = RequestMethod.GET)
    public Message createComposition(Composition composition){
        if (composition.getTbUserid()!=null){
            if (compositionService.createComposition(composition)){
                return Message.success();
            }
        }
        return Message.fail();
    }
}
