package com.onelogin.code.challenge.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivideFractionsTest {
    private DivideFractions divideFractions = new DivideFractions();

    @Test
    public void divideTest1() {
        String fraction1 = "1_1/2", fraction2 = "1";
        String result = divideFractions.divide(fraction1, fraction2);
        assertEquals(result, "0_3/2");
    }

    @Test
    public void divideTest2() {
        String fraction1 = "1_1/2", fraction2 = "0";
        String result = divideFractions.divide(fraction1, fraction2);
        assertEquals(result, "Division by 0 not allowed");
    }

    @Test
    public void divideTest3() {
        String fraction1 = "1_1/2", fraction2 = "0/1";
        String result = divideFractions.divide(fraction1, fraction2);
        assertEquals(result, "Division by 0 not allowed");
    }

    @Test
    public void divideTest4() {
        String fraction1 = "1_1/2", fraction2 = "10/0";
        String result = divideFractions.divide(fraction1, fraction2);
        assertEquals(result, "Division by 0 not allowed");
    }

}