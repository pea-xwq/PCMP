package com.ssm.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    private String content;
    private Integer uid;
    private Date time;
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "content='" + content + '\'' +
                ", uid=" + uid +
                ", time=" + time +
                ", uname='" + uname + '\'' +
                '}';
    }
}
