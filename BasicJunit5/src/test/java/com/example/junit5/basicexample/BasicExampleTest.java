package com.example.junit5.basicexample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicExampleTest {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("-------Running before class method----------");
    }

    @BeforeEach
    public void setUp() throws Exception {
        System.out.println("-------Running set up method----------");
    }

    @Test
    public void testExampleOne() {
        System.out.println("-------Running test One method----------");
    }

    @Test
    public void testExampleTwo() {
        System.out.println("-------Running test Two method----------");
    }

    @AfterEach
    public void tearDown() throws Exception {
        System.out.println("-------Running tear down method----------");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("-------Running after class method----------");
    }
}