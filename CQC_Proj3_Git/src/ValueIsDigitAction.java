
public class ValueIsDigitAction implements Action
{

    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        InterimResult nextResult = new InterimResult(x);
        nextResult.setV((c - 48));
        return nextResult;
    }

}
