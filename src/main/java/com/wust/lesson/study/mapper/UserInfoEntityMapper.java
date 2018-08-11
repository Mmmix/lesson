package com.wust.lesson.study.mapper;

import com.wust.lesson.study.model.UserInfoEntity;
import com.wust.lesson.study.model.UserInfoEntityExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;


@Mapper
public interface UserInfoEntityMapper {
    int countByExample(UserInfoEntityExample example);

    int deleteByExample(UserInfoEntityExample example);

    int deleteByPrimaryKey(Integer tdId);

    int insert(UserInfoEntity record);

    int insertSelective(UserInfoEntity record);

    List<UserInfoEntity> selectByExample(UserInfoEntityExample example);

    UserInfoEntity selectByPrimaryKey(Integer tdId);

    int updateByExampleSelective(@Param("record") UserInfoEntity record, @Param("example") UserInfoEntityExample example);

    int updateByExample(@Param("record") UserInfoEntity record, @Param("example") UserInfoEntityExample example);

    int updateByPrimaryKeySelective(UserInfoEntity record);

    int updateByPrimaryKey(UserInfoEntity record);

    List<UserInfoEntity> searchUser(String tdUser);
}