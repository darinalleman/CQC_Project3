import static org.junit.Assert.*;

import org.junit.Test;


public class NegateActionTest
{
    
    @Test
    public void testInit()
    {
        NegateAction na = new NegateAction();
        assertTrue(na instanceof NegateAction);
    }
    
    @Test
    public void testAction()
    {
        NegateAction na = new NegateAction();
        assertEquals(na.execute(new InterimResult(1,1,5), '-'), 
                new InterimResult(1,-1,5));
    }
}
