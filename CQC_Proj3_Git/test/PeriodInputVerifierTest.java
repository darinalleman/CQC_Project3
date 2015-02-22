import static org.junit.Assert.*;

import org.junit.Test;


public class PeriodInputVerifierTest
{

    /**
     * Test that the period input verifier class gets built right
     */
    @Test
    public void testInit()
    {
        PeriodInputVerifier piv = new PeriodInputVerifier();
        assertTrue(piv instanceof PeriodInputVerifier);
    }
    
    /**
     * Test that the input verifier returns true for valid input
     */
    @Test
    public void testTrueVerification()
    {
        PeriodInputVerifier piv = new PeriodInputVerifier();
        assertTrue(piv.meetsCriteria('.'));  
    }
    
    /**
     * Test that the input verifier returns false for non-valid input
     */
    @Test
    public void testFalseVerification()
    {
        PeriodInputVerifier piv = new PeriodInputVerifier();
        assertFalse(piv.meetsCriteria('-'));  
        assertFalse(piv.meetsCriteria('/')); 
    }

}
