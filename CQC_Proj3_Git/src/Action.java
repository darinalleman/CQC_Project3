/**
 * Each action has an execute method that will update the interim result.
 * @author Darin Alleman & Darnell Martin
 */
public interface Action
{

	/**
	 * Execute the calculations and return the result.
	 * @param x - the previous result
	 * @param c - the input character
	 * @return the current interim result
	 */
	public InterimResult execute(InterimResult x, char c);
}
