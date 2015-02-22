
public class ContinuingFractionAction implements Action
{

    @Override
    public InterimResult execute(InterimResult x, char c)
    {
    	InterimResult nextResult = new InterimResult(x);
    	nextResult.setV(nextResult.getV() + (c-48)*nextResult.getP());
    	nextResult.setP(nextResult.getP()/10);
        return nextResult;
    }

}
