
public class NegateAction implements Action
{

    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        InterimResult nextResult = new InterimResult(x);
        nextResult.setS(-1);
        return nextResult;
    }

}
