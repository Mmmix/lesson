package com.wust.lesson.study.service;

import com.wust.lesson.study.model.TbCollection;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CollectionService {
    List<TbCollection> getByUserId(Integer userId);

    boolean deleteCollection(Integer tdId);

    boolean createCollection(TbCollection tbCollection);
}
