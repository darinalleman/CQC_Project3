import static org.junit.Assert.*;

import org.junit.Test;


public class ValueIsDigitActionTest
{
    private ConvertingMachine m;
    
    @Test
    public void testInit()
    {
        ValueIsDigitAction vida = new ValueIsDigitAction();
        assertTrue(vida instanceof ValueIsDigitAction);
    }
    
    @Test
    public void testActionOnSamePAndS()
    {
        ValueIsDigitAction vida = new ValueIsDigitAction();
        assertEquals(vida.execute(new InterimResult(1,1,0), '5'), 
                new InterimResult(1,1,5));
        assertEquals(vida.execute(new InterimResult(1,1,10), '0'), 
                new InterimResult(1,1,0));
        assertEquals(vida.execute(new InterimResult(1,1,10), '9'), 
                new InterimResult(1,1,9));
    }
}
