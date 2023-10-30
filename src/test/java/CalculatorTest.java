import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(12, calculator.addNumbers(7,5));
    }

    @Test
    public void canSubtract(){
        assertEquals(2, calculator.subtractNumbers(7,5));
    }

    @Test
    public void canMultiply(){
        assertEquals(35, calculator.multiplyNumbers(7,5));
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divideNumbers(9.99, 3.33), 0.1);
    }

}
