package com.wust.lesson.study.model;

public class UserInfoEntity {
    private Integer tdId;

    private String tdName;

    private String tdSex;

    private String tdAge;

    private String tdRole;

    private String tdAccount;

    private String tdEmail;

    private String tdImg;

    private String tdPassword;

    public UserInfoEntity() {
    }

    public UserInfoEntity(Integer tdId, String tdName, String tdSex, String tdAge, String tdRole, String tdAccount, String tdEmail, String tdImg, String tdPassword) {
        this.tdId = tdId;
        this.tdName = tdName;
        this.tdSex = tdSex;
        this.tdAge = tdAge;
        this.tdRole = tdRole;
        this.tdAccount = tdAccount;
        this.tdEmail = tdEmail;
        this.tdImg = tdImg;
        this.tdPassword = tdPassword;
    }

    public Integer getTdId() {
        return tdId;
    }

    public void setTdId(Integer tdId) {
        this.tdId = tdId;
    }

    public String getTdName() {
        return tdName;
    }

    public void setTdName(String tdName) {
        this.tdName = tdName == null ? null : tdName.trim();
    }

    public String getTdSex() {
        return tdSex;
    }

    public void setTdSex(String tdSex) {
        this.tdSex = tdSex == null ? null : tdSex.trim();
    }

    public String getTdAge() {
        return tdAge;
    }

    public void setTdAge(String tdAge) {
        this.tdAge = tdAge == null ? null : tdAge.trim();
    }

    public String getTdRole() {
        return tdRole;
    }

    public void setTdRole(String tdRole) {
        this.tdRole = tdRole == null ? null : tdRole.trim();
    }

    public String getTdAccount() {
        return tdAccount;
    }

    public void setTdAccount(String tdAccount) {
        this.tdAccount = tdAccount == null ? null : tdAccount.trim();
    }

    public String getTdEmail() {
        return tdEmail;
    }

    public void setTdEmail(String tdEmail) {
        this.tdEmail = tdEmail == null ? null : tdEmail.trim();
    }

    public String getTdImg() {
        return tdImg;
    }

    public void setTdImg(String tdImg) {
        this.tdImg = tdImg == null ? null : tdImg.trim();
    }

    public String getTdPassword() {
        return tdPassword;
    }

    public void setTdPassword(String tdPassword) {
        this.tdPassword = tdPassword == null ? null : tdPassword.trim();
    }
}