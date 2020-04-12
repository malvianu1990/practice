package com.anupam.com.anupam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DeleteNodeWithoutHeadPointer {

    public void deleteNodeWithoutHeadPointer(Node nodeToDelete) {
        Objects.requireNonNull(nodeToDelete);
        Node temp = nodeToDelete.getNext();
        nodeToDelete.setData(temp.getData());
        nodeToDelete.setNext(temp.getNext());
    }

    public void mirrorTheTree(TreeNode root) {
        if(root == null) {
            return;
        }

        mirrorTheTree(root.getLeft());
        mirrorTheTree(root.getRight());

        TreeNode temp = new TreeNode();
        temp = root.getLeft();
        root.setLeft(root.getRight());
        root.setRight(temp);

    }
    //int[] arr = {1,4,1,2,7,5,2}
    public static void countingSort(int[] seq) {
        int[] countArray = {0,0,0,0,0,0,0,0,0,0};
        for (int i : seq) {
            countArray[i] = countArray[i] + 1;
        }

        for(int i =1;i < countArray.length;i++) {
            countArray[i] = countArray[i] + countArray[i-1];
        }
        int length = seq.length;
        int [] outputArray = new int[length];
        for (int i:seq) {
            countArray[i] = countArray[i] -1;
            int index = countArray[i];

            outputArray[index] = i;
        }

        for (int i:outputArray) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,2,7,5,2};
        countingSort(arr);
    }
}
