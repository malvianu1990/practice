package com.anupam.com.anupam;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;

public class SecondMostRepeatedString implements Function<String, String> {


    @Override
    public String apply(String s) {
        Objects.requireNonNull(s);
        Map<String, Integer> stringMap = new HashMap<>();
        String secondMostRepeatedString = "";
        String firstMostRepatedString = "";
        Integer maxCount = Integer.MIN_VALUE;
        String [] stringArray = s.split(" ");
        for(String string : stringArray) {
            if(stringMap.get(string) != null) {
                Integer count = stringMap.get(string);
                count = count + 1;
                if(maxCount <= count) {
                    maxCount = count;
                    if(!firstMostRepatedString.equals(string))
                        secondMostRepeatedString = firstMostRepatedString;
                    firstMostRepatedString = string;
                }
                stringMap.put(string, count);
            } else {
                stringMap.put(string, Integer.valueOf(1));
            }
        }
        return secondMostRepeatedString;
    }
}
