package com.bradnon.pattern2.handler.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/19 13:40
 */
public class LeaveApprovalTest {

    public static void main(String[] args) {
        ClassAdviser classAdviser = new ClassAdviser();
        DepartmentHead departmentHead = new DepartmentHead();
        Dean dean = new Dean();
        DeanOfStudies deanOfStudies = new DeanOfStudies();
        classAdviser.setNext(departmentHead);
        departmentHead.setNext(dean);
        dean.setNext(deanOfStudies);
        classAdviser.handleRequest(12);
    }
}
