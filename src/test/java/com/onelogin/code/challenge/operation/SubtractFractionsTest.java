package com.onelogin.code.challenge.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractFractionsTest {
    private SubtractFractions subtractFractions = new SubtractFractions();

    @Test
    public void subtractTest1() {
        String fraction1 = "1_1/2", fraction2 = "1";
        String result = subtractFractions.subtract(fraction1, fraction2);
        assertEquals(result, "0_1/2");
    }

    @Test
    public void subtractTest2() {
        String fraction1 = "1/2", fraction2 = "1/2";
        String result = subtractFractions.subtract(fraction1, fraction2);
        assertEquals(result, "0_0/4");
    }

    @Test
    public void subtractTest3() {
        String fraction1 = "1", fraction2 = "1";
        String result = subtractFractions.subtract(fraction1, fraction2);
        assertEquals(result, "0_0/1");
    }

}