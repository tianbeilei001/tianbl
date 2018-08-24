package com.tianbl.tarena.demo02;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月19日 15:55
 */
public class Q049 {
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<=100*3;i+=3){
            for(int j=0;j<=100/3;j++){
                for(int k=0;k<=100/5;k++){
                    if(i/3+j*3+k*5==100&&i+j+k==100){
                        count++;
                        System.out.println("公鸡:"+j+"母鸡:"+k+"小鸡:"+i);
                    }
                }

            }
        }
        System.out.println("共"+count+"种买法");
    }
}
