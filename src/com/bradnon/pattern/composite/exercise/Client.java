package com.bradnon.pattern.composite.exercise;

public class Client {

    public static void main(String[] args) {
        School school = new XingzhiHighSchool("行知中学");
        InternetDepartment internetDepartment = new InternetDepartment("行知中学网络部门");
        SecurityDepartment securityDepartment = new SecurityDepartment("行知中学保卫部门");
        school.addPart(internetDepartment);
        school.addPart(securityDepartment);

        school.action();
    }
}
