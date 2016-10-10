package calc;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laszlo Kishalmi
 */
public class CalculatorTest {
    
    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int a = 12;
        int b = 30;
        Calculator instance = new Calculator();
        int expResult = 42;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }
    
}
