package com.anupam.com.anupam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    //54654 54546
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1,3, 0);
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        System.out.println(numbers);

        List<String> strings = Arrays.asList("54", "546", "548", "60");

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1o2 = o1 + o2;
                String o2o1 = o2 + o1;
                return o1o2.compareTo(o2o1) > 0? -1:1;
            }
        });

        System.out.println(strings);
    }


}
