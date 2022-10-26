package com.programmers;

import com.programmers.controller.StringCalculator;
import com.programmers.domain.CalculatorResult;
import com.programmers.domain.Result;

public class JavaCalculator {
    public static void main(String[] args) {
        Result calculatorResult = new CalculatorResult();
        StringCalculator stringCalculator = new StringCalculator(calculatorResult);
        stringCalculator.play();
    }
}
