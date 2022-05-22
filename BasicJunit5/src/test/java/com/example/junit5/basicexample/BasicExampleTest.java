package com.example.junit5.basicexample;

import org.junit.jupiter.api.*;

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

    @Disabled(value = "This test is a disabled test")
    @Test
    public void testDisableAnnotation() {
        System.out.println("-------This line does not print---------");
    }

    @DisplayName("This test is a display tag test")
    @Test
    public void testDisplayAnnotation() {
        System.out.println("-------This is a display name test---------");
    }

    @Tag("DEV")
    @Test
    public void testTagAnnotation1() {
        System.out.println("-------This is a dev test---------");
    }

    @Tag("PROD")
    @Test
    public void testTagAnnotation2() {
        System.out.println("-------This is a prod test---------");
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