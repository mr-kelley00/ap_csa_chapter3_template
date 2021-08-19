// Original Code Copyright Chris Mayfield.  Use this for Exercise 3.4
// <STUDENT NAME>, <DATE>, Exercise 3.4, version 0.0
import java.util.Random;

/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }

}
