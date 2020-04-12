package com.anupam.com.anupam;

import java.util.Optional;

public class Bitonic {
    private Bitonic() { }
    public static Optional<Integer> getBitonicPoint(int []arr) {
        Optional<Integer> bitonicPoint = Optional.empty();

        for(int i = 1;i < arr.length-1; i++){
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                bitonicPoint = Optional.of(arr[i]);
            }
        }
        return bitonicPoint;
    }
}
