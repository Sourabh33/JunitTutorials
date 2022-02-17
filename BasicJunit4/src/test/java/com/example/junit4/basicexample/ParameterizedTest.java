package com.example.junit4.basicexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;


@RunWith(Parameterized.class)
public class ParameterizedTest {

    private final Integer counter;

    public ParameterizedTest(Integer counter) {
        this.counter = counter;
    }

    @Parameterized.Parameters
    public static List<Integer> counterIncrementer() {
        return Arrays.asList(1, 2, 3, 4, 5);
    }

    /**
     * This test will run 5 times
     */
    @Test
    public void parameterExample() {
        System.out.println("counter value: " + counter);
    }
}
