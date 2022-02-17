package com.example.junit4.basicexample;

import org.junit.Before;
import org.junit.Test;

public class TimeExampleTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("--------------running set up method--------------");
    }

    @Test(timeout = 1000)
    public void testExample() throws InterruptedException {
        System.out.println("--------------running test method--------------");
        System.out.println("failing test after 1000 ms");
        Thread.sleep(2000);
    }

    @Test
    public void testExampleTwo() {
        System.out.println("--------------running test two method--------------");
    }
}
