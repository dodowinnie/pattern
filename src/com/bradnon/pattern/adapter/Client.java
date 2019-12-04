package com.bradnon.pattern.adapter;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        SourceOperation source = new OperationAdapter();
        int[] array = {84,76,50,69,90,91,88,96};
        int[] sort = source.sort(array);
        for (int i = 0; i < sort.length; i++) {
            System.out.println(sort[i]);
        }
    }
}
