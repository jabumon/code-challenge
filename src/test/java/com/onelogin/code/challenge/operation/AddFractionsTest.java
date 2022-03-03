package com.onelogin.code.challenge.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {

    private AddFractions addFractions = new AddFractions();

    @Test
    public void addTest1() {
        String fraction1 = "1/2", fraction2 = "3_3/4";
        String result = addFractions.add(fraction1, fraction2);
        assertEquals(result, "0_34/8");
    }

    @Test
    public void addTest2() {
        String fraction1 = "1/2", fraction2 = "1/2";
        String result = addFractions.add(fraction1, fraction2);
        assertEquals(result, "0_4/4");
    }

}