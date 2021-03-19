package com.bradnon.pattern2.adapter.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 15:56
 */
public class ElectricAdapter implements Motor{

    private ElectricMotor eMotor;

    public ElectricAdapter(ElectricMotor eMotor) {
        this.eMotor = eMotor;
    }

    @Override
    public void drive() {
        eMotor.electricDrive();
    }
}
