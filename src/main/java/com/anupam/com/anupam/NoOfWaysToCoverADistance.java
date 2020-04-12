package com.anupam.com.anupam;

public class NoOfWaysToCoverADistance   {
    public static int getNoOfWaysToCoverADistance(int distance) {
        int[] noOfWays = new int[distance+1];
        noOfWays[1] = 1;
        noOfWays[2] = 2;
        noOfWays[3] = 4;

        for(int i = 4;i<=distance;i++) {
            noOfWays[i] = noOfWays[i-1] + noOfWays[i-2] + noOfWays[i-3];
        }
        return noOfWays[distance];
    }

    public static void getTestVarargs(int... args) {
        int sum = 0;
        for(int arg : args ) {
            sum = sum + arg;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        System.out.println(getNoOfWaysToCoverADistance(3));
        System.out.println(getNoOfWaysToCoverADistance(4));
        System.out.println(getNoOfWaysToCoverADistance(5));
        getTestVarargs(1,2,3);
    }
}
