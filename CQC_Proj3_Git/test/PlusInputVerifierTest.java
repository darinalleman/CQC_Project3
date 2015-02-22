import static org.junit.Assert.*;

import org.junit.Test;


public class PlusInputVerifierTest
{

    /**
     * Test that the plus input verifier class gets built right
     */
    @Test
    public void testInit()
    {
        PlusInputVerifier piv = new PlusInputVerifier();
        assertTrue(piv instanceof PlusInputVerifier);
    }
    
    /**
     * Test that the input verifier returns true for valid input
     */
    @Test
    public void testTrueVerification()
    {
        PlusInputVerifier piv = new PlusInputVerifier();
        assertTrue(piv.meetsCriteria('+'));  
    }
    
    /**
     * Test that the input verifier returns false for non-valid input
     */
    @Test
    public void testFalseVerification()
    {
        PlusInputVerifier piv = new PlusInputVerifier();
        assertFalse(piv.meetsCriteria('*'));  
        assertFalse(piv.meetsCriteria(',')); 
    }


}
