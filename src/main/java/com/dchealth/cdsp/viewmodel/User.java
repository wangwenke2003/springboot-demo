package com.dchealth.cdsp.viewmodel;

import java.io.Serializable;

/**
 * Created by wangwkc on 2018/6/4.
 */
public class User implements Serializable {
    private Long userId;
    private String userName;
    private String gender;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
