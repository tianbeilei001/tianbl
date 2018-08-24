package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月13日 16:08
 */
public class Q031 {
    public static void main(String[] args) {
        int n = 10 ;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(num(i,j)+" ");
            }
            System.out.println();
        }
    }
    public static int num(int x,int y){
        if(y==1||y==x){
            return  1;
        }
        int c =  num(x-1,y-1)+num(x-1,y);
        return c;

    }
}
