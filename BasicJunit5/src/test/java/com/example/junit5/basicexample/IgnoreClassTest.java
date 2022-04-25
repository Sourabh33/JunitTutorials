package com.example.junit5.basicexample;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled("Ignoring all test of this class")
public class IgnoreClassTest {

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("-------Running set up method----------");
    }

    @Test
    public void testExample() {
        System.out.println("-------Running test method----------");
    }

    @Test
    public void testExampleTwo() {
        System.out.println("-------Running test two method----------");
    }
}
