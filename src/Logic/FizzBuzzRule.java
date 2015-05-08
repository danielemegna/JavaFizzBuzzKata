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
        return this.isGuilty(n) ? this.getRuleLabel() : "";
    }

    private String produceLabel(int n, String partialResult) {
        String internalResult = (partialResult + this.labelIfGuilty(n));
        
        if(this.nextRule != null)
            return this.nextRule.produceLabel(n, internalResult);

        return (internalResult.isEmpty() ? Integer.toString(n) : internalResult);
    }

    public String produceLabel(int n) {
        return this.produceLabel(n, "");
    }


}
