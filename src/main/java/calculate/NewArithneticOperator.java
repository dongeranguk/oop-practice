package calculate;

public interface NewArithneticOperator {
    public boolean supports(String operator);

    public int calculate(PositiveNumber operand1, PositiveNumber operand2);
}
