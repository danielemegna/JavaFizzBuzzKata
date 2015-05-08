package Logic;

/**
 * Created by daniele on 07/05/15.
 */
public class BuzzRule extends FizzBuzzRule {

    public BuzzRule() {
        super();
    }

    public BuzzRule(FizzBuzzRule nextRule) {
        super(nextRule);
    }

    @Override
    public boolean isGuilty(int n) {
        return (n % 5 == 0);
    }

    @Override
    protected String getRuleLabel() {
        return "Buzz";
    }
}
