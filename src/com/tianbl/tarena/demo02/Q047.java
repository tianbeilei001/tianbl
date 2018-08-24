package com.tianbl.tarena.demo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月19日 15:34
 */
public class Q047 {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(j*i)+"\t");
            }
            System.out.print("\n");
        }
        for(int i=9;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.print("\n");
        }
    }
}
