import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DigitInputVerifierTest
{
        /**
         * Test that the Digit input verifier class gets built right
         */
        @Test
        public void testInit()
        {
            DigitInputVerifier dvi = new DigitInputVerifier();
            assertTrue(dvi instanceof DigitInputVerifier);
        }
        
        /**
         * Test that the input verifier returns true for valid input
         */
        @Test
        public void testTrueVerification()
        {
            DigitInputVerifier dvi = new DigitInputVerifier();
            assertTrue(dvi.meetsCriteria('5'));
            assertTrue(dvi.meetsCriteria('0'));
            assertTrue(dvi.meetsCriteria('9'));           
        }
        
        /**
         * Test that it returns false on non-valid input
         */
        @Test
        public void testFalseVerification()
        {
            DigitInputVerifier dvi = new DigitInputVerifier();
            assertFalse(dvi.meetsCriteria('/'));
            assertFalse(dvi.meetsCriteria(':'));
            assertFalse(dvi.meetsCriteria('A'));           
        }
        
}
