package com.daidao.learn.algorithm.sort;

import org.junit.Test;

public class Sort {

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * 冒泡排序
     * https://blog.csdn.net/hansionz/article/details/80822494
     */
    @Test
    public void bubbleSort01(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int flag = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                flag = 0;
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                    flag = 1;
                }
            }
            //如果没有交换过元素，则已经有序
            if(flag == 0){
                return;
            }
        }

        //确定排序趟数
        /*for(int i=0;i<array.length - 1;i++) {
            //确定比较次数
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    //交换
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }*/
    }



    /**
     * bubbleSort01仅仅适用于连片有序而整体无序的数据(例如：1， 2，3 ，4 ，7，6，5)。
     * 但是对于前面大部分是无序而后边小半部分有序的数据(1，2，5，7，4，3，6，8，9，10)排序效率也不可观，
     * 对于种类型数据，我们可以继续优化。既我们可以记下最后一次交换的位置，后边没有交换，必然是有序的，
     * 然后下一次排序从第一个比较到上次记录的位置结束即可。
     * */
    void bubbleSort02(int arr[], int len) {
        int i = 0;
        int tmp = 0;
        int flag = 0;
        //用来记录最后一次交换的位置
        int pos = 0;
        int k = len - 1;
        //确定排序趟数
        for (i = 0; i < len - 1; i++)
        {
            pos = 0;
            int j = 0;
            //确定比较次数
            for (j = 0; j < k; j++)
            {
                flag = 0;
                if (arr[j] > arr[j + 1]) {
                    //交换
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    //加入标记
                    flag = 1;
                    //交换元素，记录最后一次交换的位置
                    pos = j;
                }
            }
            //如果没有交换过元素，则已经有序
            if (flag == 0)
            {
                return;
            }
            //下一次比较到记录位置即可
            k = pos;
        }
    }





}
