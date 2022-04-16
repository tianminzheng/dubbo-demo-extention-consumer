package com.jiker.dubbo.demo;

import java.io.Serializable;

public class UserParams implements Serializable {

    private String userName;

    public UserParams() {
    }

    public UserParams(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
