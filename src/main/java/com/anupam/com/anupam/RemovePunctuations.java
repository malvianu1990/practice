package com.anupam.com.anupam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class RemovePunctuations {
    public static void main(String[] args) {
        // input string
        String str = "Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks";

        // similar to Matcher.replaceAll
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);
        System.out.println(reverseStringAfterRemovingVowels("geeksforgeeks"));
    }

    public static String reverseStringAfterRemovingVowels(String argument) {
        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] chars = argument.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : chars) {
            if(!vowels.contains(ch)) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.reverse().toString();
    }
}
