/**
 * @author Darin
 * Check if the input is a period
 */
public class PeriodInputVerifier implements InputVerifier
{

    /**
     * If the input char is a period (".") then return true
     * Otherwise, false.
     */
    @Override
    public boolean meetsCriteria(char c)
    {
        if (c == 46)
        {
            return true;
        }
        return false;
    }

}
