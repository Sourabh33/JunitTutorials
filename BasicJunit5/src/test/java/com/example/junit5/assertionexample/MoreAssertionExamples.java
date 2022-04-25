package com.example.junit5.assertionexample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



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
            Assertions.fail("Exception must be thrown");
        } catch (Exception ex) {
            Assertions.fail("Exception raised");
        }

    }




}
