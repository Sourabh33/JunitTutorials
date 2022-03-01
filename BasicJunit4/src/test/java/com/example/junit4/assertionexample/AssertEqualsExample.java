package com.example.junit4.assertionexample;

import org.junit.Assert;
import org.junit.Test;

public class AssertEqualsExample {

    @Test
    public void testEqualParameters() {
        // compare string
        Assert.assertEquals("test data", "test data");

        // compare integer
        Assert.assertEquals(123, 123);

        // compare double
        Assert.assertEquals(20.0, 20.0, 0.1);

        // compare long
        Assert.assertEquals(20L, 20L);
    }

    @Test
    public void testEqualParametersWithMessages() {
        // compare string
        Assert.assertEquals("Data should match", "test data", "test data");

        // compare integer
        Assert.assertEquals("Data should match", 123, 123);

        // compare double
        Assert.assertEquals("Data should match", 20.0, 20.0, 0.1);

        // compare long
        Assert.assertEquals("Data should match", 20L, 20L);
    }
}
