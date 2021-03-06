package com.tianbl.v1ch03;

/**
 * This program shows how to store tabular data in a 2D array.
 * @version 1.40 2004-02-10
 * @author Cay Horstmann
 */
public class CompoundInterest
{
    private static final double START_RATE = 10;
    private static final int N_RATES = 6;
    private static final int N_YEARS = 10;
    public static void main(String[] args)
    {



        // set interest rates to 10 . . . 15%
        double[] interestRate = new double[N_RATES];
        for (int j = 0; j < interestRate.length; j++) {
            interestRate[j] = (START_RATE + j) / 100.0;
        }

        double[][] balances = new double[N_YEARS][N_RATES];

        // set initial balances to 10000
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10000;
        }

        // compute interest for future years
        int i=1;
        while(i < balances.length){
            for (int j = 0; j < balances[i].length; j++)
            {
                // get last year's balances from previous row
                double oldBalance = balances[i - 1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
            i++;
        }

        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++) {
            System.out.printf("%9.0f%%", 100 * interestRate[j]);
        }

        System.out.println();

        // print balance table
        for (double[] row : balances)
        {
            // print table row
            for (double b : row) {
                System.out.printf("%10.2f", b);
            }

            System.out.println();
        }
    }
}
