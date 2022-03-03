package com.onelogin.code.challenge.operation;


import com.onelogin.code.challenge.data.Fraction;

import static com.onelogin.code.challenge.data.StringFractionParser.parseFraction;

/**
 * Add two fractions class:
 * i.e. 2_3/8 + 9/8 resulting in 3_1/2
 **/
public class AddFractions {

    public static void main(String[] args) {
        String op1 = "1/2", op2 = "3_3/4";
        AddFractions add = new AddFractions();
        System.out.println(add.add(op1, op2));
    }

    public String add(String operator1, String operator2) {

        Fraction fraction1 = parseFraction(operator1),
                fraction2 = parseFraction(operator2);

        Fraction result = new Fraction(0,
                fraction1.getNumeratorPart() * fraction2.getDenominatorPart()
                        + fraction1.getDenominatorPart() * fraction2.getNumeratorPart(),
                fraction1.getDenominatorPart() * fraction2.getDenominatorPart()
        );

        return new StringBuilder().append(result.getWholePart()).append("_")
                .append(result.getNumeratorPart()).append("/")
                .append(result.getDenominatorPart())
                .toString();
    }

}
