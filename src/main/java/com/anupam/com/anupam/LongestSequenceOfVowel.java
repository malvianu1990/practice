package com.anupam.com.anupam;

import java.util.Set;

public class LongestSequenceOfVowel {
    private final static Set<Character> vowels = Set.of('a','e','i','o','u');
    public static String longestSequenceOfVowels(String s) {
        StringBuilder resultString = new StringBuilder();
        for(char a : s.toCharArray()) {
            if(vowels.contains(a)) {
                resultString.append(a);
            }
        }
        return resultString.toString();
    }

    public static void main(String[] args) {
        System.out.println(longestSequenceOfVowels("geeksforgeeks"));
        System.out.println(longestSequenceOfVowels("HelloWorld"));
    }
}
