package com.daidao.learn.algorithm.sort;


/**
 * 选择排序
 * https://www.cnblogs.com/jingmoxukong/p/4303289.html
 * */
public class SelectionSort {

    public static void sort01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 寻找[i, n)区间里的最小值的索引
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            swap( arr , i , minIndex);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public static void main(String[] args) {
        int array[] = {10,5,3,1,7,2,8};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.println(element+" ");
        }
        sort01(array);
        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.println(element+" ");
        }
    }

}
