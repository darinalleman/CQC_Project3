import static org.junit.Assert.*;

import org.junit.Test;


public class ContinuingIntegerActionTest
{    
    @Test
    public void testInit()
    {
        ContinuingIntegerAction cia = new ContinuingIntegerAction();
        assertTrue(cia instanceof ContinuingIntegerAction);
    }
    
    @Test
    public void testAction()
    {
        ContinuingIntegerAction cia = new ContinuingIntegerAction();
        assertEquals(cia.execute(new InterimResult(1,1,0), '5'), 
                new InterimResult(1,1,5));
        assertEquals(cia.execute(new InterimResult(1,1,10), '1'), 
                new InterimResult(1,1,101));
        assertEquals(cia.execute(new InterimResult(1,1,5), '9'), 
                new InterimResult(1,1,59));
    }

}
