package Logic;

/**
 * Created by daniele on 07/05/15.
 */
public class FizzRule extends FizzBuzzRule {

    @Override
    public boolean isGuilty(int n) {
        return (n % 3 == 0);
    }

    @Override
    protected String getRuleLabel() {
        return "Fizz";
    }
}
