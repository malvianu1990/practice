package com.anupam.com.anupam;

public class SeparateEvenOdd {

    public static void seperateEvenOdd(Node head) {
        Node tempEven = null;
        Node tempOdd = null;
        Node current = head;
        Node evenHead = null;
        Node oddHead = null;
        while(current != null) {
            if(current.getData() % 2 == 0) {
                if(evenHead == null) {
                    evenHead = current;
                    tempEven = evenHead;
                } else {
                    tempEven.setNext(current);
                    tempEven = current;
                }
            } else {
                if(oddHead == null) {
                    oddHead = current;
                    tempOdd = oddHead;
                } else {
                    tempOdd.setNext(current);
                    tempOdd = current;
                }
            }
            current = current.getNext();

        }

        
    }
}
