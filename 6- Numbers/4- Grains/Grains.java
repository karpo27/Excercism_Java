import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        BigInteger grains = BigInteger.ONE;
        for (int i = 1; i < square; i += 1){
            grains = grains.multiply(BigInteger.valueOf(2));
        }

        return grains;
    }

    BigInteger grainsOnBoard() {
        BigInteger grainsTotal = BigInteger.ZERO;

        int counter = 1;
        while (counter <= 64){
            BigInteger grains = new BigInteger(grainsOnSquare(counter).toByteArray());
            grainsTotal = grainsTotal.add(grains);
            counter += 1;
        }
        return grainsTotal;
    }
}
