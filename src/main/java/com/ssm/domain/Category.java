package com.ssm.domain;

import java.io.Serializable;
import java.util.List;

/**
 * 课程大类
 */
public class Category implements Serializable {
    private Integer tId;
    private String tName;
    private Integer cId;

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

}
