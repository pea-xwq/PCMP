package com.ssm.domain;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer cId;
    private Integer tId;
    private String cName;
    private String cInfo;

    public Integer getcId() {
        return cId;
    }

    public void settId(Integer cId) {
        this.cId = cId;
    }

    public Integer gettId() {
        return tId;
    }

    public void setmId(Integer tId) {
        this.tId = tId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cId=" + cId +
                ", tId=" + tId +
                ", cName='" + cName + '\'' +
                ", cInfo='" + cInfo + '\'' +
                '}';
    }
}
