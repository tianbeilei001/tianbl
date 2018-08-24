package com.tianbl.tarena.demo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月19日 15:06
 */
public class Q044 {
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            if((i%5 == 0 && i%7!=0)||(i%5!=0 && i%7==0)){
                System.out.println(i);
            }
        }
    }
}
