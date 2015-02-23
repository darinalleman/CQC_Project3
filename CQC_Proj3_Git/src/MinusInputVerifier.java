
/**
 * @author Darin & Darnell
 * Check if the input is a minus sign. 
 */
public class MinusInputVerifier implements InputVerifier
{
    /**
     * If the input char is ascii value 45 (the "-" char), 
     * return true. Otherwise, false.
     */
    @Override
    public boolean meetsCriteria(char c)
    {
        if (c == 45)
        {
            return true;
        }
        return false;
    }

}
