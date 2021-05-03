import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculatorOne;

    @Before
    public void before() {
        calculatorOne = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(3, calculatorOne.add(1, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(1, calculatorOne.subtract(3, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(6, calculatorOne.multiply(2, 3));
    }

    @Test
    public void canDivide() {
        assertEquals(3, calculatorOne.divide(6.0, 2.0), 0.01);
    }
}
