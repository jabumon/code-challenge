package com.onelogin.code.challenge.operation;

import com.onelogin.code.challenge.data.Fraction;

import static com.onelogin.code.challenge.data.StringFractionParser.parseFraction;

public class SubtractFractions {

    public String subtract(String operator1, String operator2) {

        Fraction fraction1 = parseFraction(operator1),
                fraction2 = parseFraction(operator2);


        Fraction result = new Fraction(0,
                fraction1.getNumeratorPart() * fraction2.getDenominatorPart()
                        - fraction1.getDenominatorPart() * fraction2.getNumeratorPart(),
                fraction1.getDenominatorPart() * fraction2.getDenominatorPart()
        );

        return new StringBuilder().append(result.getWholePart()).append("_")
                .append(result.getNumeratorPart()).append("/")
                .append(result.getDenominatorPart())
                .toString();
    }

}
