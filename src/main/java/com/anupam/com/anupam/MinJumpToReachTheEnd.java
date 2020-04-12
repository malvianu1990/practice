package com.anupam.com.anupam;

public class MinJumpToReachTheEnd {
    public static int minJumpToReachTheEnd(int [] arr, int low, int high) {
     if(low >= high){
         return 0;
     }
     int start = arr[low];
     if(start ==1) {
         return 1 + minJumpToReachTheEnd(arr, low +1, high);
     } else {
         int max = Integer.MIN_VALUE;
         for(int i= low;i<= low+start;i++) {
             if(arr[i] > max) {
                 max = i;
             }
         }
         return 1+minJumpToReachTheEnd(arr, low+max, high);
     }
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumpToReachTheEnd(arr,0,arr.length));
    }
}
