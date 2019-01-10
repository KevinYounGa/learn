package com.daidao.learn.algorithm.sort;

import java.util.Arrays;

/**
 * 插入排序
 * */
public class InsertionSort {
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while (j>0 && arr[j] < arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
    }

    /**
     * 希尔排序
     * 是简单插入排序的改进版。它与插入排序的不同之处在于，它会优先比较距离较远的元素。希尔排序又叫缩小增量排序。
     * */
    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 内部是一个插入排序
            for (int i = 0; i < n; i = i + gap) {
                int e = arr[i];
                int j = i;
                for (; j > 0; j = j - gap) {
                    if (e < arr[j - gap])
                        arr[j] = arr[j - gap];
                    else
                        break;
                }
                arr[j] = e;
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {1, 8, 4, 5, 7, 88, 23 ,3 ,9 ,0};
        System.out.println(Arrays.toString(a));
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }

}
