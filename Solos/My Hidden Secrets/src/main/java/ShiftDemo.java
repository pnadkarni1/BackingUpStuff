//note we cast the shifted result back to char since the result of the
//addition in Java is an int.  also that this is only demonstrating the
//"forward" shift used for encryption.
public class ShiftDemo
{
	public static void main(String [] args)
	{
		char start = 'A', curr;
		StringBuilder answer = new StringBuilder();
		answer.append(start);
		for (int shift = 1; shift <= 255; shift++)
		{
			curr = (char) ((start + shift) % 256);
			answer.append(curr);
		}
		System.out.println("Result:\n" + answer);
	}
}
