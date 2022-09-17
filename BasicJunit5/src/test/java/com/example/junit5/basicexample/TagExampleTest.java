package com.example.junit5.basicexample;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class TagExampleTest {

    @BeforeEach
    public void setUp() {
        System.out.println("-------Running set up method----------");
    }

    @Tag("DEV")
    @Test
    public void testTagAnnotation1() {
        System.out.println("-------This is a dev test---------");
    }

    @Tag("DEV")
    @Test
    public void testTagAnnotation2() {
        System.out.println("-------This is a dev test---------");
    }

    @Tag("PROD")
    @Test
    public void testTagAnnotation3() {
        System.out.println("-------This is a prod test---------");
    }

}
