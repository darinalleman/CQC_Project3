
public class StartFraction implements Action
{

    @Override
    public InterimResult execute(InterimResult x, char c)
    {
        x.setP(x.getP()/10);
        return x;
    }

}
