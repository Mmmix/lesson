package com.wust.lesson.study.service;

import com.wust.lesson.study.model.Composition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CompositionService {

    public List<Composition> getCompositionById(int userid);

    public boolean createComposition(Composition composition);

    public List<Composition> getAll();

    public List<Composition> getByTitle(String title);

    boolean update(Composition composition);

    boolean delete(Integer id);
}
