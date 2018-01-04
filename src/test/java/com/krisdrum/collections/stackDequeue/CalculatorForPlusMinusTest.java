package com.krisdrum.collections.stackDequeue;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorForPlusMinusTest {
    private CalculatorForPlusMinus calculator = new CalculatorForPlusMinus();

    @Test
    public void shouldEvaluateConstants() {
        int result = calculator.evaluate("1");
        assertEquals(1, result);
    }

    @Test
    public void shouldSupportAdding() {
        int result = calculator.evaluate("1 + 2");
    }

    @Test
    public void shouldSupportSubtraction() {
        int result = calculator.evaluate("1 - 2");
        assertEquals(-1, result);
    }

    @Test
    public void shouldSupportComplexStatements() {
        int result = calculator.evaluate("1 - 3 + 2 + 4");
        assertEquals(4, result);
    }
}
