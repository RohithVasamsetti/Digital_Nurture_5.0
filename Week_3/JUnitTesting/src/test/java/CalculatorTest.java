import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup Method
    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup Completed");
    }

    // Test Addition
    @Test
    public void testAdd() {

        // Arrange
        int a = 10;
        int b = 20;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Test Subtraction
    @Test
    public void testSubtract() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(15, result);
    }

    // Test Multiplication
    @Test
    public void testMultiply() {

        // Arrange
        int a = 6;
        int b = 5;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(30, result);
    }

    // Test Division
    @Test
    public void testDivide() {

        // Arrange
        int a = 20;
        int b = 5;

        // Act
        int result = calculator.divide(a, b);

        // Assert
        assertEquals(4, result);
    }

    // Teardown Method
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Cleanup Completed");
    }
}