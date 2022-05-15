package com.example.junit4.testing;

import com.example.junit4.BasicExample;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicExampleMeTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("inside setup method");
    }

    @Test
    public void testPrintMessageMethod() {
        String expectedMessage = "Hello World";
        BasicExample util = new BasicExample(expectedMessage);

        String actualMessage = util.printMessage();

        Assert.assertEquals("actual is not as expected message", expectedMessage, actualMessage);
    }
}
