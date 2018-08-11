package com.wust.lesson.study.service;

import com.wust.lesson.study.return_modal.returnMessage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MessageService {
    List<returnMessage> getSender(Integer userId);

    List<returnMessage> getAddress(Integer userId);
}
