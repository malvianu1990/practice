package com.anupam.com.anupam;

public class MinCostDistance {

    public static int minCostDistance(int [][] arr, int destRow, int destColumn) {
        int [][] tc = new int [destRow + 1][destColumn +1];
        tc[0][0] = arr[0][0];
        for(int i =1;i<=destColumn;i++) {
            tc[0][i] = tc[0][i-1] +arr[0][i];
        }
        for (int i =1;i<=destRow;i++) {
            tc[i][0] = tc[i-1][0] + arr[i][0];
        }
        for(int i=1;i<=destRow;i++) {
            for(int j=1;j<=destColumn;j++){
                tc[i][j] = getMin(tc[i-1][j], tc[i-1][j-1], tc[i][j-1]) + arr[i][j];
            }
        }
        return tc[destRow][destColumn];
    }

    public static int getMin(int x, int y, int z) {
        if(x<y && x < z) {
            return x;
        } else if(y < x && y < z) {
            return y;
        } else {
            return z;
        }
    }

    public static void main(String[] args) {
        int [][] cost = { {1, 2, 3},{4, 8, 2}, {1, 5, 3} };
        System.out.println(minCostDistance(cost, 2,2));
        System.out.println(minCostDistance(cost, 1,2));
        System.out.println(minCostDistance(cost, 0,2));
        System.out.println(minCostDistance(cost, 2,1));
    }
}
