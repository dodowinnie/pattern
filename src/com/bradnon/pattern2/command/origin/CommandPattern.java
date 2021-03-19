package com.bradnon.pattern2.command.origin;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/19 10:37
 */
public class CommandPattern {

    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        invoker.call();
    }
}
