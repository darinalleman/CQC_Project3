import static org.junit.Assert.*;

import org.junit.Test;


public class NoActionTest
{
    @Test
    public void testInit()
    {
        NoAction na = new NoAction();
        assertTrue(na instanceof NoAction);
    }
    
    @Test
    public void testAction()
    {
        NoAction na = new NoAction();
        assertEquals(na.execute(new InterimResult(1,1,0), '+'), 
                new InterimResult(1,1,0));
        assertEquals(na.execute(new InterimResult(1,1,10), '+'), 
                new InterimResult(1,1,10));
        assertEquals(na.execute(new InterimResult(1,1,5), '9'), 
                new InterimResult(1,1,5));
    }

}
