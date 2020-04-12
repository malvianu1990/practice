package com.anupam.com.anupam;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BitonicTest {

    @Test
    public void getBitonicPoint() {
        int [] arr = {1, 2, 7, 4, 3};

        Assert.assertEquals(7, Bitonic.getBitonicPoint(arr).get().intValue());
    }

    @Test
    public void testSumPair() {
        int arr[] = {1,  5,  7, 1};
        Assert.assertEquals(2,FindSumPairs.findSumPairs(arr, 6));
        int arr1[] = {1, 1, 1, 1};
        Assert.assertEquals(6,FindSumPairs.findSumPairs(arr1, 2));
    }

    @Test
    public void testFindFirstRepeatedCharacter() {
        Assert.assertEquals('l', FindFirstRepeatedCharacter.findFirstRepeatedCharacter("hello"));
        Assert.assertEquals(' ', FindFirstRepeatedCharacter.findFirstRepeatedCharacter("fg"));
        Assert.assertEquals('g', FindFirstRepeatedCharacter.findFirstRepeatedCharacter("geeksforgeeks"));
    }

    @Test
    public void testSecondMostRepeatedString() {
        SecondMostRepeatedString secondMostRepeatedString = new SecondMostRepeatedString();
        Assert.assertEquals("bbb", secondMostRepeatedString.apply("aaa bbb ccc bbb aaa  aaa"));
        Assert.assertEquals("for", secondMostRepeatedString.apply("geeks for geeks for geeks aaa"));
    }

    @Test
    public void test2DArray() {
        String [][] arr = {{"jerry","65"},{"bob","91"}, {"jerry","23"}, {"Eric","83"}};
        Map<String,Student> studentsMap = new HashMap<>();
        for(int i=0;i<4;i++) {

        }

    }
 }
