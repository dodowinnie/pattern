package com.bradnon.pattern2.adapter.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 16:11
 */
public class ClientTest {

    public static void main(String[] args) {
        ElectricMotor electricMotor = new ElectricMotor();
        Motor motor = new ElectricAdapter(electricMotor);
        motor.drive();
        OpticalMotor opticalMotor = new OpticalMotor();
        Motor motor1 = new OpticalAdapter(opticalMotor);
        motor1.drive();


    }
}
