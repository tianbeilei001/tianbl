package com.mypackage.v1ch14.unsynch;

/**
 * 描述:
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年11月14日  14:32
 */
public class UnsynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_AMOUNT = 1000;
    public static final int DELAY = 100;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS,INITIAL_BALANCE);
        for(int i=0;i<NACCOUNTS;i++){
            int fromAccount = i;
            Runnable runnable =()->{
                try{
                    while(true){
                        int toAccount = (int)(bank.size()*Math.random());
                        double amount  = MAX_AMOUNT*Math.random();
                        bank.transfer(fromAccount,toAccount,amount);
                        Thread.sleep((int)(DELAY*Math.random()));
                    }
                }catch(InterruptedException e){

                }

            };
            Thread t = new Thread(runnable);
            t.start();
        }

    }
}
