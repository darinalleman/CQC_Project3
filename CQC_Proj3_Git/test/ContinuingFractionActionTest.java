import static org.junit.Assert.*;

import org.junit.Test;


public class ContinuingFractionActionTest
{

    @Test
    public void testInit()
    {
        ContinuingFractionAction cfa = new ContinuingFractionAction();
        assertTrue(cfa instanceof ContinuingFractionAction);
    }
    
    @Test
    public void testAction()
    {
    	ContinuingFractionAction cfa = new ContinuingFractionAction();
        assertEquals(cfa.execute(new InterimResult(.1,1,0), '5'), 
                new InterimResult(.01,1,.5));
        assertEquals(cfa.execute(new InterimResult(.1,1,10), '1'), 
                new InterimResult(.01,1,10.1));
        assertEquals(cfa.execute(new InterimResult(.001,1,5.55), '9'), 
                new InterimResult(.0001,1,5.559));
    }

}
