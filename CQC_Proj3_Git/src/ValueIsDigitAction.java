
/**
 * @author Darin
 * Set the result value if the input char is a digit
 */
public class ValueIsDigitAction implements Action
{
	/**
	 * If the first value is a digit, simple make the
	 * interimresult value to the value in the input char 
	 */
    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        InterimResult nextResult = new InterimResult(x);
        nextResult.setV((c - 48));
        return nextResult;
    }

}
