package Logic;

/**
 * Created by daniele on 07/05/15.
 */
public class BuzzRule extends FizzBuzzRule {

    @Override
    public boolean isGuilty(int n) {
        return (n % 5 == 0);
    }

    @Override
    protected String getRuleLabel() {
        return "Buzz";
    }
}
