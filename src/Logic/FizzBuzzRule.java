package Logic;

/**
 * Created by daniele on 07/05/15.
 */
public abstract class FizzBuzzRule {

    private FizzBuzzRule nextRule = null;

    protected abstract boolean isGuilty(int n);
    protected abstract String getRuleLabel();

    public FizzBuzzRule() {}

    public FizzBuzzRule(FizzBuzzRule next) {
        this.nextRule = next;
    }

    private String labelIfGuilty(int n) {
        if(this.isGuilty(n))
            return this.getRuleLabel();

        return "";
    }

    public String produceLabel(int n) {
        String result = this.labelIfGuilty(n);

        if(this.nextRule != null)
            result += this.nextRule.produceLabel(n);

        return result;
    }


}
