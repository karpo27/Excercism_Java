class DifferenceOfSquaresCalculator {

    static int computeSquareOfSumTo(int input) {
        int result = 0;
        for (int i = 0; i <= input; i += 1){
            result += i;
        }
        return (int) Math.pow(result, 2);
    }

    static int computeSumOfSquaresTo(int input) {
        int result = 0;
        for (int i = 0; i <= input; i += 1){
            result += (int) Math.pow(i, 2);
        }
        return result;
    }

    static int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }
}
