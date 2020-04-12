package com.anupam.com.anupam;



public class RodCuttingProblem {
    public static int getMaxValue(int [] prices ,int length) {
        if(length <= 0) {
            return 0;
        }
        int maxValue = Integer.MIN_VALUE;
        //TODO implement getmaxValue logic here
        for(int i=0;i<length;i++) {
            maxValue = Math.max(maxValue, prices[i] + getMaxValue(prices, length-i-1));
        }
        return maxValue;
    }

    public static int getMaxValueIterative(int[] prices, int length) {
        {
            int []val = new int[length+1];
            val[0] = 0;
            int i, j;

            // Build the table val[] in bottom up manner and return the last entry
            // from the table
            for (i = 1; i<=length; i++)
            {
                int max_val = Integer.MIN_VALUE;
                for (j = 0; j < i; j++)
                    max_val = Math.max(max_val, prices[j] + val[i-j-1]);
                val[i] = max_val;
            }

            return val[length];
        }
    }

    public static void main(String[] args) {
        int prices[] = {1,   5,   8,   9,  10,  17,  17,  20};
        System.out.println(getMaxValueIterative(prices, prices.length));

        int prices1[] = {3,   5,   8,   9,  10,  17,  17,  20};
        System.out.println(getMaxValue(prices1, prices1.length));
    }
}
