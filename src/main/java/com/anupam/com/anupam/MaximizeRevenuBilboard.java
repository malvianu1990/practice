package com.anupam.com.anupam;

public class MaximizeRevenuBilboard {
    public static int maximizeRevenueBilboard(int [] sites, int[] revenue, int low, int Miles, int space) {
        if(Miles <= 0)
            return 0;

        if(low > sites.length) {
            return 0;
        }
        for(int i =0;i < sites.length; i++ ) {
            sites[i] = low;
        }
        return max(revenue[low]+ maximizeRevenueBilboard(sites, revenue, revenue[low]+space,Miles, space),
                maximizeRevenueBilboard(sites, revenue, low+1, Miles, space));
    }

    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static void main(String[] args) {
        int x[]       = {6, 7, 12, 13, 14};
        int revenue[] = {5, 6, 5,  3,  1};
        int miles = 20;
        int t = 5;
        System.out.println(maximizeRevenueBilboard(x, revenue,6, miles, t));
    }

}