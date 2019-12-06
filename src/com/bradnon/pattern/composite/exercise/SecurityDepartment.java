package com.bradnon.pattern.composite.exercise;

public class SecurityDepartment implements School {

    private String name;

    public SecurityDepartment(String name) {
        this.name = name;
    }

    @Override
    public void addPart(School company) {

    }

    @Override
    public void removePart(School company) {

    }

    @Override
    public void displayPart() {

    }

    @Override
    public void action() {
        System.out.println("我是" + name + "负责学校的网络管理");
    }
}
