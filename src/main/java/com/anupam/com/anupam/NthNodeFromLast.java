//package com.anupam.com.anupam;
//
//public class NthNodeFromLast {
//    public Node getNthNodeFromLast(Node head, int NthNodeFromLast) {
//        Node temp = null;
//        Node current = head;
//        int count = 0;
//        while(current != null) {
//         count ++;
//         current = current.getNext();
//        }
//
//        int nthNodeFromFirst = count - NthNodeFromLast + 1;
//        current = head;
//        count = 0;
//        while(current != null && count < nthNodeFromFirst) {
//            count ++;
//            current = current.getNext();
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
