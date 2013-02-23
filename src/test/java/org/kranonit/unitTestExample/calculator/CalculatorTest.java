package org.kranonit.unitTestExample.calculator;

import junit.framework.Assert;
import org.junit.Test;

import java.io.IOException;

public class CalculatorTest {
    @Test public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(4, 2);
        Assert.assertEquals(6, result);
    }

    @Test public void testMinus() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(1, calculator.minus(3, 2));
    }

    @Test public void testDivide() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = Exception.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(3, 0);
    }
}
