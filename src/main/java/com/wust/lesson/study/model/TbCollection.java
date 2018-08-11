package com.wust.lesson.study.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TbCollection {
    private Integer tdId;

    private String tdAuthor;

    private Integer deleteFlag;

    private String remark;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date tdTime;

    private String tdTitle;

    private String tdType;

    private Integer tdUserid;

    private Integer tdWorkid;

    public Integer getTdId() {
        return tdId;
    }

    public void setTdId(Integer tdId) {
        this.tdId = tdId;
    }

    public String getTdAuthor() {
        return tdAuthor;
    }

    public void setTdAuthor(String tdAuthor) {
        this.tdAuthor = tdAuthor == null ? null : tdAuthor.trim();
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getTdTime() {
        return tdTime;
    }

    public void setTdTime(Date tdTime) {
        this.tdTime = tdTime;
    }

    public String getTdTitle() {
        return tdTitle;
    }

    public void setTdTitle(String tdTitle) {
        this.tdTitle = tdTitle == null ? null : tdTitle.trim();
    }

    public String getTdType() {
        return tdType;
    }

    public void setTdType(String tdType) {
        this.tdType = tdType == null ? null : tdType.trim();
    }

    public Integer getTdUserid() {
        return tdUserid;
    }

    public void setTdUserid(Integer tdUserid) {
        this.tdUserid = tdUserid;
    }

    public Integer getTdWorkid() {
        return tdWorkid;
    }

    public void setTdWorkid(Integer tdWorkid) {
        this.tdWorkid = tdWorkid;
    }
}