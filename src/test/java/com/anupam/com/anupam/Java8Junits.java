package com.anupam.com.anupam;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Junits {

    @Test
    public void testPredict() {
        Predicate<String> isEmptyString = (string) -> StringUtils.isEmpty(string);
        List<String> list = Arrays.asList("Test", "", "One", "");
        Assert.assertEquals(2, list.stream().filter(isEmptyString).collect(Collectors.toList()).size());
    }
}
