package com.example.junit4.assertionexample;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;

public class MoreAssertionExamples {

    @Test
    public void testFailAssertion() {
        Assert.fail();
    }

    @Test
    public void testFailAssertionWithMessage() {
        Assert.fail("Test Failed");
    }

    @Test
    public void testSameAssertion() {
        Assert.assertSame("Hello World", "Hello World");
    }

    @Test
    public void testNotSameAssertion() {
        Assert.assertNotSame("Hello World", "Hello Junit");
    }

    @Test
    public void testAssertThat() {
        Assert.assertThat(Arrays.asList("One", "two", "three"), hasItem("One"));
    }


}
