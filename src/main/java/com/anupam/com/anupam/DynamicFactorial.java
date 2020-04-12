package com.anupam.com.anupam;

import java.math.BigDecimal;

public class DynamicFactorial {
    public static BigDecimal getFactorial(BigDecimal x) {
        BigDecimal [] dp = new BigDecimal[x.intValue()+1];
        dp[1] = BigDecimal.ONE;
        for(int i=2;i<=x.intValue();i++) {
            dp[i] = new BigDecimal(i).multiply(dp[i-1]);
        }
        return dp[x.intValue()];
    }

    public static void main(String[] args) {
        System.out.println(getFactorial(new BigDecimal(60)));
    }
}
