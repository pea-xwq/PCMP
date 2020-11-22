package com.ssm.domain;

import java.io.Serializable;

public class User implements Serializable {
    public String getTelephone() {
        return telephone;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setTelephone(String telephone){

        this.telephone = telephone;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String telephone;
    private String email;
    private String userName;
    private String password;
}
