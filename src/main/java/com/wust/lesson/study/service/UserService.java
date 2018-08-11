package com.wust.lesson.study.service;

import com.wust.lesson.study.model.UserInfoEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    public List<UserInfoEntity> getAll();

    public boolean createUser(UserInfoEntity userInfoEntity);

    public UserInfoEntity findUser(String account);

    public boolean updateUser(UserInfoEntity entity);

    public boolean deleteUser(Integer id);

    List<UserInfoEntity> getUser(String tdName);
}
