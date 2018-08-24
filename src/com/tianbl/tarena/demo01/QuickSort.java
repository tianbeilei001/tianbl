package com.tianbl.tarena.demo01;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月13日 17:09
 */
public class QuickSort {
    public static void  sort(int[] number){
        quickSort(number,0,number.length-1);

    }
    private static void quickSort(int[] number,int left,int right){
        if(left<right){
            int s =  number[left];
            int i = left;
            int j =right+1;
            while (true){
                while(i+1<number.length&&number[++i]<s){

                }
                while (j-1>-1&&number[--j]>s){

                }
                if(i>=j){
                    break;
                }
                swap(number,i,j);

            }
            number[left] = number[j];
            number[j] = s;
            quickSort(number,left,j-1);
            quickSort(number,j+1,right);

        }

    }
    private static void swap(int[] number,int i,int j){
        int t;
        t = number[i];
        number[i] = number[j];
        number[j] = t;

    }

    public static void main(String[] args) {
        int[] number= new int[]{24,36,25,32,1,2,5,89,56,456,78,98,65,45,26,59,86,66,35,53};
        sort(number);
        System.out.println(Arrays.toString(number));
    }
}
