package com.wust.lesson.study.return_modal;

import com.wust.lesson.study.model.UserInfoEntity;

public class returnFriends {

    private Integer tdId;

    private Integer tdStatus;

    private UserInfoEntity friends;

    public Integer getTdStatus() {
        return tdStatus;
    }

    public void setTdStatus(Integer tdStatus) {
        this.tdStatus = tdStatus;
    }

    public Integer getTdId() {
        return tdId;
    }

    public void setTdId(Integer tdId) {
        this.tdId = tdId;
    }

    public UserInfoEntity getFriends() {
        return friends;
    }

    public void setFriends(UserInfoEntity friends) {
        this.friends = friends;
    }
}
