package com.tianbl.tarena.demo01;

import java.util.Arrays;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月12日 14:48
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            Random random = new Random();
            arr[i]= random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------冒泡排序开始----------");
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=t;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("-------------冒泡排序结束----------");
        System.out.println(Arrays.toString(arr));
    }
}
