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

    }

    private void assertFizzBuzz(int n, String expected) {
        assertEquals(expected, fizzbuzz(n));
    }

    private String fizzbuzz(int n) {

        if(n % 3 == 0)
            return "Fizz";
        if(n % 5 == 0)
            return "Buzz";

        return Integer.toString(n);
    }
}
