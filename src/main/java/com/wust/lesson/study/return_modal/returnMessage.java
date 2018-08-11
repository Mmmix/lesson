package com.wust.lesson.study.return_modal;

import com.wust.lesson.study.model.UserInfoEntity;

public class returnMessage {

    private Integer tdId;

    private Integer tdAddressid;

    private String tdContent;

    private Integer tdSenderid;

    private String tdName;

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
        this.tdContent = tdContent;
    }

    public Integer getTdSenderid() {
        return tdSenderid;
    }

    public void setTdSenderid(Integer tdSenderid) {
        this.tdSenderid = tdSenderid;
    }

    public String getTdName() {
        return tdName;
    }

    public void setTdName(String tdName) {
        this.tdName = tdName;
    }
}
