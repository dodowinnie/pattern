package com.bradnon.pattern.adapter;

public class OperationAdapter implements SourceOperation {

    private QuickSort sortObj;
    private BinarySearch searchObj;

    public OperationAdapter (){
        this.sortObj = new QuickSort();
        this.searchObj = new BinarySearch();
    }

    @Override
    public int[] sort(int[] array) {
        return sortObj.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return searchObj.binarySearch(array, key);
    }
}
