package com.example.junit5.basicexample;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DynamicTestExample {

    @TestFactory
    public List<String> dynamicTestWithInvalidReturnType() {
        System.out.println("Returning Invalid type will give Junit exception");
        return Arrays.asList("Hello Test");
    }

    @TestFactory
    public Collection<DynamicTest> dynamicTestWithCollectionReturnType() {
        System.out.println("Returning Collection of objects");
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2)))
        );
    }

    @TestFactory
    public Iterable<DynamicTest> dynamicTestWithIterableReturnType() {
        System.out.println("Returning Iterable of objects");
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2)))
        );
    }

    @TestFactory
    public Iterator<DynamicTest> dynamicTestWithIteratorReturnType() {
        System.out.println("Returning Iterator of objects");
        return Arrays.asList(
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2)))
        ).iterator();
    }

    @TestFactory
    public Stream<DynamicTest> dynamicTestWithStreamReturnType() {
        System.out.println("Returning Stream of objects");
        return IntStream.iterate(0, n -> n + 2).limit(10)
                .mapToObj(n -> DynamicTest.dynamicTest("test" + n,
                        () -> assertEquals(0, n % 2)));
    }

    @TestFactory
    DynamicTest[] dynamicTestsFromArray() {
        System.out.println("Returning Arrays of objects");
        return new DynamicTest[]{
                DynamicTest.dynamicTest("Add test",
                        () -> assertEquals(2, Math.addExact(1, 1))),
                DynamicTest.dynamicTest("Multiply Test",
                        () -> assertEquals(4, Math.multiplyExact(2, 2)))
        };
    }
}
