package com.cwj.first.login.dto;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/5/4.
 */
public class UserInfoDto implements Serializable{

    private String id;
    private String userName;
    private String password;
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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


}
