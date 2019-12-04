package com.bradnon.pattern.adapter;

/**
 * 目标接口
 */
public interface SourceOperation {

    public int[] sort(int array[]); // 成绩排序

    public int search(int array[], int key); // 成绩查找
}
