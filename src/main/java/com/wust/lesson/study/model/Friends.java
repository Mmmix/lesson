package com.wust.lesson.study.model;

public class Friends {
    private Integer tdId;

    private Integer deleteFlag;

    private Integer tdFriendid;

    private String remark;

    private Integer tdStatus;

    private Integer tdUserid;

    public Integer getTdId() {
        return tdId;
    }

    public void setTdId(Integer tdId) {
        this.tdId = tdId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Integer getTdFriendid() {
        return tdFriendid;
    }

    public void setTdFriendid(Integer tdFriendid) {
        this.tdFriendid = tdFriendid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getTdStatus() {
        return tdStatus;
    }

    public void setTdStatus(Integer tdStatus) {
        this.tdStatus = tdStatus;
    }

    public Integer getTdUserid() {
        return tdUserid;
    }

    public void setTdUserid(Integer tdUserid) {
        this.tdUserid = tdUserid;
    }
}