
/**
 * The action to be taken when you find another integer before a decimal space.
 * @author Darin Alleman & Darnell Martin
 *
 */
public class ContinuingIntegerAction implements Action
{

    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        InterimResult nextResult = new InterimResult(x);
        nextResult.setV(x.getV()*10 + (c-48));
        return nextResult;
    }

}
