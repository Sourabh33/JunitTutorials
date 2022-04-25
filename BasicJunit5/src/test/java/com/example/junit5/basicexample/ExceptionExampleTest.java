package com.example.junit5.basicexample;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionExampleTest {

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("--------------running set up method--------------");
    }

    @Test
    public void testExample() {
        System.out.println("--------------running test method--------------");

    }
}
