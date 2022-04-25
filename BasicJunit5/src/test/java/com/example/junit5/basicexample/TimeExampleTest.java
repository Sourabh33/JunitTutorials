package com.example.junit5.basicexample;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TimeExampleTest {

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("--------------running set up method--------------");
    }

    @Test
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
