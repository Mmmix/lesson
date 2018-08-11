package com.wust.lesson.study.mapper;

import com.wust.lesson.study.model.TbMessage;
import com.wust.lesson.study.model.TbMessageExample;
import java.util.List;

import com.wust.lesson.study.return_modal.returnMessage;
import org.apache.ibatis.annotations.Param;

public interface TbMessageMapper {
    int countByExample(TbMessageExample example);

    int deleteByExample(TbMessageExample example);

    int deleteByPrimaryKey(Integer tdId);

    int insert(TbMessage record);

    int insertSelective(TbMessage record);

    List<TbMessage> selectByExample(TbMessageExample example);

    TbMessage selectByPrimaryKey(Integer tdId);

    int updateByExampleSelective(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByExample(@Param("record") TbMessage record, @Param("example") TbMessageExample example);

    int updateByPrimaryKeySelective(TbMessage record);

    int updateByPrimaryKey(TbMessage record);

    List<returnMessage> selectSender(Integer userId);

    List<returnMessage> selectAddress(Integer userId);
}