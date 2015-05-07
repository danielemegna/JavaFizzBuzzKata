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

        List<FizzBuzzRule> rules = new ArrayList<FizzBuzzRule>();
        rules.add(new FizzRule());
        rules.add(new BuzzRule());

        String result = "";
        for(FizzBuzzRule rule : rules)
            result += rule.getLabel(n);

        if(result.isEmpty())
            return Integer.toString(n);

        return result;
    }
}
