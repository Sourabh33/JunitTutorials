package com.example.junit4.assertionexample;

import org.junit.Assert;
import org.junit.Test;

public class AssertBooleanExample {

    /**
     * Assert.assertTrue example
     *
     */
    @Test
    public void testAssertTrue() {
        Assert.assertTrue(2 > 0);
    }

    /**
     * Assert.assertTrue example with custom message
     *
     */
    @Test
    public void testAssertTrueWithMessage() {
        Assert.assertTrue("Condition should be true", 2 > 0);
    }

    /**
     * Assert.assertFalse example
     *
     */
    @Test
    public void testAssertFalse() {
        Assert.assertFalse(2 == 0);
    }

    /**
     * Assert.assertFalse example with custom message
     *
     */
    @Test
    public void testAssertFalseWithMessage() {
        Assert.assertFalse("Condition should be true", 2 == 0);
    }
}
