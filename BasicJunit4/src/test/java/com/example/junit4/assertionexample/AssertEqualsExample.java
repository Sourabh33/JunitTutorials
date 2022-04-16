package com.example.junit4.assertionexample;

import org.junit.Assert;
import org.junit.Test;

public class AssertEqualsExample {

    /**
     * Assert.assertEquals examples
     *
     * actualData: Data return by calling the function on which we are doing test
     * expectedData: Data which we expect should be return by the function on which we are doing test
     */
    @Test
    public void testEqualParameters() {
        // compare string
//        String actualData = null;
//        String actualData = "";
        String actualData = "test data";;
        String expectedData = "test data";
        Assert.assertEquals(expectedData, actualData);

        // compare integer
        Assert.assertEquals(123, 123);

        // compare double
        Assert.assertEquals(20.0, 20.0, 0.1);

        // compare long
        Assert.assertEquals(20L, 20L);
    }

    /**
     * Assert.assertEquals examples with custom message
     */
    @Test
    public void testEqualParametersWithMessages() {
        // compare string
//        Assert.assertEquals("Data should match", null, "test data");
        Assert.assertEquals("Data should match", "test data", "test data");

        // compare integer
        Assert.assertEquals("Data should match", 123, 123);

        // compare double
        Assert.assertEquals("Data should match", 20.0, 20.0, 0.1);

        // compare long
        Assert.assertEquals("Data should match", 20L, 20L);
    }
}
