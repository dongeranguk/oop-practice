package org.example;

import java.util.Arrays;

public enum ArithneticOperator {
    ADDITION("+") {
        @Override
        public int arithneticCalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, SUBTRACTION("-") {
        @Override
        public int arithneticCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int arithneticCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public int arithneticCalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithneticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int arithneticCalculate(int operand1, int operand2);

    public static int calculate(int operand1, String operator, int operand2) {
        ArithneticOperator arithhneticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        return arithhneticOperator.arithneticCalculate(operand1, operand2);
    }
}
