package com.anupam.com.anupam;

public class ReverseStringUsingRecursion {
    public static void reverseString(String argument, int length) {
        if(length <= 0) {
            System.out.println();
            return;
        }
        System.out.print(argument.charAt(length-1));
        reverseString(argument, length-1);

    }

    public static void main(String[] args) {
        reverseString("ABC", 3);
        String xyz = "this is a pen";
        reverseString(xyz, xyz.length());

    }
}
