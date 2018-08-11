package com.wust.lesson.study.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class TbMessage {
    private Integer tdId;

    private Integer tdAddressid;

    private String tdContent;

    private Integer deleteFlag;

    private String remark;

    private Integer tdSenderid;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date time;

    public Integer getTdId() {
        return tdId;
    }

    public void setTdId(Integer tdId) {
        this.tdId = tdId;
    }

    public Integer getTdAddressid() {
        return tdAddressid;
    }

    public void setTdAddressid(Integer tdAddressid) {
        this.tdAddressid = tdAddressid;
    }

    public String getTdContent() {
        return tdContent;
    }

    public void setTdContent(String tdContent) {
        this.tdContent = tdContent == null ? null : tdContent.trim();
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

    public Integer getTdSenderid() {
        return tdSenderid;
    }

    public void setTdSenderid(Integer tdSenderid) {
        this.tdSenderid = tdSenderid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}