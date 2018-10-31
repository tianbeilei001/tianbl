package com.mypackage.v1ch03;

/**
 * 描述:
 * This program demonstrates a triangular array.
 *
 * @author TianBeilei
 * @version V1.0
 * @create 2018年09月28日  11:46
 */
public class LotteryArray {

    public static void main(String[] args) {
        final int nMax = 10;

        // allocate triangular array
        int[][] odds = new int[nMax + 1][];
        for (int n = 0; n <= nMax; n++) {
            odds[n] = new int[n + 1];
        }

        // fill triangular array
        int n=0;
        while(n < odds.length){
            for (int k = 0; k < odds[n].length; k++) {
                /*
                 * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
                 */
                int lotteryOdds = 1;
                for (int i = 1; i <= k; i++) {
                    lotteryOdds = lotteryOdds * (n - i + 1) / i;
                }

                odds[n][k] = lotteryOdds;
            }
            n++;
        }


        // print triangular array
        for (int[] row : odds)
        {
            for (int odd : row) {
                System.out.printf("%4d", odd);
            }
            System.out.println();
        }
    }
}
