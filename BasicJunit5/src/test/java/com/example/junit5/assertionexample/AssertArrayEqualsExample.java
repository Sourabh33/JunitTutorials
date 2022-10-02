package com.example.junit5.assertionexample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class AssertArrayEqualsExample {

    /**
     * Assert.assertArrayEquals examples
     */
    @Test
    public void testArrayEqualParameters() {
        // compare string array
        Assertions.assertArrayEquals(new String[]{"test data", "new test"}, new String[]{"test data", "new test"});

        // compare integer array
        Assertions.assertArrayEquals(Arrays.asList(123, 456).toArray(), Arrays.asList(123, 456).toArray());

        // compare double array
        Assertions.assertArrayEquals(new double[]{20.0}, new double[]{20.0}, 0.1);

        // compare long array
        Assertions.assertArrayEquals(Collections.singletonList(20L).toArray(), Collections.singletonList(20L).toArray());
    }

    /**
     * Assert.assertArrayEquals examples with custom message
     */
    @Test
    public void testArrayEqualParametersWithMessages() {
        // compare string array
        Assertions.assertArrayEquals(new String[]{"test data"}, new String[]{"test data"}, "Array data should match");

        // supplier message
        Assertions.assertArrayEquals(new String[]{"test data"}, new String[]{"test data"}, () -> "Array data should match");

        // compare integer array
        Assertions.assertArrayEquals(Arrays.asList(123, 456).toArray(), Arrays.asList(123, 456).toArray(), "Array data should match");

        // compare double array
        Assertions.assertArrayEquals(new double[]{20.0}, new double[]{20.0}, 0.1, "Array data should match");

        // compare long array
        Assertions.assertArrayEquals(Collections.singletonList(20L).toArray(), Collections.singletonList(20L).toArray(), "Array data should match");
    }
}
