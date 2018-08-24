package com.tianbl.tarena.demo01;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 9:33
 */
public class Q033 {
    private static boolean same(int[]p , int l,int n){
        for(int i=0;i<l;i++){
            if(p[i]==n){
                return  true;
            }
        }
        return false;
    }
    public static void play(int playNumber,int step){
        int[] p = new int[playNumber];
        int counter =1;
        while(true){
            if(counter>playNumber*step){
                break;
            }
            for(int i=1;i<playNumber+1;i++){
                while (true){
                    if(!same(p,playNumber,i)){
                        break;
                    }else{
                        i=i+1;
                    }
                }
                if(i>playNumber){
                    break;
                }
                if(counter%step==0){
                    System.out.print(i+" ");
                    p[counter/step-1]=i;

                }
                counter++;
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(p));

    }

    public static void main(String[] args) {
        play(10,7);
    }
}
