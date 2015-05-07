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

        assertFizzBuzz(15, "FizzBuzz");
    }

    private void assertFizzBuzz(int n, String expected) {
        assertEquals(expected, fizzbuzz(n));
    }

    private String fizzbuzz(int n) {

        String result = "";
        FizzBuzzRule rule;

        rule = new FizzRule();
        if(n % 3 == 0)
            result += rule.getLabel(n);

        rule = new BuzzRule();
        if(n % 5 == 0)
            result += rule.getLabel(n);

        if(result == "")
            return Integer.toString(n);

        return result;
    }
}
