package com.bradnon.pattern.singleton.idoh;

public class Load {

    public static long outtime = System.currentTimeMillis();

    static {
        System.out.println("外部类静态代码块加载时间：" + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Load(){
        System.out.println("外部类构造函数加载时间：" + System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    static class InnerLoadClass {
        public static long innerdate = System.currentTimeMillis();
        public InnerLoadClass(){
            System.out.println("静态内部类加载时间：" + System.currentTimeMillis());
        }
    }

    public static void main(String[] args) {
        Load load = new Load();
        long innerdate = InnerLoadClass.innerdate;
        System.out.println("外部类时间：" + Load.outtime);

        System.out.println("静态内部类：" + innerdate);
    }
}
