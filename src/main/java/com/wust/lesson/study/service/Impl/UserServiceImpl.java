package com.wust.lesson.study.service.Impl;

import com.github.pagehelper.PageHelper;
import com.wust.lesson.study.mapper.UserInfoEntityMapper;
import com.wust.lesson.study.model.UserInfoEntity;
import com.wust.lesson.study.model.UserInfoEntityExample;
import com.wust.lesson.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserInfoEntityMapper userInfoEntityMapper;

    @Override
    public List<UserInfoEntity> getAll() {
        return userInfoEntityMapper.selectByExample(null);
    }

    @Override
    public boolean createUser(UserInfoEntity userInfoEntity) {
        if (userInfoEntity.getTdAccount() != null && !userInfoEntity.getTdAccount().equals("")) {
            UserInfoEntity entity = findUser(userInfoEntity.getTdAccount());
            if (entity == null) {
                int n = userInfoEntityMapper.insertSelective(userInfoEntity);
                return n > 0;
            }
        }
        return false;
    }

    @Override
    public UserInfoEntity findUser(String account) {
        UserInfoEntityExample userInfoEntityExample = new UserInfoEntityExample();
        UserInfoEntityExample.Criteria criteria = userInfoEntityExample.createCriteria();
        criteria.andTdAccountEqualTo(account);
        List<UserInfoEntity> userInfoEntities = userInfoEntityMapper.selectByExample(userInfoEntityExample);
        if (userInfoEntities.size() > 0)
            return userInfoEntities.get(0);
        return null;
    }

    @Override
    public boolean updateUser(UserInfoEntity entity) {
        if (entity.getTdId() != null)
            return userInfoEntityMapper.updateByPrimaryKeySelective(entity) > 0;
        return false;
    }

    @Override
    public boolean deleteUser(Integer id){
        if(id!=null)
            return userInfoEntityMapper.deleteByPrimaryKey(id)>0;
        return false;
    }

    @Override
    public List<UserInfoEntity> getUser(String tdName) {
        return userInfoEntityMapper.searchUser(tdName);
    }
}
