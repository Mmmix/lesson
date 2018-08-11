package com.wust.lesson.study.service.Impl;

import com.wust.lesson.study.mapper.CompositionMapper;
import com.wust.lesson.study.model.Composition;
import com.wust.lesson.study.model.CompositionExample;
import com.wust.lesson.study.service.CompositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompositionServiceImpl implements CompositionService {
    @Autowired
    CompositionMapper mapper;

    @Override
    public List<Composition> getCompositionById(int userid){
        CompositionExample example = new CompositionExample();
        CompositionExample.Criteria criteria = example.createCriteria();
        criteria.andTbUseridEqualTo(userid);
        List<Composition> list = mapper.selectByExample(example);
        if (list.size()>0)
            return list;
        return null;
    }

    @Override
    public boolean createComposition(Composition composition){
        return mapper.insertSelective(composition)>0;
    }

    @Override
    public List<Composition> getAll() {
        List<Composition> list = mapper.selectByExample(null);
        if (list.size()>0)
            return list;
        return null;
    }

    @Override
    public List<Composition> getByTitle(String title) {
        return mapper.searchByTitle(title);
    }

    @Override
    public boolean update(Composition composition) {
        return mapper.updateByPrimaryKeySelective(composition)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return mapper.deleteByPrimaryKey(id)>0;
    }


}
