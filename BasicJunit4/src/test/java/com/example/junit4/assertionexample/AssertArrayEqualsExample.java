package com.example.junit4.assertionexample;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class AssertArrayEqualsExample {

    /**
     * Assert.assertArrayEquals examples
     */
    @Test
    public void testArrayEqualParameters() {
        // compare string array
        Assert.assertArrayEquals(new String[]{"test data", "new test"}, new String[]{"test data", "new test"});

        // compare integer array
        Assert.assertArrayEquals(Arrays.asList(123, 456).toArray(), Arrays.asList(123, 456).toArray());

        // compare double array
        Assert.assertArrayEquals(new double[]{20.0}, new double[]{20.0}, 0.1);

        // compare long array
        Assert.assertArrayEquals(Collections.singletonList(20L).toArray(), Collections.singletonList(20L).toArray());
    }

    /**
     * Assert.assertArrayEquals examples with custom message
     */
    @Test
    public void testArrayEqualParametersWithMessages() {
        // compare string array
        Assert.assertArrayEquals("Array data should match", new String[]{"test data"}, new String[]{"test data"});

        // compare integer array
        Assert.assertArrayEquals("Array data should match", Arrays.asList(123, 456).toArray(), Arrays.asList(123, 456).toArray());

        // compare double array
        Assert.assertArrayEquals("Array data should match", new double[]{20.0}, new double[]{20.0}, 0.1);

        // compare long array
        Assert.assertArrayEquals("Array data should match", Collections.singletonList(20L).toArray(), Collections.singletonList(20L).toArray());
    }
}
