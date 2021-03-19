package com.bradnon.pattern2.bridge.demo;

/**
 * @Description:
 * @author: Brandon
 * @date 2021/3/18 11:44
 */
public class BagTest {

    public static void main(String[] args) {
        Color yellow = new Yellow();
        Bag handBag = new HandBag();
        handBag.setColor(yellow);
        System.out.println(handBag.getName());

        Color red = new Red();
        Bag wallet = new Wallet();
        wallet.setColor(red);
        System.out.println(wallet.getName());
    }
}
