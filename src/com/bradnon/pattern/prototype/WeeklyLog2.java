package com.bradnon.pattern.prototype;

import java.io.*;

// 原型类
public class WeeklyLog2 implements Serializable {
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

   public WeeklyLog2 deepClone() throws Exception {
       ObjectInputStream ois = null;
       ByteArrayOutputStream bao = null;
       ObjectOutputStream oos = null;
       ByteArrayInputStream bai = null;
       try {
           //将对象写入流中
           bao = new ByteArrayOutputStream();
           oos = new ObjectOutputStream(bao);
           oos.writeObject(this);

           // 从流中读对象
           bai = new ByteArrayInputStream(bao.toByteArray());
           ois = new ObjectInputStream(bai);
       } finally {
           bai.close();
           bao.close();
           ois.close();
           oos.close();

       }
       return (WeeklyLog2) ois.readObject();
   }


}
