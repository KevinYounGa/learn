package com.daidao.learn.algorithm.sort;

/**
 * 快速排序是冒泡排序的改进版，也是最好的一种内排序
 * https://www.cnblogs.com/MOBIN/p/4681369.html
 * */
public class QuickSort {
    public static void quickSort01(int[] arr,int _left,int _right){
        int left = _left;
        int right = _right;
        int temp = 0;
        //待排序的元素至少有两个的情况
        if(left <= right){
            //待排序的第一个元素作为基准元素
            temp = arr[left];
            //从左右两边交替扫描，直到left = right
            while(left !=right){
                while (right > left && temp <= arr[right] ){
                    //从右往左扫描，找到第一个比基准元素小的元素
                    right--;
                }
                //找到这种元素arr[right]后与arr[left]交换
                arr[left] = arr[right];
                while(left < right && arr[left] <= temp) {
                    //从左往右扫描，找到第一个比基准元素大的元素
                    left ++;
                }
                //找到这种元素arr[left]后，与arr[right]交换
                arr[right] = arr[left];
            }
            //基准元素归位
            arr[right] = temp;
            //对基准元素左边的元素进行递归排序
            quickSort01(arr,_left,left-1);
            //对基准元素右边的进行递归排序
            quickSort01(arr, right+1,_right);
        }
    }


     public static void quickSort02(int[] arr,int left,int right){
        int pivot = 0;
        if(left < right){
            pivot = partition(arr,left,right);
            quickSort02(arr,left,pivot-1);
            quickSort02(arr,pivot+1,right);
        }
     }


     static int partition(int[] arr,int left,int right){
        int key = arr[left];
        while (left < right){
            while (left < right && key <= arr[right]){
                right--;
            }
            arr[left] = arr[right];
            while (left < right && key >= arr[left]){
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }



    public static void main(String[] args) {
        int array[] = {10,5,3,1,7,2,8};
        System.out.println("排序之前：");
        for(int element : array){
            System.out.print(element+" ");
        }
        quickSort02(array,0,array.length-1);
        System.out.println("\n排序之后：");
        for(int element : array){
            System.out.print(element+" ");
        }
    }
}
