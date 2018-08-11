package com.wust.lesson.study.service.Impl;

import com.wust.lesson.study.mapper.TbCollectionMapper;
import com.wust.lesson.study.model.TbCollection;
import com.wust.lesson.study.model.TbCollectionExample;
import com.wust.lesson.study.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CollectionServiceImpl implements CollectionService {

    @Autowired
    TbCollectionMapper tbCollectionMapper;

    @Override
    public List<TbCollection> getByUserId(Integer userId) {
        TbCollectionExample example = new TbCollectionExample();
        TbCollectionExample.Criteria criteria = example.createCriteria();
        criteria.andTdUseridEqualTo(userId);
        criteria.andDeleteFlagEqualTo(0);
        List<TbCollection> tbCollectionList = tbCollectionMapper.selectByExample(example);
        if (tbCollectionList.size()>0)
            return tbCollectionList;
        return null;
    }

    @Override
    public boolean deleteCollection(Integer tdId) {
        TbCollection collection = new TbCollection();
        collection.setTdId(tdId);
        collection.setDeleteFlag(1);
        return tbCollectionMapper.updateByPrimaryKeySelective(collection)>0;
    }

    @Override
    public boolean createCollection(TbCollection tbCollection) {
        return tbCollectionMapper.insertSelective(tbCollection)>0;
    }
}
