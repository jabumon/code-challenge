package com.onelogin.code.challenge.operation;

import static com.onelogin.code.challenge.data.StringFractionParser.formatFraction;
import static com.onelogin.code.challenge.data.StringFractionParser.parseFraction;

public class Handler {
    private AddFractions addFractions = new AddFractions();
    private DivideFractions divideFractions = new DivideFractions();
    private MultiplyFractions multiplyFractions = new MultiplyFractions();
    private SubtractFractions subtractFractions = new SubtractFractions();

    public String handleOperation(String operation, String fraction1, String fraction2) {
        String result;
        switch (operation) {
            case "/":
                result = divideFractions.divide(fraction1, fraction2);
                if (!result.contains("_") || !result.contains("/")) return result;
                break;
            case "x":
                result = multiplyFractions.multiply(fraction1, fraction2);
                break;
            case "+":
                result = addFractions.add(fraction1, fraction2);
                break;
            case "-":
                result = subtractFractions.subtract(fraction1, fraction2);
                break;
            default:
                return "Invalid operator";
        }

        return formatFraction(parseFraction(result));
    }
}
