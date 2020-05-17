package com.wxss.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "core_users")
public class User implements Serializable {
    /**
     *
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    /**
     *
     */
    private String name;

    /**
     *
     */
    private String loginId;

    /**
     *
     */
    private String password;

    /**
     * 用户状态
     */
    private String status;

    /**
     * 登录成功总次数
     */
    private Integer loginSuccessCount;

    /**
     * 最后一次成功登录时间
     */
    private Date lastLoginSuccessTime;

    /**
     * 最后一次失败登录时间
     */
    private Date lastLoginFailureTime;

    /**
     * 最后一次登录IP地址
     */
    private String lastLoginIP;

    /**
     *
     */
    private Date createDate;

    /**
     *
     */
    private Date lastUpdateDate;

    /**
     * 初次登录标识
     */
    private Short firstLogin;

    /**
     * 连续登录失败次数
     */
    private Short loginFailureCount;

    /**
     *
     */
    private String createUser;

    /**
     *
     */
    private String lastUpdateUser;

    /**
     * 应用id
     */
    private String appId;

    private static final long serialVersionUID = 1L;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getLoginSuccessCount() {
        return loginSuccessCount;
    }

    public void setLoginSuccessCount(Integer loginSuccessCount) {
        this.loginSuccessCount = loginSuccessCount;
    }

    public Date getLastLoginSuccessTime() {
        return lastLoginSuccessTime;
    }

    public void setLastLoginSuccessTime(Date lastLoginSuccessTime) {
        this.lastLoginSuccessTime = lastLoginSuccessTime;
    }

    public Date getLastLoginFailureTime() {
        return lastLoginFailureTime;
    }

    public void setLastLoginFailureTime(Date lastLoginFailureTime) {
        this.lastLoginFailureTime = lastLoginFailureTime;
    }

    public String getLastLoginIP() {
        return lastLoginIP;
    }

    public void setLastLoginIP(String lastLoginIP) {
        this.lastLoginIP = lastLoginIP;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Short getFirstLogin() {
        return firstLogin;
    }

    public void setFirstLogin(Short firstLogin) {
        this.firstLogin = firstLogin;
    }

    public Short getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Short loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getLastUpdateUser() {
        return lastUpdateUser;
    }

    public void setLastUpdateUser(String lastUpdateUser) {
        this.lastUpdateUser = lastUpdateUser;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", loginId='" + loginId + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", loginSuccessCount=" + loginSuccessCount +
                ", lastLoginSuccessTime=" + lastLoginSuccessTime +
                ", lastLoginFailureTime=" + lastLoginFailureTime +
                ", lastLoginIP='" + lastLoginIP + '\'' +
                ", createDate=" + createDate +
                ", lastUpdateDate=" + lastUpdateDate +
                ", firstLogin=" + firstLogin +
                ", loginFailureCount=" + loginFailureCount +
                ", createUser='" + createUser + '\'' +
                ", lastUpdateUser='" + lastUpdateUser + '\'' +
                ", appId='" + appId + '\'' +
                '}';
    }
}

