
public class DigitInputVerifier implements InputVerifier
{

    @Override
    public boolean meetsCriteria(char c)
    {
        if (c >= 48 && c <= 57)
        {
            return true;
        }
        return false;
    }

}
