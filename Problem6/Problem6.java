class Problem6 {
    int sumOfSquaresUpto(int number) {
        int sum = 0;
        int square = 0;

        for(int i=1; i<=number; i++) sum += Math.pow(i, 2); 
 
        return sum;
    }

    int squareOfSumUpto(int number) {
        int sum = 0;

        for(int i=1; i<=number; i++) sum += i;

        return sum*sum;
    }

    int differenceUpto(int number) {
        int difference = Math.abs(sumOfSquaresUpto(number)-squareOfSumUpto(number));
        return difference;
    }
}
