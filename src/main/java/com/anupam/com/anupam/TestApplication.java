//package com.anupam.com.anupam;
//
//import java.util.HashSet;
//import java.util.Set;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//public class TestApplication {
//    public static void main(String[] args) {
//
//        Test t1 = new Test("First");
//        Test t2 = new Test("Second");
//        Test t3 = new Test("Third");
//        new Thread(System.out::println).start();
//
//        ExecutorService exec = Executors.newCachedThreadPool();
//        exec.submit(System.out::println);
//        Set<Test> set = new HashSet<>();
//        set.add(t1);
//        set.add(t2);
//        set.add(t3);
//        t2.setS("Second String");
//        Test t4 = new Test("Second");
//        System.out.println(set.contains(t1));
//        System.out.println(set.contains(t2));
//        System.out.println(set.contains(t3));
//        System.out.println(set.contains(t4));
//    }
//}
