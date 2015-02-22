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

    public double parse(String string)
    {
    	InterimResult result = new InterimResult(1, 1, 0);
        for (int i = 0; i < string.length(); i++)
        {
        	search(string.charAt(i),result);
        }
        return 0;
    }

	private void search(char charAt, InterimResult result)
	{
		for (Edge e : machine)
		{
			if (e.currentState == State.START)
			{
				if (e.inputVerifier.meetsCriteria(charAt))
				{
					e.action.execute(result, charAt);
				}
			}
		}
		
	}
}
