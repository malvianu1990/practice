package com.anupam.com.anupam;

public class Palindrome {
    public static boolean isPalindrome(String palindromeString) {
        char[] palindromeStringCharArray = palindromeString.toCharArray();
        StringBuilder reverString = new StringBuilder();
        for(int i = palindromeString.length()-1;i>=0;i--) {
            reverString.append(palindromeStringCharArray[i]) ;

        }
        String reversePalindromeString = reverString.toString();
        return reversePalindromeString.equals(palindromeString);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("abbccbba"));
        System.out.println(isPalindrome("geeks"));
    }
}
