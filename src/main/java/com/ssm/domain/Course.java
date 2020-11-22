package com.ssm.domain;

import java.io.Serializable;

public class Course implements Serializable {
    private Integer cId;
    private String cName;
    private Integer sId;
    private String sName;
    private Integer mId;
    private String mName;
    private Integer tId;
    private String tName;
    private String cInfo;
    private Integer attend;

    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
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
                ", cName='" + cName + '\'' +
                ", sId=" + sId +
                ", sName='" + sName + '\'' +
                ", mId=" + mId +
                ", mName='" + mName + '\'' +
                ", tId=" + tId +
                ", tName='" + tName + '\'' +
                ", cInfo='" + cInfo + '\'' +
                ", attend=" + attend +
                '}';
    }
}
