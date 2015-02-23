/**
 * @author Darin & Darnell
 *Do nothing.
 */
public class NoAction implements Action
{
	/**
	 * Simply return the input interim result because we don't need to do
	 * anything for a no action.
	 */
    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        return x;
    }

}
