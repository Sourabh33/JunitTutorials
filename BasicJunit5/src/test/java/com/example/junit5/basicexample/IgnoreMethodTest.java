package com.example.junit5.basicexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class IgnoreMethodTest {

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("----------Running set up method-----------");
    }

    @Disabled("Ignoring this method")
    @Test
    public void testExample() {
        System.out.println("-------Running test method----------");
    }

    @Test
    public void testExampleTwo() {
        System.out.println("-------Running test two method----------");
    }
}
