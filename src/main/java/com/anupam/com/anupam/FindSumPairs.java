package com.anupam.com.anupam;

import java.util.Optional;

public class FindSumPairs {
    private FindSumPairs(){}

    public static int findSumPairs(int[] arr, int sum) {
        int sumPair = 0;

        for(int i=0;i<arr.length;i++) {
            int k = sum - arr[i];
            for(int j = i+1;j<arr.length;j++) {
                if(k-arr[j] ==0) {
                    sumPair ++;
                }
            }
        }
        return sumPair;
    }
}
