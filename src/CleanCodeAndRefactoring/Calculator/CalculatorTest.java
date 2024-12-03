package CleanCodeAndRefactoring.Calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
//    @Test
//    public void testAddition() {
//        int firstOperand = 3;
//        int secondOperand = 5;
//        char operator = '+';
//        int expected = 8;
//        int result = Calculator.calculate(firstOperand, secondOperand, operator);
//        assertEquals(expected, result);
//    }

    @Test
    public void testDivision() {
        int firstOperand = 10;
        int secondOperand = 2;
        char operator = Calculator.DIVISION; // Sử dụng hằng số
        int expected = 5;
        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }


}
