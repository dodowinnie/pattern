package com.bradnon.pattern2.decorator.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 14:08
 */
public class MorriganTest {

    public static void main(String[] args) {
        Morrigan morrigan = new Original();
//        Changer changer = new Succubus(morrigan);
        Changer changer = new Girl(morrigan);
        changer.display();
    }
}
