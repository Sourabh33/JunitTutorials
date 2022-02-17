package com.example.junit4.basicexample;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IgnoreMethodTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("----------Running set up method-----------");
    }

    @Ignore("Ignoring this method")
    @Test
    public void testExample() {
        System.out.println("-------Running test method----------");
    }

    @Test
    public void testExampleTwo() {
        System.out.println("-------Running test two method----------");
    }
}
