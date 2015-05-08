package Logic;

/**
 * Created by daniele on 08/05/15.
 */
public class NumberRule extends FizzBuzzRule {

    @Override
    protected boolean isGuilty(int n, String partialResult) {
        return partialResult.isEmpty();
    }

    @Override
    protected String getRuleLabel(int n) {
        return Integer.toString(n);
    }
}
