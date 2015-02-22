import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author Darin Alleman, Darnell Martin
 * Test class for the minus input verifier test
 *
 */
public class MinusInputVerifierTest
{

    /**
     * Test that the minus input verifier class gets built right
     */
    @Test
    public void testInit()
    {
        MinusInputVerifier miv = new MinusInputVerifier();
        assertTrue(miv instanceof MinusInputVerifier);
    }
    
    /**
     * Test that the input verifier returns true for valid input
     */
    @Test
    public void testTrueVerification()
    {
        MinusInputVerifier miv = new MinusInputVerifier();
        assertTrue(miv.meetsCriteria('-'));  
    }
    
    /**
     * Test that the input verifier returns false for non-valid input
     */
    @Test
    public void testFalseVerification()
    {
        MinusInputVerifier miv = new MinusInputVerifier();
        assertFalse(miv.meetsCriteria(','));  
        assertFalse(miv.meetsCriteria('.')); 
    }
    
    

}
