package com.example.junit4.assertionexample;

import org.junit.Assert;
import org.junit.Test;

public class AssertObjectExample {

    @Test
    public void testAssertNull() {
        String object = null;
        Assert.assertNull(object);
    }

    @Test
    public void testAssertNullWithMessage() {
        String object = null;
        Assert.assertNull("Object is null", object);
    }

    @Test
    public void testAssertNotNull() {
        String obj = "Hello junit test";
        Assert.assertNotNull(obj);
    }

    @Test
    public void testAssertFalseWithMessage() {
        String obj = "Hello junit test";
        Assert.assertNotNull("Object should ot be null", obj);

    }
}
