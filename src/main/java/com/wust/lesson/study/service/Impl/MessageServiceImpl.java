package com.wust.lesson.study.service.Impl;

import com.wust.lesson.study.mapper.TbMessageMapper;
import com.wust.lesson.study.return_modal.returnMessage;
import com.wust.lesson.study.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    TbMessageMapper tbMessageMapper;
    @Override
    public List<returnMessage> getSender(Integer userId) {
        List<returnMessage> returnMessages = tbMessageMapper.selectSender(userId);
        if (returnMessages.size()>0)
            return returnMessages;
        return null;
    }

    @Override
    public List<returnMessage> getAddress(Integer userId) {
        List<returnMessage> returnMessages = tbMessageMapper.selectAddress(userId);
        if (returnMessages.size()>0)
            return returnMessages;
        return null;
    }
}
