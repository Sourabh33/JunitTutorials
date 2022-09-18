package com.example.junit5.basicexample;

import org.junit.jupiter.api.Test;

public class TestImpl implements BaseTest{
    @Test
    void testExample() {
        System.out.println("test method");
    }
}
