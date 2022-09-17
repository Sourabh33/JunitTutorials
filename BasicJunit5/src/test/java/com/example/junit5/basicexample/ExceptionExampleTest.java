package com.example.junit5.basicexample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExceptionExampleTest {

    @BeforeEach
    public void setUp() {
        System.out.println("--------------running set up method--------------");
    }

    @Test
    public void testExample() {
        Throwable exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            System.out.println("this method will throw error");
            throw new IllegalArgumentException("This is an illegal argument");
        });

        System.out.println(exception.getMessage());
    }
}
