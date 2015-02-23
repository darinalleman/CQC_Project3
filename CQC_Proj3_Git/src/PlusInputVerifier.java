
/**
 * @author Darin
 * Check if the input is a plus sign.
 */
public class PlusInputVerifier implements InputVerifier
{

    /**
     * If input is a plus sign ('+') return true
     * Otherwise, return false
     */
    @Override
    public boolean meetsCriteria(char c)
    {
        if (c == 43)
        {
            return true;
        }
        return false;
    }

}
