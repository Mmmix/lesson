package com.wust.lesson.study.service;

import com.wust.lesson.study.model.Friends;
import com.wust.lesson.study.return_modal.returnFriends;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FriendService {

    List<Friends> getByUserId(Integer userid);

    List<returnFriends> getFriends(Integer userid);

    boolean addFriends(Friends friends);

    boolean updateFriends(Friends friends);

    boolean deleteFriends(Integer userid,Integer friendid);

    boolean deleteFriendsByid(Integer tdId);
}
