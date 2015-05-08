package Logic;

/**
 * Created by daniele on 07/05/15.
 */
public class FizzRule extends FizzBuzzRule {

    public FizzRule() {
        super();
    }

    public FizzRule(FizzBuzzRule nextRule) {
        super(nextRule);
    }

    @Override
    public boolean isGuilty(int n, String partialResult) {
        return (n % 3 == 0);
    }

    @Override
    protected String getRuleLabel(int n) {
        return "Fizz";
    }
}
