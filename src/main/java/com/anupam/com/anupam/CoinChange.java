package com.anupam.com.anupam;

public class CoinChange {

    public static int getCoinChanges(int []coins, int m, int cent) {
        if(cent == 0) {
            return 1;
        }

        if(cent < 0) {
            return 0;
        }

        if(m <=0 && cent > 0) {
            return 0;
        }

        return getCoinChanges(coins, m-1, cent) + getCoinChanges(coins, m, cent-coins[m-1]);
    }

    public static void main(String[] args) {
        int[] coins =  {1,2,3};
        System.out.println(getCoinChanges(coins,3, 4));
    }
}
