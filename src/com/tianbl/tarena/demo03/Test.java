package com.tianbl.tarena.demo03;

/**
 * Created with IntelliJ IDEA.
 *
 * @author TianBeilei
 * @version V1.0
 * @date 2018年07月20日 16:05
 */
public class Test {
    public static void main(String[] args) {
        TestThread1 tt1 = new TestThread1();
        tt1.start();
        TestThread2 tt2 = new TestThread2();
        tt2.start();

    }
}
class TestThread1 extends Thread{
    @Override
    public void run() {
        char[] str = {'H', 'e', 'l', 'l', 'o'};
        try {
                for (int i = 0; i < str.length; i++) {
                    System.out.println(str[i]);
                    sleep(1000);
                }
            System.out.println();
            }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class TestThread2 extends Thread{
    @Override
    public void run() {
        char[] str = {'H', 'e', 'l', 'l', 'o'};
        try {
            for (int i = 0; i < str.length; i++) {
                System.out.println(str[i]);
                sleep(1000);
            }
            System.out.println();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
