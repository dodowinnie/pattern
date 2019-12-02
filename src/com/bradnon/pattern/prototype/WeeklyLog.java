package com.bradnon.pattern.prototype;

import java.io.Serializable;

// 原型类
public class WeeklyLog implements Cloneable, Serializable {
    private String name;
    private String date;
    private String content;
    private Attachment attachment;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    @Override
    public String toString() {
        return "WeeklyLog{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", content='" + content + '\'' +
                ", attachment=" + attachment +
                '}';
    }

    public WeeklyLog clone() throws CloneNotSupportedException {
        Object obj = null;
        try {
            obj = super.clone();
            return (WeeklyLog) obj;
        }catch (Exception e){
            System.out.println("无法转换");
            return null;
        }
    }


}
