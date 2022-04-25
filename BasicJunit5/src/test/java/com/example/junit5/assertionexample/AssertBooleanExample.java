package com.example.junit5.assertionexample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertBooleanExample {

    /**
     * Assert.assertTrue example
     */
    @Test
    public void testAssertTrue() {
        Assertions.assertTrue(2 > 0);
    }

    /**
     * Assert.assertTrue example with custom message
     */
    @Test
    public void testAssertTrueWithMessage() {
        Assertions.assertTrue(2 > 0, "Condition should be true");
    }

    /**
     * Assert.assertFalse example
     */
    @Test
    public void testAssertFalse() {
        Assertions.assertFalse(2 == 0);
    }

    /**
     * Assert.assertFalse example with custom message
     */
    @Test
    public void testAssertFalseWithMessage() {
        Assertions.assertFalse(2 == 0, "Condition should be true");
    }
}
