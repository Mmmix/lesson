package com.wust.lesson.study.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Composition {
    private Integer tbId;

    private Integer deleteFlag;

    private String tbFileurl;

    private String remark;

    private String tbSummary;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date tbTime;

    private String tbTitle;

    private Integer tbUserid;

    private String tbRead;

    private String tbComment;

    private String tbCollection;

    private String tbContent;

    public Integer getTbId() {
        return tbId;
    }

    public void setTbId(Integer tbId) {
        this.tbId = tbId;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public String getTbFileurl() {
        return tbFileurl;
    }

    public void setTbFileurl(String tbFileurl) {
        this.tbFileurl = tbFileurl == null ? null : tbFileurl.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTbSummary() {
        return tbSummary;
    }

    public void setTbSummary(String tbSummary) {
        this.tbSummary = tbSummary == null ? null : tbSummary.trim();
    }

    public Date getTbTime() {
        return tbTime;
    }

    public void setTbTime(Date tbTime) {
        this.tbTime = tbTime;
    }

    public String getTbTitle() {
        return tbTitle;
    }

    public void setTbTitle(String tbTitle) {
        this.tbTitle = tbTitle == null ? null : tbTitle.trim();
    }

    public Integer getTbUserid() {
        return tbUserid;
    }

    public void setTbUserid(Integer tbUserid) {
        this.tbUserid = tbUserid;
    }

    public String getTbRead() {
        return tbRead;
    }

    public void setTbRead(String tbRead) {
        this.tbRead = tbRead == null ? null : tbRead.trim();
    }

    public String getTbComment() {
        return tbComment;
    }

    public void setTbComment(String tbComment) {
        this.tbComment = tbComment == null ? null : tbComment.trim();
    }

    public String getTbCollection() {
        return tbCollection;
    }

    public void setTbCollection(String tbCollection) {
        this.tbCollection = tbCollection == null ? null : tbCollection.trim();
    }

    public String getTbContent() {
        return tbContent;
    }

    public void setTbContent(String tbContent) {
        this.tbContent = tbContent == null ? null : tbContent.trim();
    }
}