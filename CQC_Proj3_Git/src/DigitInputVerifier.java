
/**
 * @author Darin
 *
 */
public class DigitInputVerifier implements InputVerifier
{
	/**
	 * If the character is a number (ascii 48 - 57), then return true. 
	 */
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
