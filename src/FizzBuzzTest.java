import Logic.BuzzRule;
import Logic.FizzBuzzRule;
import Logic.FizzRule;
import Logic.NumberRule;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.*;

/**
 * Created by daniele on 07/05/15.
 */
public class FizzBuzzTest {

    @Test
    public void fizzbuzz_tests()
    {
        assertFizzBuzz(1, "1");
        assertFizzBuzz(2, "2");
        assertFizzBuzz(3, "Fizz");

        assertFizzBuzz(4, "4");
        assertFizzBuzz(5, "Buzz");
        assertFizzBuzz(6, "Fizz");
        assertFizzBuzz(8, "8");
        assertFizzBuzz(10, "Buzz");

        assertFizzBuzz(12, "Fizz");
        assertFizzBuzz(15, "FizzBuzz");
        assertFizzBuzz(16, "16");
    }

    /** introducing new rules... **/

    @Test
    public void if_number_contains_3__is_fizz()
    {
        assertFizzBuzz(13, "Fizz");
        assertFizzBuzz(31, "Fizz");
        assertFizzBuzz(32, "Fizz");
        assertFizzBuzz(35, "FizzBuzz");
    }

    @Test
    public void if_number_contains_5__is_buzz()
    {
        assertFizzBuzz(52, "Buzz");
        assertFizzBuzz(54, "FizzBuzz");
        assertFizzBuzz(56, "Buzz");
        assertFizzBuzz(57, "FizzBuzz");
        assertFizzBuzz(851, "Buzz");
    }

    private void assertFizzBuzz(int n, String expected) {
        assertEquals(expected, fizzbuzz(n));
    }

    private String fizzbuzz(int n) {

        FizzBuzzRule rule =
            new FizzRule(
                new BuzzRule(
                    new NumberRule()
                )
            );

        return rule.produceLabel(n);
    }
}
