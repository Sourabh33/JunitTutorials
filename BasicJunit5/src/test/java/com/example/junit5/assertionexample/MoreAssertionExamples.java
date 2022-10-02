package com.example.junit5.assertionexample;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static java.time.Duration.ofSeconds;
import static java.util.Arrays.asList;


public class MoreAssertionExamples {

    @DisplayName("Assert All example")
    @Test
    public void assertAllExample() {
        Object object = null;
        Assertions.assertAll("test heading",
                () -> Assertions.assertEquals(4, 2 + 2, "two plus two is four"),
                () -> Assertions.assertEquals("HELLO", "hello".toUpperCase()),
                () -> Assertions.assertNull(object, () -> "object should be null"));
    }

    @DisplayName("Assert Iterable equals example")
    @Test
    public void assertIterableEqualExample() {
        Iterable<String> al = new ArrayList<>(asList("Hello", "Junit", "Test"));
        Iterable<String> ll = new LinkedList<>(asList("Hello", "Junit", "Test"));

        Assertions.assertIterableEquals(al, ll);
    }

    @DisplayName("Assert Lines match example")
    @Test
    public void assertLinesMatchExample() {
        List<String> expected = asList("Junit", "\\d+", "Tutorials");
        List<String> actual = asList("Junit", "5", "Tutorials");

        Assertions.assertLinesMatch(expected, actual);
    }

    @Test
    public void assertThrowExample() {
        Throwable exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Exception message");
                }
        );
        Assertions.assertEquals("Exception message", exception.getMessage());
    }


    @Test
    public void assertTimeOutExample() {
        Assertions.assertTimeout(Duration.ofSeconds(2),
                () -> {
                    // some code which should take less than 2 minutes to execute
                    Thread.sleep(4000);
                },
                "this test will be fail after all code completes, as it does not completes in 2 seconds"
        );
    }

    @Test
    public void assertTimeOutPreEmptivelyExample() {
        Assertions.assertTimeoutPreemptively(ofSeconds(2),
                () -> {
                    // some code which should take less than 2 minutes to execute
                    Thread.sleep(4000);
                },
                "this test will fail immediately after 2 seconds before all code completes"
        );
    }

}
