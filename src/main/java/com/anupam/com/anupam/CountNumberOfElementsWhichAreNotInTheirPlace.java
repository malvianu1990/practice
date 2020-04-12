package com.anupam.com.anupam;

import java.util.Arrays;

public class CountNumberOfElementsWhichAreNotInTheirPlace {
    public static int countNumberOfElementsWhichAreNotInTheirPlace(int arr[]) {
        int count = 0;

        for(int i = 1;i< arr.length;i++) {
            int key = arr[i];
            int j = i -1;
            while(j>=0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j -1;
                count ++;
            }
            arr[j+1] = key;
        }
        return count;
    }

    public static boolean isAlmostSorted(int []arr) {
        int[] brr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(brr);
        if(arr[0] != brr[0] && (arr[1] != brr[0] || arr[0] != brr[1])) return false;
        for(int i=1;i< arr.length-1;i++) {
            if(arr[i] != brr[i] && (arr[i] != brr[i+1] && arr[i] != brr[i-1])) {
                return false;
            }
        }
        if(arr[arr.length-1] != brr[arr.length-1] && (arr[arr.length-1] != brr[arr.length-2] && arr[arr.length-2 ]!= brr[arr.length-1]) ) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int A[] = { 1, 3, 2, 4, 6, 5 };
        System.out.println(isAlmostSorted(A));
    }
}
