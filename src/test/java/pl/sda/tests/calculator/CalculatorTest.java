package pl.sda.tests.calculator;

import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Lucas on 17.07.2017.
 */
public class CalculatorTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();
    private Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    @Test
    public void testAdding() {
        int result = calculator.add(3, 5);

        assertEquals(8, result);
    }

    @Test
    public void testSubstracting() {
        int result = calculator.subtract(8, 4);

        assertEquals(4, result);
    }

    @Test
    public void testMultiplying() {
        int result = calculator.multiply(2, 3);

        assertEquals(6, result);
    }

    @Test
    public void testDividing() {
        Double result = calculator.divide(5.75, 2.3);

        assertEquals(new Double(2.5), result);
    }

    @Test
    public void checkIfEven() {

        assertTrue(calculator.isEven(4));
        assertFalse(calculator.isEven(5));
    }

    @Test
    public void TestToSquare() {
        Double result = calculator.toSquare(4);
        assertEquals(new Double(Math.sqrt(4)), result);
    }

    @Test
    public void TestRaiseXToY() {
        Double result = calculator.raiseXToY(2, 3);
        assertEquals(new Double(Math.pow(2, 3)), result);
    }

    @Test
    public void TestObliczanieVAT() {
        Double result = calculator.calculateVAT(2);
        assertEquals(new Double(2 + 0.19 * 2), result);
    }

    @Test
    public void TestObliczBrutto() {
        Double result = calculator.calculateGross(2500, 22);
        assertEquals(new Double(2500 + 0.22 * 2500), result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivision() {
        Double result = calculator.divide(new Double(1), new Double(0));

        assertNull(result);
    }

    @Test
    public void testDivision2() {
        try {
            Double result = calculator.divide(new Double(1), new Double(0));

        } catch (ArithmeticException e) {
            assertEquals("Incorrect value", e.getMessage());
        }
    }

    @Test
    public void testDivision3() {
        thrown.expect(ArithmeticException.class);
        thrown.expectMessage("Incorrect value");
        Double result = calculator.divide(new Double(1), new Double(0));
        assertNull(result);
    }


}


