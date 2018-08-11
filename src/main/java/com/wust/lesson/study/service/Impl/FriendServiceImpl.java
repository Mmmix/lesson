package com.wust.lesson.study.service.Impl;

import com.wust.lesson.study.mapper.FriendsMapper;
import com.wust.lesson.study.model.Friends;
import com.wust.lesson.study.model.FriendsExample;
import com.wust.lesson.study.return_modal.returnFriends;
import com.wust.lesson.study.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    FriendsMapper friendsMapper;

    @Override
    public List<Friends> getByUserId(Integer userid) {
        FriendsExample friendsExample = new FriendsExample();
        FriendsExample.Criteria criteria = friendsExample.createCriteria();
        criteria.andTdUseridEqualTo(userid);
        criteria.andDeleteFlagEqualTo(0);
        List<Friends> friendsList = friendsMapper.selectByExample(friendsExample);
        if (friendsList.size() > 0)
            return friendsList;
        return null;
    }

    @Override
    public List<returnFriends> getFriends(Integer userid) {
        List<returnFriends> returnFriends = friendsMapper.selectByUserid(userid);
        if (returnFriends.size()>0)
            return returnFriends;
        return null;
    }

    @Override
    public boolean addFriends(Friends friends) {
        FriendsExample friendsExample = new FriendsExample();
        FriendsExample.Criteria criteria = friendsExample.createCriteria();
        criteria.andTdUseridEqualTo(friends.getTdUserid());
        criteria.andTdFriendidEqualTo(friends.getTdFriendid());
        List<Friends> friendsList = friendsMapper.selectByExample(friendsExample);
        if (friendsList.size()==0)
            return friendsMapper.insertSelective(friends) > 0;
        return false;
    }

    @Override
    public boolean updateFriends(Friends friends) {
        return friendsMapper.updateByPrimaryKeySelective(friends)>0;
    }

    @Override
    public boolean deleteFriends(Integer userid,Integer friendid) {
        FriendsExample friendsExample = new FriendsExample();
        FriendsExample.Criteria criteria = friendsExample.createCriteria();
        criteria.andTdFriendidEqualTo(friendid);
        criteria.andTdUseridEqualTo(userid);
        List<Friends> friendsList = friendsMapper.selectByExample(friendsExample);
        if(friendsList.size()>0){
            friendsList.get(0).setDeleteFlag(1);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteFriendsByid(Integer tdId) {
        Friends friends = new Friends();
        friends.setTdId(tdId);
        friends.setDeleteFlag(1);
        return friendsMapper.updateByPrimaryKeySelective(friends)>0;
    }


}
