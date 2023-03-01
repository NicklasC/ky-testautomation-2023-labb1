package com.example.kyAUTapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTests {


    private Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        Assertions.assertEquals(8, calculator.add(3, 5));
    }

    @Test
    void testSubtract() {
        Assertions.assertEquals(7, calculator.subtract(10, 3));
    }

    @Test
    void testMultiply() {
        Assertions.assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    void testDivide() {
        Assertions.assertEquals(5, calculator.divide(25, 5));
    }

    @Test
    void testDivideWithDecimals() {
        Assertions.assertEquals(3.5714285714285716, calculator.divide(25, 7));
    }

    @Test
    void testSquareRoot() {
        Assertions.assertEquals(2, calculator.squareRootOf(4));
    }

    @Test
    void testGetAreaAreaIsCorrect() {
        Assertions.assertEquals(78.54, calculator.getArea(5));
    }

    @Test
    void testGetAreaReturnNaNWithNegativeInput() {
        Assertions.assertEquals(Double.NaN, calculator.getArea(-3));
    }

    @Test
    void testCircumference() {
        Assertions.assertEquals(18.85, calculator.getCircumference(3));
    }

    @Test
    void testCircumferenceReturnNaNWithNegativeInput() {
        Assertions.assertEquals(Double.NaN, calculator.getCircumference(-1));
    }
}



