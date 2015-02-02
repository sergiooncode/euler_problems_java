import org.junit.Test;
import org.junit.Ignore; 
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class Problem6Test {
    private Problem6 p;

    @Before
    public void setUp() {
        p = new Problem6();
    }

    @Test
    public void testSumOfSquaresUpto2() {
        assertEquals(5, p.sumOfSquaresUpto(2));
    }

    @Test
    public void testSumOfSquaresUpto10() {
        assertEquals(385, p.sumOfSquaresUpto(10));
    }

    @Test
    public void testSquareOfSumUpto2() {
        assertEquals(9, p.squareOfSumUpto(2));
    } 

    @Test
    public void testSquareOfSumUpto10() {
        assertEquals(3025, p.squareOfSumUpto(10));
    }

    @Test
    public void testDifferenceUpto10() {
        assertEquals(2640, p.differenceUpto(10));
    }

    @Test
    public void testDifferenceUpto100() {
        assertEquals(25164150, p.differenceUpto(100));
    }
}
