/**
 * A finite state machine that parses a string containing a real number. Will
 * throw NumberFormatExcaption if the string doesn't not contain a legal
 * representation of a real number. Note: we are not dealing with scientific
 * notation
 * 
 * @author Merlin
 *
 */
public class ConvertingMachine
{

	private final Edge[] machine =
	{
			new Edge(State.START, new DigitInputVerifier(),
					new ValueIsDigitAction(), State.INTEGER),
			new Edge(State.START, new MinusInputVerifier(), new NegateAction(),
					State.INTEGER),
			new Edge(State.START, new PlusInputVerifier(), new NoAction(),
					State.INTEGER),
			new Edge(State.START, new PeriodInputVerifier(),
					new StartFraction(), State.DECIMAL),
			new Edge(State.INTEGER, new DigitInputVerifier(),
					new ContinuingIntegerAction(), State.INTEGER),
			new Edge(State.INTEGER, new PeriodInputVerifier(),
					new StartFraction(), State.DECIMAL),
			new Edge(State.DECIMAL, new DigitInputVerifier(),
					new ContinuingFractionAction(), State.DECIMAL)

	};


	private class Edge
	{
		State currentState;
		InputVerifier inputVerifier;
		Action action;
		State nextState;

		public Edge(State currentState, InputVerifier inputVerifier,
				Action action, State nextState)
		{
			this.currentState = currentState;
			this.inputVerifier = inputVerifier;
			this.action = action;
			this.nextState = nextState;
		}
	}

	private enum State
	{
		START, INTEGER, DECIMAL, END
	}

    /**
     * @param string - the sequence of characters to be parsed to find a number
     * @return the number parsed from the input string
     */
    public double parse(String string)
    {
    	InterimResult result = new InterimResult(1, 1, 0);
    	State currentState = State.START;
    	
        for (int i = 0; i < string.length(); i++)
        {
        	Edge e;
        	e = search(currentState, string.charAt(i));
        	result = e.action.execute(result, string.charAt(i));
        	currentState = e.nextState;
        }
        return result.getS()*result.getV();
    }

    /**
     * seach to find which edge is the edge we are on and need to take
     * @param currentState 
     * @param charAt
     * @return the edge that we are at
     */
	private Edge search(State currentState, char charAt)
	{
		for (Edge e : machine)
		{
			if (e.currentState == currentState)
			{
				if (e.inputVerifier.meetsCriteria(charAt))
				{
					return e;
				}
			}
		}
		throw new NumberFormatException();
	}
}
