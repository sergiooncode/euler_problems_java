import java.util.ArrayList;

class Problem5 {
    boolean isEvenlyDivisible(int number, int divisor) {
        boolean isDivisible = false;

        if(number % divisor == 0) {
            isDivisible = true;
        }
        return isDivisible;
    }

    int calculateSmallestEvenlyDivisibleUpto(int divisorsUpto) {
        boolean isDivisible = false;
        ArrayList<Integer> smallestNumbers = new ArrayList<Integer>();
        int iterationNumber = -1;

        for(int number=2; number<500000000; number++) {
            
            iterationNumber = number;
            
            for(int divisor=2; divisor <= divisorsUpto; divisor++) {
                
                if(!isEvenlyDivisible(number, divisor)) {
                    iterationNumber = 0;
                    break; 
                }
            } 

            if(iterationNumber != 0) smallestNumbers.add(iterationNumber);
        }

        System.out.println(divisorsUpto + " " + smallestNumbers.get(0));
        return smallestNumbers.get(0);
    }
}
