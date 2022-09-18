package com.example.junit5.basicexample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BasicExampleTest {

    @BeforeAll
    public static void beforeClass() {
        System.out.println("-------Running before class method----------");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("-------Running set up method----------");
    }

    @Test
    public void basicExampleTest() {
        System.out.println("-------Running test One method----------");
    }

    @DisplayName("This test is a display tag test")
    @Test
    public void testDisplayAnnotation() {
        System.out.println("-------This is a display name test---------");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("-------Running tear down method----------");
    }

    @AfterAll
    public static void afterClass() {
        System.out.println("-------Running after class method----------");
    }
}