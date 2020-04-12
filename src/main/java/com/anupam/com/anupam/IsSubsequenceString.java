package com.anupam.com.anupam;

public class IsSubsequenceString {
    public static boolean isSubsequenceString(String first, String second, int firstStringLength, int secondStringLength) {
        if(firstStringLength == 0) {
            return true;
        }
        if(secondStringLength == 0) {
            return false;
        }
        if(first.charAt(firstStringLength-1) == second.charAt(secondStringLength-1)) {
            return isSubsequenceString(first, second, firstStringLength-1, secondStringLength-1);
        } else {
            return isSubsequenceString(first, second, firstStringLength, secondStringLength-1);
        }
    }

    public static void main(String[] args) {
        String first = "gksrek";
        String second = "geeksforgeeks";
        int firstStringLength = first.length();
        int secondStringLength = second.length();
        System.out.println(isSubsequenceString(first, second, firstStringLength, secondStringLength));
        System.out.println(isSubsequenceString("AXY", "YADXCP", "AXY".length(), "YADXCP".length()));
        System.out.println(isSubsequenceString("gksrek", "geeksforgeeks", "gksrek".length(), "geeksforgeeks".length()));
    }
}
