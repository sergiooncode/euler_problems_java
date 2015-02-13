import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Collections;

class Problem7 {

    static final int HUGE_NUMBER = 100000000;
    
    Hashtable<Integer,Boolean> createEmptyTableWithIntegersUpto(int number){
        
        Hashtable<Integer,Boolean> table = new Hashtable<Integer,Boolean>();

        for(int i=2; i<=number; i++) {
            table.put(i,false);
        }
        
        return table;
    }
    
    Hashtable<Integer,Boolean> markElementsOfTable(Hashtable<Integer,Boolean> table, boolean markValue, int increment) {

        for(Integer key : table.keySet()) {
            if(key % increment == 0 && key != increment) {
                table.put(key, markValue);
            }
        }
        
        return table;
    }

    int findNextPNumberAfter(Hashtable<Integer,Boolean> table, int increment) {

        int nextPNumber = HUGE_NUMBER;

        for(Integer key : table.keySet()) {
            
            if(!table.get(key)) {
                if(key < nextPNumber && key > increment) nextPNumber = key;
            }
        }
        return nextPNumber;
    }

    int generatePrimesUpto(int maxNumber, int stNumber) {
       
        ArrayList<Integer> list = new ArrayList<Integer>();

        Hashtable<Integer,Boolean> emptyTable = createEmptyTableWithIntegersUpto(maxNumber);

        int increment = 2;

        Hashtable<Integer,Boolean> table = markElementsOfTable(emptyTable, true, increment);

        while(findNextPNumberAfter(table, increment) != HUGE_NUMBER) {
            increment = findNextPNumberAfter(table, increment);
            table = markElementsOfTable(table, true, increment);
        }

        for(Integer key : table.keySet())
            if(!table.get(key)) list.add(key);

        Collections.reverse(list);

        return(list.get(stNumber));
    }
}
