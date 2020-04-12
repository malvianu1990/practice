package com.anupam.com.anupam;

import java.util.concurrent.CountDownLatch;

public class OddThread implements Runnable {
    private final CountDownLatch countDownLatch;
    private static volatile int oddCounter;

    public OddThread(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        int oddCounter = 1;
        while(countDownLatch.getCount() != 0 ) {
            if(countDownLatch.getCount()%2 != 0) {
                System.out.println(oddCounter);
                oddCounter = oddCounter + 2;
                countDownLatch.countDown();
            } else {
                try {
                    countDownLatch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
