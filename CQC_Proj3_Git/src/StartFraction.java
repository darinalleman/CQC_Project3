
/**
 * @author Darin
 * Sets the next position to be a decimal
 */
public class StartFraction implements Action
{
	/**
	 * Simply set the p value to a tenth of what it was.
	 * Since it starts at 1, and only gets called when
	 * we find a decimal, it just sets p to .1 so that 
	 * the next input integer gets added as a decimal.
	 */
    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        x.setP(x.getP()/10);
        return x;
    }

}
