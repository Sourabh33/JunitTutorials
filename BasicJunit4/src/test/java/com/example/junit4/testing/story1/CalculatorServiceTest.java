package com.example.junit4.testing.story1;

import com.example.junit4.story1.CalculatorService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorServiceTest {

    private CalculatorService service;

    @Before
    public void setUp() throws Exception {
        service = new CalculatorService();
    }

    @Test
    public void testAddFunctionality() {
        int result = service.addNumbers(-1, 2, -3);
        Assert.assertEquals(-2, result);
    }

    @Test
    public void testGetQuotientMethod() {
        Integer actualResult = service.getQuotient(30, 2);
        Assert.assertEquals(Integer.valueOf(15), actualResult);
    }

    // negative test case
    @Test(expected = ArithmeticException.class)
    public void testGetQuotientMethodForException() {
        service.getQuotient(30, 0);
    }

    @Test
    public void testGetRemainderMethod() {
        Integer actualResult = service.getRemainder(35, 2);
        Assert.assertEquals(Integer.valueOf(1), actualResult);
    }

    // negative test case
    @Test(expected = ArithmeticException.class)
    public void testGetRemainderMethodForException() {
        service.getRemainder(35, 0);
    }
}
