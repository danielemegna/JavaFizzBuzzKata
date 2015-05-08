package Logic;

/**
 * Created by daniele on 07/05/15.
 */
public abstract class FizzBuzzRule {

    private FizzBuzzRule nextRule = null;

    protected abstract boolean isGuilty(int n, String partialResult);
    protected abstract String getRuleLabel(int n);

    public FizzBuzzRule() {}

    public FizzBuzzRule(FizzBuzzRule next) {
        this.nextRule = next;
    }

    private String labelIfGuilty(int n, String partialResult) {
        return this.isGuilty(n, partialResult) ? this.getRuleLabel(n) : "";
    }

    private String produceLabel(int n, String partialResult) {
        if(this.nextRule == null)
            return applyRuleToPartial(n, partialResult);

        return this.nextRule.produceLabel(n,
            applyRuleToPartial(n, partialResult)
        );
    }

    private String applyRuleToPartial(int n, String partialResult) {
        return partialResult + this.labelIfGuilty(n, partialResult);
    }

    public String produceLabel(int n) {
        return this.produceLabel(n, "");
    }


}
