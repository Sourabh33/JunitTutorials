package com.example.junit5.basicexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class TestInstanceMethod {

    private int data = 3;

    @Test
    void testAddMethod() {
        data = Math.addExact(data, 3);
        System.out.println("testAddMethod(5,5) => " + data);
        assertEquals(6, data);
    }

    @Test
    void testMultiplyMethod() {
        data = Math.multiplyExact(data, 3);
        System.out.println("testMultiplyMethod(5,5) => " + data);
        assertEquals(9, data);
    }

    @Test
    void testDivideMethod() {
        data = data / 3;
        System.out.println("testDivideMethod(5,5) => " + data);
        assertEquals(1, data);
    }
}
