package com.onelogin.code.challenge.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyFractionsTest {
    private MultiplyFractions multiplyFractions = new MultiplyFractions();

    @Test
    public void multiplyTest1() {
        String fraction1 = "1_1/2", fraction2 = "1";
        String result = multiplyFractions.multiply(fraction1, fraction2);
        assertEquals(result, "0_3/2");
    }

    @Test
    public void multiplyTest2() {
        String fraction1 = "2_1/2", fraction2 = "1/4";
        String result = multiplyFractions.multiply(fraction1, fraction2);
        assertEquals(result, "0_5/8");
    }

    @Test
    public void multiplyTest4() {
        String fraction1 = "1/2", fraction2 = "3_3/4";
        String result = multiplyFractions.multiply(fraction1, fraction2);
        assertEquals(result, "0_15/8");
    }

    @Test
    public void multiplyTest5() {
        String fraction1 = "2", fraction2 = "3";
        String result = multiplyFractions.multiply(fraction1, fraction2);
        assertEquals(result, "0_6/1");
    }


}