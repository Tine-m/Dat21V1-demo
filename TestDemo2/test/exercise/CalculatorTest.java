package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CalculatorTest {

   @Test
    public void sum()  {
        // Arrange
        Calculator calc = new Calculator();
        double expected = 30;

        // Act
        double actual = calc.sum(10,20);

        // Assert
        assertEquals(expected, actual);
       //System.out.println(actual);
    }

    @Test
    public void sumNegativeNumbers() {
        // Arrange
        Calculator calc = new Calculator();

        // Act
        assertThrows(IllegalArgumentException.class, () -> calc.sum(-10,-20));
    }
}