package com.bradnon.pattern2.adapter.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/17 16:10
 */
public class OpticalAdapter implements Motor {

    private OpticalMotor oMotor;

    public OpticalAdapter(OpticalMotor oMotor) {
        this.oMotor = oMotor;
    }

    @Override
    public void drive() {
        oMotor.opticalDrive();
    }
}
