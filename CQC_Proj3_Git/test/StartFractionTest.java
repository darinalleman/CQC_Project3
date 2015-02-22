import static org.junit.Assert.*;

import org.junit.Test;


public class StartFractionTest
{

    @Test
    public void testInit()
    {
        StartFraction sf = new StartFraction();
        assertTrue(sf instanceof StartFraction);
    }
    
    @Test
    public void testAction()
    {
    	StartFraction sf = new StartFraction();
        assertEquals(sf.execute(new InterimResult(1,1,0), '.'), 
                new InterimResult(.1,1,0.0));
        assertEquals(sf.execute(new InterimResult(1,1,10), '.'), 
                new InterimResult(.1,1,10));
        assertEquals(sf.execute(new InterimResult(1,1,100), '.'), 
                new InterimResult(.1,1,100));
    }

}
