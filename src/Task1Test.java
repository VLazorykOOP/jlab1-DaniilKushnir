import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Task1Test {

    private Task1 task1;

    @BeforeEach
    public void setUp() {
        task1 = new Task1(5.0, 3.0);
    }

    @Test
    public void testCalculateResult1() {
        double expected = ((((5.0 + 1) / (3.0 + 2)) + (5 / (5.0 - 3.0))) * (((5.0 + 1) / (3.0 + 2)) + (5 / (5.0 - 3.0)))) * 5.0 * 3.0;
        double actual = task1.calculateResult1();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCalculateResult2() {
        double n = 5.0;
        double m = 3.0;
    
        int nInt = (int) n;  
        int mInt = (int) m;  
    
        double part1 = (double) (nInt + 1) / (mInt + 2);  
        double part2 = 5.0 / (nInt - mInt);               
        double expected = ((part1 + part2) * (part1 + part2)) * nInt * mInt; 
    
        expected = ((3.7) * (3.7)) * 15; 
        
        double actual = task1.calculateResult2();
        
        assertEquals(expected, actual, 0.0001);
    }
    

    @Test
    public void testCalculateResult3() {
        int expected = (int) ((((5.0 + 1) / (3.0 + 2)) + (5 / (5.0 - 3.0))) * (((5.0 + 1) / (3.0 + 2)) + (5 / (5.0 - 3.0))) * 5.0 * 3.0);
        int actual = task1.calculateResult3();
        assertEquals(expected, actual);
    }

    @Test
    public void testCalculateResultWithNegativeValues() {
        task1 = new Task1(-2.0, -1.0);
        
        double expected = (((( -2.0 + 1) / (-1.0 + 2)) + (5 / (-2.0 + 1))) * (((-2.0 + 1) / (-1.0 + 2)) + (5 / (-2.0 + 1)))) * -2.0 * -1.0;
        double actual = task1.calculateResult1();
        assertEquals(expected, actual, 0.0001);
    }

    @Test
    public void testCalculateResultWithZero() {
        task1 = new Task1(0.0, 0.0);

        double expected = ((((0.0 + 1) / (0.0 + 2)) + (5 / (0.0 - 0.0))) * (((0.0 + 1) / (0.0 + 2)) + (5 / (0.0 - 0.0)))) * 0.0 * 0.0;
        double actual = task1.calculateResult1();
        assertEquals(expected, actual, 0.0001);
    }
}
