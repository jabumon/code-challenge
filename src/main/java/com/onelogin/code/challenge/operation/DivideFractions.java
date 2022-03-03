package com.onelogin.code.challenge.operation;

import com.onelogin.code.challenge.data.Fraction;

import static com.onelogin.code.challenge.data.StringFractionParser.parseFraction;

public class DivideFractions {

    public String divide(String operator1, String operator2) {

        Fraction fraction1 = parseFraction(operator1),
                fraction2 = parseFraction(operator2);

        if (fraction2.getDenominatorPart() == 0 || fraction2.getNumeratorPart() == 0)
            return "Division by 0 not allowed";

        Fraction result = new Fraction(0,
                fraction1.getNumeratorPart() * fraction2.getDenominatorPart(),
                fraction1.getDenominatorPart() * fraction2.getNumeratorPart()
        );

        return new StringBuilder().append(result.getWholePart()).append("_")
                .append(result.getNumeratorPart()).append("/")
                .append(result.getDenominatorPart())
                .toString();
    }

}
