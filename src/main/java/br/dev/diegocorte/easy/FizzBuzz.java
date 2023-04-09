package br.dev.diegocorte.easy;

/**
 *
 * @author diego
 */
public class FizzBuzz {
    
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String FIZZBUZZ = "FizzBuzz";
    

    public String generate(int max) {

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= max; i++) {

            if ((i % 3 == 0) && (i % 5 == 0)) {
                stringBuilder.append(FIZZBUZZ + " ");
            
            } else if (i % 3 == 0) {
                stringBuilder.append(FIZZ + " ");

            } else if (i % 5 == 0) {
                stringBuilder.append(BUZZ + " ");
    
            } else {
                stringBuilder.append(i + " ");
            }

        }

        return stringBuilder.toString().trim();
    }

}
