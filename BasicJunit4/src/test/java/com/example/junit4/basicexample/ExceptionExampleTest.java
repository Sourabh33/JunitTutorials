package com.example.junit4.basicexample;

import org.junit.Before;
import org.junit.Test;

public class ExceptionExampleTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("--------------running set up method--------------");
    }

    @Test(expected = Exception.class)
    public void testExample() throws Exception {
        System.out.println("--------------running test method--------------");
        throw new Exception("Exception thrown");
    }
}
