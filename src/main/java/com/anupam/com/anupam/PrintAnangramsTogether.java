package com.anupam.com.anupam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class PrintAnangramsTogether {
    public static String[] printAnangramsTogether(String[] array) {
        TreeSet<String> treeSet = new TreeSet<>();
        for(String string: array) {
            treeSet.add(string);
        }
        List<String> strings = new ArrayList<>();
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            strings.add(iterator.next());
        }

        return strings.toArray(array);
    }

    public static void main(String[] args) {
        String [] arr = {"cat", "dog", "tac", "god", "act"};
        for(String string : arr)
        System.out.print(string+" ");
        System.out.println();
        arr = printAnangramsTogether(arr);
        for(String string : arr)
            System.out.print(string+" ");
    }
}
