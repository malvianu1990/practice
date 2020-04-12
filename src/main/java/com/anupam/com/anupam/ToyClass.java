package com.anupam.com.anupam;

public class ToyClass {
    public static int getToys(int []toysCost,int toys, int totalMoney) {
        int maxCount = Integer.MIN_VALUE;
        if(totalMoney <=0) {
            return 0;
        }

        if(toys ==0) {
            return 0;
        }
            maxCount = Math.max(1+getToys(toysCost, toys-1,totalMoney-toysCost[toys-1]), getToys(toysCost, toys-1, totalMoney) );



        return maxCount;
    }

    public static void main(String[] args) {
        int []arr = {1, 12, 5, 111, 200, 1000, 10, 9, 12, 15};
        System.out.println(getToys(arr, arr.length, 50));
        int[] arr2 =  {1, 12, 5, 111, 200, 1000, 10};
        System.out.println(getToys(arr2, arr2.length, 50));
    }
}
