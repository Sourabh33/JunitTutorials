package com.example.junit4.basicexample;

import org.junit.*;

public class BasicExampleTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("-------Running before class method----------");
    }

    @Before
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

    @After
    public void tearDown() throws Exception {
        System.out.println("-------Running tear down method----------");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("-------Running after class method----------");
    }
}