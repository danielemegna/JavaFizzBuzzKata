import Logic.BuzzRule;
import Logic.FizzBuzzRule;
import Logic.FizzRule;
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
        assertFizzBuzz(13, "13");
        assertFizzBuzz(15, "FizzBuzz");
    }

    private void assertFizzBuzz(int n, String expected) {
        assertEquals(expected, fizzbuzz(n));
    }

    private String fizzbuzz(int n) {

        FizzBuzzRule rule =
            new FizzRule(
                new BuzzRule()
            );

        return rule.produceLabel(n);
    }
}
