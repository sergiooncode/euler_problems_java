import org.junit.Test;
import org.junit.Ignore; 
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class Problem5Test {
    private Problem5 p;

    @Before
    public void setUp() {
        p = new Problem5();
    }

    @Test
    public void testIsEvenlyDivisibleBy2() {
        assertEquals(true, p.isEvenlyDivisible(2, 2));
    }

    @Test
    public void testIsEvenlyDivisibleBy3() {
        assertEquals(true, p.isEvenlyDivisible(3, 3));
    }

    @Test
    public void testIsEvenlyDivisibleBy4() {
        assertEquals(true, p.isEvenlyDivisible(4, 4));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto4() {
        assertEquals(6, p.calculateSmallestEvenlyDivisibleUpto(3));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto5() {
        assertEquals(60, p.calculateSmallestEvenlyDivisibleUpto(5));    
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto10() {
        assertEquals(2520, p.calculateSmallestEvenlyDivisibleUpto(10));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto11() {
        assertEquals(27720, p.calculateSmallestEvenlyDivisibleUpto(11));
    }
 
    @Test
    public void testMinimumEvenlyDivisibleUpto12() {                      
        assertEquals(27720, p.calculateSmallestEvenlyDivisibleUpto(12)); 
    }
     
     @Test
     public void testMinimumEvenlyDivisibleUpto20() {
        assertEquals(232792560, p.calculateSmallestEvenlyDivisibleUpto(20));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto13() {
        assertEquals(360360, p.calculateSmallestEvenlyDivisibleUpto(13));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto14() {
        assertEquals(360360, p.calculateSmallestEvenlyDivisibleUpto(14));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto15() {
        assertEquals(360360, p.calculateSmallestEvenlyDivisibleUpto(15));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto16() {
        assertEquals(720720, p.calculateSmallestEvenlyDivisibleUpto(16));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto17() {
        assertEquals(12252240, p.calculateSmallestEvenlyDivisibleUpto(17));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto18() {
        assertEquals(12252240, p.calculateSmallestEvenlyDivisibleUpto(18));
    }

    @Test
    public void testMinimumEvenlyDivisibleUpto19() {
        assertEquals(232792560, p.calculateSmallestEvenlyDivisibleUpto(19));
    }
}

