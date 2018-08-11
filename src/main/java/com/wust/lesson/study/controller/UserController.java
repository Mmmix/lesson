package com.wust.lesson.study.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wust.lesson.study.model.Message;
import com.wust.lesson.study.model.UserInfoEntity;
import com.wust.lesson.study.service.Impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@CrossOrigin
@RestController
public class UserController {

    @Autowired
    private UserServiceImpl dao;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Message getList(String tdName, int pageNum) {
        //使用分页插件,核心代码就这一行
        PageHelper.startPage(pageNum, 10);
        PageInfo<UserInfoEntity> pageInfo;
        if (tdName == null) {
            pageInfo = new PageInfo<>(dao.getAll(), 5);
        } else {
            pageInfo = new PageInfo<>(dao.getUser(tdName), 5);
        }
        return Message.success().add("data", pageInfo);
    }

    @RequestMapping("/getAll")
    public Map<String, Object> getAll() {
        Map<String, Object> map = new HashMap<>();
        List<UserInfoEntity> list = dao.getAll();
        map.put("code", 200);
        map.put("status", "查询成功");
        map.put("lenth", list.size());
        map.put("data", list);
        return map;
    }

    @RequestMapping(value = "/findUser", method = RequestMethod.GET)
    public Message findUser(UserInfoEntity userInfoEntity) {
        UserInfoEntity entity = dao.findUser(userInfoEntity.getTdAccount());
        if (entity != null) {
            if (entity.getTdPassword().equals(userInfoEntity.getTdPassword())) {
                return Message.success().add("data", entity);
            }
        }
        return Message.fail();
    }

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public Message register(UserInfoEntity entity) {
        if (dao.createUser(entity))
            return Message.success();
        return Message.fail();
    }

    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public Message updata(UserInfoEntity entity) {
        if (dao.updateUser(entity)) {
            return Message.success().add("data", dao.findUser(entity.getTdAccount()));
        }
        return Message.fail();
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public Message delete(UserInfoEntity entity) {
        if (dao.deleteUser(entity.getTdId())) {
            return Message.success();
        }
        return Message.fail();
    }

    @RequestMapping(value = "/savaImg", method = RequestMethod.POST)
    public Message save(@RequestParam(value = "file") MultipartFile file, UserInfoEntity userInfoEntity) throws FileNotFoundException {
        if (userInfoEntity != null) {
            String fileName = UUID.randomUUID().toString().replaceAll("-", "") + file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            //String filePath = "/img/" + fileName;
            //保存文件的绝对路径
            String relativePath = "/images/"+fileName;
            userInfoEntity.setTdImg(relativePath);
            if(dao.updateUser(userInfoEntity)){
                String filePath = ResourceUtils.getURL("classpath:").getPath() + "static/images/";
                File dest = new File(filePath + fileName);
                // 检测是否存在目录
                if (!dest.getParentFile().exists()) {
                    dest.getParentFile().mkdirs();
                }
                try {
                    file.transferTo(dest);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return Message.success().add("data",dao.findUser(userInfoEntity.getTdAccount()));
            }
        }
        return Message.fail();
    }
}
