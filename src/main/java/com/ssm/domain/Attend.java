package com.ssm.domain;

import java.io.Serializable;

public class Attend implements Serializable {

    private Integer uid;
    private Integer cid;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Attend{" +
                "uid=" + uid +
                ", cid=" + cid +
                '}';
    }
}
