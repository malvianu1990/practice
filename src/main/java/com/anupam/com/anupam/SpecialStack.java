package com.anupam.com.anupam;

import java.util.ArrayList;
import java.util.List;

public final class SpecialStack {
    private final List<Integer> values;
    private int counter;
    private int min = Integer.MAX_VALUE;

    public SpecialStack(int size) {
        this.values = new ArrayList<>(size);
        for(int i=0; i< size;i++) {
            values.add(null);
        }
        this.counter = size -1;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("Stack is full");
        } else {
            values.set(counter, value);
            counter = counter - 1;
            if (value < getMin()) {
                min = value;
            }
        }
    }

    public int pop(){
        int value = Integer.MIN_VALUE;
        if(isEmpty()) {
            System.out.println("Stack is Empty..nothing to pop");
        } else {
            value = values.get(counter + 1);
            values.set(counter + 1, null);
            counter = counter +1;

            if(value == getMin()) {
                min = Integer.MAX_VALUE;
                setNewMin();
            }
        }
        return value;
    }

    public boolean isFull() {
        return counter == -1;
    }

    public boolean isEmpty() {
        return counter == values.size() -1;
    }

    public int getMin() {
        return min;
    }

    public void setNewMin() {
        for(int i = counter; i < values.size();i++) {
            if(values.get(i) != null && min > values.get(i)) {
                min = values.get(i);
            }
        }
    }

    public static void main(String[] args) {
        SpecialStack specialStack = new SpecialStack(5);
        specialStack.push(18);
        specialStack.push(19);
        specialStack.push(29);
        specialStack.push(15);
        specialStack.push(16);
        specialStack.push(17);
        System.out.println(specialStack.getMin());
        System.out.println(specialStack.pop());;
        specialStack.push(2);
        System.out.println(specialStack.getMin());
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.push(1);
        System.out.println(specialStack.getMin());


    }
}
