package com.example.junit4.assertionexample;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;

public class MoreAssertionExamples {

    public void methodsShouldThrowException() throws Exception {
        // some codes
        // uncomment below line for throwing exception by this method
//        throw new Exception();
    }

    /**
     * Assert.fail example
     */
    @Test
    public void testFailAssertionWithMessage() {
        try {
            methodsShouldThrowException();
            Assert.fail("Exception must be thrown");
        } catch (Exception ex) {
            Assert.fail("Exception raised");
        }

    }

    /**
     * Assert.assertThat example
     *
     * hasItem needs hamcrest-all library (check in pom.xml file)
     */
    @Test
    public void testAssertThat() {
        Assert.assertThat(Arrays.asList("One", "two", "three"), hasItem("four"));
    }


}
