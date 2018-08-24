package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月12日 11:12
 */
public class SelectSort {
    public static  void selectionSort(int[] number){
        for(int i=0;i<number.length-1;i++){
            for(int m:number){
                System.out.print(m+"***");
            }
            System.out.println();
            int m = i;
            for(int j=i+1;j<number.length;j++){
                if(number[j]<number[m]){
                    m=j;
                }

            }
            if(i!=m){
                swap(number,i,m);
            }
            for(int n:number){
                System.out.print(n+"***");
            }
            System.out.println();
        }
    }
    public static void swap(int[] number,int i,int j){
        int t;
        t = number[i];
        number[i] = number[j];
        number[j] = t;

    }

    public static void main(String[] args) {
        int[] num = new int[10];
        for(int i=0;i<num.length;i++){
            num[i] = (int)(Math.random()*100)+1;
        }
        selectionSort(num);
        for(int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
