package com.anupam.com.anupam;

public class CountNoOfWayToReachNthStairs {
    public static int getNoOfWaysToReachNthStairs(int N) {
        int[] noOfWays = new int[N+1];
        noOfWays[1] = 1;
        noOfWays[2] = 2;
        //noOfWays[3] = 4;
        for(int i=3; i<=N;i++) {
            noOfWays[i] =  noOfWays[i-1] + noOfWays[i-2] ;//+ noOfWays[i-3];
        }
        return noOfWays[N];
    }

    public static void main(String[] args) {
        System.out.println(getNoOfWaysToReachNthStairs(4));
        System.out.println(getNoOfWaysToReachNthStairs(5));
    }
}
