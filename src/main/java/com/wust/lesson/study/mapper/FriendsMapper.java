package com.wust.lesson.study.mapper;

import com.wust.lesson.study.model.Friends;
import com.wust.lesson.study.model.FriendsExample;
import java.util.List;

import com.wust.lesson.study.return_modal.returnFriends;
import org.apache.ibatis.annotations.Param;

public interface FriendsMapper {
    int countByExample(FriendsExample example);

    int deleteByExample(FriendsExample example);

    int deleteByPrimaryKey(Integer tdId);

    int insert(Friends record);

    int insertSelective(Friends record);

    List<Friends> selectByExample(FriendsExample example);

    Friends selectByPrimaryKey(Integer tdId);

    int updateByExampleSelective(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByExample(@Param("record") Friends record, @Param("example") FriendsExample example);

    int updateByPrimaryKeySelective(Friends record);

    int updateByPrimaryKey(Friends record);

    List<returnFriends> selectByUserid(Integer userId);
}