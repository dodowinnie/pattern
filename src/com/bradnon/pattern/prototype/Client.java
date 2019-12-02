package com.bradnon.pattern.prototype;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class Client {

    public static void main(String[] args) throws Exception {
        WeeklyLog2 source = new WeeklyLog2();
        source.setContent("这周工作很忙，每天都加班");
        source.setName("Brandon");
        source.setDate("第15周");
        Attachment attachmentSource = new Attachment();
        attachmentSource.setName("第15周周报附件");
        source.setAttachment(attachmentSource);

        System.out.println("原件：" + source.toString());

        WeeklyLog2 clone = source.deepClone();
        if (clone != null) {
            clone.setDate("第16周");
            System.out.println("附件：" + clone.toString());
        }
        System.out.println(source.getContent() == clone.getContent());
        System.out.println(source.getAttachment() == clone.getAttachment());


    }

}
