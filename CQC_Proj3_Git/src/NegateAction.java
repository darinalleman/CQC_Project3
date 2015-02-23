
/**
 * @author Darin &  Darnell
 *
 *Set the s to -1
 */
public class NegateAction implements Action
{

	/**
	 * Since we are already sure that the input c is going to be a minus sign,
	 * we can simply negate the sign value, setting s to -1.
	 */
    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        InterimResult nextResult = new InterimResult(x);
        nextResult.setS(-1);
        return nextResult;
    }

}
