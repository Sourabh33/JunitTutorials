package com.example.junit5.basicexample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class ParameterizedExampleTest {

    /**
     * This test will run 4 times
     */
    @ParameterizedTest(name = "Parameterized test example.")
    @ValueSource(ints = {1, 2, 3, 4})
    public void testParameters(int number) {
        System.out.println("Number: " + number);
    }
}
