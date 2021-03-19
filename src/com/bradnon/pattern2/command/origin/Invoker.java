package com.bradnon.pattern2.command.origin;

/**
 * @Description: 命令调用者
 * @author: Brandon
 * @date 2021/3/19 10:32
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call(){
        System.out.println("调用者执行命令command。。。。");
        command.execute();
    }

}
