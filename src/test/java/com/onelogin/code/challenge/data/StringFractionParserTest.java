package com.onelogin.code.challenge.data;

import org.junit.Test;

import static com.onelogin.code.challenge.data.StringFractionParser.*;
import static org.junit.Assert.assertEquals;

public class StringFractionParserTest {

    @Test
    public void parseFractionTest() {
        String x = "1_3/8";
        Fraction y = parseFraction(x);
        assertEquals(y.getNumeratorPart(), 11);
        assertEquals(y.getDenominatorPart(), 8);
        assertEquals(y.getWholePart(), 0);
    }

    @Test
    public void parseFractionTest2() {
        String x = "3";
        Fraction y = parseFraction(x);
        assertEquals(y.getNumeratorPart(), 3);
        assertEquals(y.getDenominatorPart(), 1);
        assertEquals(y.getWholePart(), 0);
    }

    @Test
    public void greatestCommonFactorTest() {
        long gcf = greatestCommonFactor(7, 8);
        assertEquals(gcf, 1);
    }

    @Test
    public void fractionTest() {
        String fraction = fraction(7, 8);
        assertEquals(fraction, "7/8");
    }

    @Test
    public void formatFractionTest() {
        Fraction f = new Fraction(0, 200, 100);
        String formattedFraction = formatFraction(f);
        assertEquals(formattedFraction, "2");
    }

    @Test
    public void formatFractionTest2() {
        Fraction f = new Fraction(0, 15, 8);
        String formattedFraction = formatFraction(f);
        assertEquals(formattedFraction, "1_7/8");
    }

}