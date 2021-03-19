package com.bradnon.pattern2.command.origin;

/**
 * @Description: 具体命令
 * @author: Brandon
 * @date 2021/3/19 10:30
 */
public class ConcreteCommand implements Command{

    private Receiver receiver;

    public ConcreteCommand() {
        this.receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
