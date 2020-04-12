package com.anupam.com.anupam;

public class FindFirstRepeatedCharacter {
    private FindFirstRepeatedCharacter() {

    }

    public static char findFirstRepeatedCharacter(String str) {
        char firstRepeatedCharacter = ' ';
        int[] arr = new int[256];
        char[] strArray = str.toCharArray();
        for(char ch : strArray) {
            arr[ch] = arr[ch] + 1;
        }

        for(char ch:strArray) {
            if(arr[ch] > 1) {
                firstRepeatedCharacter = ch;
                break;
            }
        }
        return firstRepeatedCharacter;
    }
}
