package taschenrechner;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Testklasse für den Taschenrechner
 */
public class CalcTest {
    Taschenrechner t = new Taschenrechner();

    /**
     * Test zur Addition
     */
    @Test
    public void testAdd() {
        assertEquals(5.0, t.add(2, 3), 0.0001);
    }

    /**
     * Test zur Subtraktion
     */
    @Test
    public void testSubtract() {
        assertEquals(1.0, t.subtract(3, 2), 0.0001);
    }

    /**
     * Test zur Multiplikation
     */
    @Test
    public void testMultiply() {
        assertEquals(6.0, t.multiply(2, 3), 0.0001);
    }

    /**
     * Test zur Division
     */
    @Test
    public void testDivide() {
        assertEquals(2.0, t.divide(6, 3), 0.0001);
    }

    /**
     * Exceptiontest, dass nicht durch 0 dividiert wird
     */
    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        t.divide(5, 0);
    }
}
