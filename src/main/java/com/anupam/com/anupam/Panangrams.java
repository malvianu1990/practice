package com.anupam.com.anupam;

public class Panangrams {
    public static String missingPanagrams(String argument) {
        int[] charArray = new int[256];
        char[] argumentCharArray = argument.toCharArray();
        for(char ch : argumentCharArray) {
            charArray[ch] = charArray[ch] +1;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int ch: charArray) {
            if(ch == 0) {
                stringBuilder.append((char) ch);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String test = "welcome to geeksforgeeks";
        System.out.println(missingPanagrams(test));
    }
}
