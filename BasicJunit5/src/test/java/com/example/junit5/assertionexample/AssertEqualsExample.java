package com.example.junit5.assertionexample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertEqualsExample {

    /**
     * Assert.assertEquals examples
     * <p>
     * actualData: Data return by calling the function on which we are doing test
     * expectedData: Data which we expect should be return by the function on which we are doing test
     */
    @Test
    public void testEqualParameters() {
        // compare string
        // String actualData = null;
        // String actualData = "";
        String actualData = "test data";

        String expectedData = "test data";
        Assertions.assertEquals(expectedData, actualData);

        // compare integer
        Assertions.assertEquals(123, 123);

        // compare double
        Assertions.assertEquals(20.0, 20.0, 0.1);

        // compare long
        Assertions.assertEquals(20L, 20L);
    }

    /**
     * Assert.assertEquals examples with custom message
     */
    @Test
    public void testEqualParametersWithMessages() {
        // compare string
        // Assert.assertEquals("Data should match", null, "test data");
        Assertions.assertEquals("test data", "test data", "Data should match");

        // supplier example
        Assertions.assertEquals("test data", "test data", () -> "Data should match");

        // compare integer
        Assertions.assertEquals(123, 123, "Data should match");

        // compare double
        Assertions.assertEquals(20.0, 20.0, 0.1, "Data should match");

        // compare long
        Assertions.assertEquals(20L, 20L, "Data should match");
    }
}
