package com.example.junit5.assertionexample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertObjectExample {

    /**
     * Assert.assertNull example
     */
    @Test
    public void testAssertNull() {
        String object = null;
        Assertions.assertNull(object);
    }

    /**
     * Assert.assertNull example with custom message
     */
    @Test
    public void testAssertNullWithMessage() {
        String object = null;
        Assertions.assertNull(object, "Object should be null");

        Assertions.assertNull(object, () -> "Object should be null");
    }

    /**
     * Assert.assertNotNull example
     */
    @Test
    public void testAssertNotNull() {
        String obj = "Hello junit test";
        Assertions.assertNotNull(obj);
    }

    /**
     * Assert.assertNotNull example with custom message
     */
    @Test
    public void testAssertFalseWithMessage() {
        String obj = "Hello junit test";
        Assertions.assertNotNull(obj, "Object should not be null");
    }

    /**
     * Assert.assertSame example
     * <p>
     * Checking reference of str1 and str2 objects
     */
    @Test
    public void testSameAssertion() {
        String str1 = "abc";
        String str2 = "abc";
        Assertions.assertSame(str1, str2);
    }

    /**
     * Assert.assertNotSame example
     * Checking reference of two objects
     */
    @Test
    public void testNotSameAssertion() {
        Object car = new Object();
        Object bike = new Object();
        Assertions.assertNotSame(car, bike);
    }
}
