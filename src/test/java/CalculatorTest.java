import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator(20, 30);
    }

    @Test
    public void adds(){
        assertEquals(50, calculator.add());
    }

    @Test
    public void subtracts(){
        assertEquals(10, calculator.subtract());
    }

    @Test
    public void multiply(){
        assertEquals(600, calculator.multiply());
    }

    @Test
    public void divide(){
        assertEquals(0.67, calculator.divide(20.00, 30.00), 0.01);
    }
}
