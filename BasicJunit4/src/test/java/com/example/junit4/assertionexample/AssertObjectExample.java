package com.example.junit4.assertionexample;

import org.junit.Assert;
import org.junit.Test;

public class AssertObjectExample {

    /**
     * Assert.assertNull example
     */
    @Test
    public void testAssertNull() {
        String object = null;
        Assert.assertNull(object);
    }

    /**
     * Assert.assertNull example with custom message
     */
    @Test
    public void testAssertNullWithMessage() {
        String object = null;
        Assert.assertNull("Object is null", object);
    }

    /**
     * Assert.assertNotNull example
     */
    @Test
    public void testAssertNotNull() {
        String obj = "Hello junit test";
        Assert.assertNotNull(obj);
    }

    /**
     * Assert.assertNotNull example with custom message
     */
    @Test
    public void testAssertFalseWithMessage() {
        String obj = "Hello junit test";
        Assert.assertNotNull("Object should ot be null", obj);

    }

    /**
     * Assert.assertSame example
     *
     * Checking reference of str1 and str2 objects
     */
    @Test
    public void testSameAssertion() {
        String str1 = "abc";
        String str2 = "abc";
        Assert.assertSame(str1, str2);
    }

    /**
     * Assert.assertNotSame example
     * Checking reference of two objects
     */
    @Test
    public void testNotSameAssertion() {
        Object car = new Object();
        Object bike = new Object();
        Assert.assertNotSame(car, bike);
    }
}
