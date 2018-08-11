package com.wust.lesson.study.mapper;

import com.wust.lesson.study.model.Composition;
import com.wust.lesson.study.model.CompositionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompositionMapper {
    int countByExample(CompositionExample example);

    int deleteByExample(CompositionExample example);

    int deleteByPrimaryKey(Integer tbId);

    int insert(Composition record);

    int insertSelective(Composition record);

    List<Composition> selectByExampleWithBLOBs(CompositionExample example);

    List<Composition> selectByExample(CompositionExample example);

    List<Composition> searchByTitle(String tbTitle);

    Composition selectByPrimaryKey(Integer tbId);

    int updateByExampleSelective(@Param("record") Composition record, @Param("example") CompositionExample example);

    int updateByExampleWithBLOBs(@Param("record") Composition record, @Param("example") CompositionExample example);

    int updateByExample(@Param("record") Composition record, @Param("example") CompositionExample example);

    int updateByPrimaryKeySelective(Composition record);

    int updateByPrimaryKeyWithBLOBs(Composition record);

    int updateByPrimaryKey(Composition record);
}