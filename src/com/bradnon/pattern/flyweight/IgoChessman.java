package com.bradnon.pattern.flyweight;

public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coordinates){
        System.out.println("棋子的颜色：" + this.getColor() + ",棋子位置：" + coordinates.getX() + " -- " + coordinates.getY());
    }
}
