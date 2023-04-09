package br.dev.diegocorte.easy;

import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 *
 * @author diego
 */
@DisplayName("Testando FibonacciCalculator")
public class FibonacciCalculatorTest {

    @Test
    @DisplayName("Calculando sequencia de 20 números")
    public void testCalculateUntilLimit() {
        
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();
        
        BigInteger[] sequence = fibonacciCalculator.calculateUntilLimit(21);

        BigInteger[] expectedSequence = {
            BigInteger.valueOf(0),
            BigInteger.valueOf(1),
            BigInteger.valueOf(1),
            BigInteger.valueOf(2),
            BigInteger.valueOf(3),
            BigInteger.valueOf(5),
            BigInteger.valueOf(8),
            BigInteger.valueOf(13),
            BigInteger.valueOf(21),
            BigInteger.valueOf(34),
            BigInteger.valueOf(55),
            BigInteger.valueOf(89),
            BigInteger.valueOf(144),
            BigInteger.valueOf(233),
            BigInteger.valueOf(377),
            BigInteger.valueOf(610),
            BigInteger.valueOf(987),
            BigInteger.valueOf(1597),
            BigInteger.valueOf(2584),
            BigInteger.valueOf(4181),
            BigInteger.valueOf(6765)
        };
        
        assertArrayEquals(expectedSequence, sequence);
    }

}
