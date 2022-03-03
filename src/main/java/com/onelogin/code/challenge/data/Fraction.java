package com.onelogin.code.challenge.data;

/**
 * Object representing a fraction composed by " WHOLE_NUMERATOR/DENOMINATOR "
 **/
public class Fraction {
    private int wholePart;
    private int numeratorPart;
    private int denominatorPart;

    public Fraction(int wholePart, int numeratorPart, int denominatorPart) {
        this.wholePart = wholePart;
        this.numeratorPart = numeratorPart;
        this.denominatorPart = denominatorPart;
    }

    public int getWholePart() {
        return wholePart;
    }

    public int getNumeratorPart() {
        return numeratorPart;
    }

    public int getDenominatorPart() {
        return denominatorPart;
    }

}
