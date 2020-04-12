package com.anupam.com.anupam;

public class MinCostToFillBag {
    public static int minCostToFillBag(int costs[], int m, int W) {
        if(W <=0 ) {
            return 0;
        }

        if(m <=0) {
            return 0;
        }

        if(m > W) {
            return minCostToFillBag(costs, m-1, W);
        }

        if(m < W && m*(m+1)/2 < W) {
            return 0;
        }

        int x = costs[m - 1]+minCostToFillBag(costs, m - 1, W - m);
        int y = minCostToFillBag(costs, m - 1, W);
        if(y ==0) {
            return x;
        } else if (x ==0) {
            return y;
        } else {
            return min(x, y);
        }


    }

    public static  int  min(int x,int y) {
        return x > y ? y:x;
    }

    public static void main(String[] args) {
        int costs[] = {20, 10, 4, 50, 100};
        int W = 5;
        System.out.println(minCostToFillBag(costs, 5, 5));
        System.out.println(minCostToFillBag(costs, 5, 4));
        System.out.println(minCostToFillBag(costs, 5, 1));
        System.out.println(minCostToFillBag(costs, 5, 7));
    }
}
