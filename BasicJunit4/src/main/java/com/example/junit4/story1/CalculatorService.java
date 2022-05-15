package com.example.junit4.story1;

public class CalculatorService {

    /**
     * Function to get summation of numbers
     * @param numbers take input of integer numbers
     * @return sum of numbers
     */
    public int addNumbers(int... numbers) {
        int sum = 0;
        for (int n : numbers) {
            sum += n;
        }
        return sum;
    }

    /**
     * Function to get quotient of two numbers
     * @param dividend The number that is to be divided
     * @param divisor The number by which we divide the dividend
     * @return The value/answer obtained after performing the division
     */
    public int getQuotient(int dividend, int divisor) {
        int quotient = 0;
        if(divisor == 0) {
            throw new ArithmeticException("divisor can't be zero for division");
        }
        quotient = dividend / divisor;
        return quotient;
    }

    /**
     * Function to get quotient of two numbers
     * @param dividend The number that is to be divided
     * @param divisor The number by which we divide the dividend
     * @return The remaining or left out value that is not a part of any group
     */
    public int getRemainder(int dividend, int divisor) {
        int remainder = 0;
        if(divisor == 0) {
            throw new ArithmeticException("divisor can't be zero for division");
        }
        remainder = dividend % divisor;
        return remainder;
    }
}
