package org.example;

import calculate.*;

import java.util.List;

public class Calculator {

    public static final List<NewArithneticOperator> arithneticOperators = List.of(new AddtionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());
    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {
       return arithneticOperators.stream()
               .filter(arithneticOperator -> arithneticOperator.supports(operator))
               .map(arithneticOperators -> arithneticOperators.calculate(operand1, operand2))
               .findFirst()
               .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));
    }
}
