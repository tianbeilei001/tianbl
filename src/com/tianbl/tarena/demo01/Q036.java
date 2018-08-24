package com.tianbl.tarena.demo01;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月16日 10:55
 */
public class Q036 {
    public static void main(String[] args) {
        for(int i = 101;i<=200;i++){
            boolean b= true;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    b= false;
                    break;
                }
            }
            if(b){
                System.out.println(i);
            }

        }
    }
}
