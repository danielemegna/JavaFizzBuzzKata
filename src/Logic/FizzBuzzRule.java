package Logic;

/**
 * Created by daniele on 07/05/15.
 */
public abstract class FizzBuzzRule {

    protected abstract boolean isGuilty(int n);
    protected abstract String getRuleLabel();

    public String getLabel(int n) {
        if(this.isGuilty(n))
            return this.getRuleLabel();

        return "";
    }


}
