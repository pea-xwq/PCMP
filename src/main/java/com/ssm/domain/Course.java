package com.ssm.domain;

import java.io.Serializable;

/**
 * 课程
 */
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

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

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

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
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

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String getcInfo() {
        return cInfo;
    }

    public void setcInfo(String cInfo) {
        this.cInfo = cInfo;
    }

    public Integer getAttend() {
        return attend;
    }

    public void setAttend(Integer attend) {
        this.attend = attend;
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
