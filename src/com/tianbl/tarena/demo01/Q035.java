package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 10:37
 */
public class Q035 {
    public static void main(String[] args) {
        int[] b = new int[99];
        for(int i=0;i<99;i++){
            b[i] = i+1;
        }
        int[] a = new int[100];
        for(int t:b){
            a[t-1] = t;
        }
        for(int t=0;t<a.length;t++){
            if(a[t]==0){
                System.out.println(t+1);
            }

        }

    }
}
