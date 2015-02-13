import org.junit.Test;
import org.junit.Ignore;
import org.junit.Ignore; 
import static org.junit.Assert.assertEquals;
import org.junit.Before;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Problem7Test {
    private Problem7 p;

    @Before
    public void setUp() {
        p = new Problem7();
    }

    @Test
    public void testMarkingAsFalseIntegersFrom2Upto10() {
        
        int maxNumber = 10;
        boolean emptyMarkValue = false;

        Hashtable<Integer,Boolean> table = p.createEmptyTableWithIntegersUpto(maxNumber);
        
        for(int i = 2; i < maxNumber; i++) {
            assertEquals(emptyMarkValue, table.get(i));
        }
    }

    @Test
    public void testMarkAsTrueNumbersAtIncrementsOf2() {
        
        int increment = 2;
        int maxNumber = 10;
        boolean markValue = true;

        Hashtable<Integer,Boolean> table = p.createEmptyTableWithIntegersUpto(maxNumber);
        
        Hashtable<Integer,Boolean> markedTable = p.markElementsOfTable(table, markValue, increment);
        
        for(Integer key : markedTable.keySet()) {
            if(key % increment == 0 && key != increment){
                assertEquals(markValue, markedTable.get(key));
        
            }
        }
    }

    @Test
    public void testMarkAsTrueNumbersAtIncrementsOf3() {
    
        int increment = 3;
        int maxNumber = 10;
        boolean markValue = true;

        Hashtable<Integer,Boolean> table = p.createEmptyTableWithIntegersUpto(maxNumber);

        Hashtable<Integer,Boolean> markedTable = p.markElementsOfTable(table, markValue,increment);

        for(Integer key : markedTable.keySet()) {
            if(key % increment == 0 && key != increment) {
                assertEquals(markValue, markedTable.get(key));
            }
        }
    }

    @Ignore
    @Test
    public void testFindingFirstNumberGreaterThanPAtStart() {
        
        int initialIncrement = 0;
    }

    @Test
    public void testFindingFirstNumberGreaterThan2() {
                                                                       
      int increment = 2;
      int maxNumber = 20;
      boolean markValue = true;
      
      Hashtable<Integer,Boolean> table = p.createEmptyTableWithIntegersUpto(maxNumber);
    
      Hashtable<Integer,Boolean> markedTable = p.markElementsOfTable(table, markValue,increment);
        
      assertEquals(3, p.findNextPNumberAfter(markedTable, increment));
    
    }

    @Test
    public void testFindingFirstNumberGreaterThan3() {

        int inc1 = 2; int inc2 = 3;
        int maxNumber = 20;
        boolean markValue = true;
        
        Hashtable<Integer,Boolean> table = p.createEmptyTableWithIntegersUpto(maxNumber);
        Hashtable<Integer,Boolean> markedTable = p.markElementsOfTable(table, markValue,inc1); 
        Hashtable<Integer,Boolean> finalTable = p.markElementsOfTable(markedTable, markValue,inc2); 

        assertEquals(5, p.findNextPNumberAfter(finalTable, inc2));
    }

    @Test
    public void testFindingPrimesUpto20() {

        int maxNumber = 110000;
        int stPrimeNumber = 10000; //Although this is 10001st prime number

        assertEquals(104743, p.generatePrimesUpto(maxNumber, stPrimeNumber));
    }
}
