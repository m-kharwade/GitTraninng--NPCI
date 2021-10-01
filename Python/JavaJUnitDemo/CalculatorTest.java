package JavaJUnitDemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator=new Calculator();

    @Test
    void add() {
        assertEquals(15,calculator.add(8,7));
    }

    @Test
    void sub() {
        assertEquals(1,calculator.sub(8,7));
    }

    @Test
    void multiply() {
        assertEquals(56,calculator.multiply(8,7));
    }

    @Test
    void division() {
        assertEquals(5,calculator.division(15,3));
    }
}