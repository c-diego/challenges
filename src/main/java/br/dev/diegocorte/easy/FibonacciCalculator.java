package br.dev.diegocorte.easy;

import java.math.BigInteger;

/**
 *
 * @author diego
 */
public class FibonacciCalculator {

    public BigInteger[] calculate() {
        return calculateUntilLimit(100);
    }

    public BigInteger[] calculateUntilLimit(int limit) {

        BigInteger[] sequence = new BigInteger[limit];

        sequence[0] = BigInteger.ZERO;
        sequence[1] = BigInteger.ONE;

        for (int i = 2; i < limit; i++) {
            sequence[i] = getNext(sequence[i-2], sequence[i-1]);
        }

        return sequence;
    }

    private BigInteger getNext(BigInteger previousA, BigInteger previousB) {
        return previousA.add(previousB);
    }
}
