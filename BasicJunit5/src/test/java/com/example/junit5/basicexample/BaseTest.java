package com.example.junit5.basicexample;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface BaseTest {

    @BeforeAll
    default void beforeAll() {
        System.out.println("--- Before starting tests --- ");
    }

    @AfterAll
    default void afterAll() {
        System.out.println("--- After tests completed ---");
    }
}
