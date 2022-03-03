package com.onelogin.code.challenge.data;

/**
 * Utility class to parse a string to the object <code>Fraction</code>
 **/
public class StringFractionParser {
    /**
     * String to Fraction parse
     **/
    public static Fraction parseFraction(String fraction) {
        int whole = 0, numerator, denominator = 0;
        if (fraction.contains("_")) whole = Integer.parseInt(fraction.trim().substring(0, fraction.indexOf("_")));
        if (fraction.indexOf("/") != -1) {
            numerator = Integer.parseInt(fraction.trim().substring(fraction.indexOf("_") + 1, fraction.indexOf("/")));
            denominator = Integer.parseInt(fraction.trim().substring(fraction.indexOf("/") + 1));
        } else {
            numerator = Integer.parseInt(fraction);
            if (numerator != 0) denominator = 1;
        }

        return simplify(new Fraction(whole, numerator, denominator));
    }

    /**
     * Transform whole part to fraction
     **/
    public static Fraction simplify(Fraction fraction) {
        return new Fraction(0,
                (fraction.getWholePart() * fraction.getDenominatorPart()) + fraction.getNumeratorPart(),
                fraction.getDenominatorPart());
    }

    /**
     * Greatest common factor function
     **/
    public static long greatestCommonFactor(long a, long b) {
        if (b == 0) return a;
        return greatestCommonFactor(b, a % b);
    }

    /**
     * Calculates greatest common factor then formats fraction part
     **/
    public static String fraction(long numerator, long denominator) {
        long greatestCommonFactor = greatestCommonFactor(numerator, denominator);
        if (greatestCommonFactor == 0) return "0";
        return (numerator / greatestCommonFactor) + "/" + (denominator / greatestCommonFactor);
    }

    /**
     * Operations (+ - * /) are processed using fractions only,
     * once evaluated we need to format them back to
     * whole_numerator/denominator
     **/
    public static String formatFraction(Fraction fraction) {
        int whole = fraction.getDenominatorPart() == 0 ? 0 : fraction.getNumeratorPart() / fraction.getDenominatorPart();
        String fractionPart = fraction(fraction.getNumeratorPart() - (whole * fraction.getDenominatorPart()), fraction.getDenominatorPart());
        String formattedFraction;
        // if there's no whole part or not fraction part (0/n) remove them
        if (whole != 0)
            if (fractionPart.startsWith("0")) formattedFraction = whole + "";
            else formattedFraction = whole + "_" + fractionPart;
        else if (fractionPart.startsWith("0")) formattedFraction = "0";
        else formattedFraction = fractionPart;
        return formattedFraction;
    }

}
