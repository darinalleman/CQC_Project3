
/**
 * Action to be taken when getting another digit after the decimal point
 * @author Darin Alleman & Darnell Martin
 *
 */
public class ContinuingFractionAction implements Action
{

	/**
	 * If there is another number after we have already encountered a 
	 * decimal, simply add that number times the current tens position.
	 * Then set p to the next smallest tens position so its ready for the
	 * next one.
	 */
    @Override
    public InterimResult execute(InterimResult x, char c)
    {
    	InterimResult nextResult = new InterimResult(x);
    	nextResult.setV(nextResult.getV() + (c-48)*nextResult.getP());
    	nextResult.setP(nextResult.getP()/10);
        return nextResult;
    }

}
