//demo of hashCode() in Java.
public class HashDemo
{
	public static void main(String [] args)
	{
		String S1 = new String("Silly rabbit trix are for kids");
		String S2 = new String("Silly rabbit trix are for kids");
		String S3 = new String("Silly wabbit trix are for kids");
		String S4 = new String("Silly rabbit trix are for kidz");
		
		int h1 = S1.hashCode();
		int h2 = S2.hashCode();
		int h3 = S3.hashCode();
		int h4 = S4.hashCode();
		
		testCodes(S1, h1, S2, h2);
		testCodes(S1, h1, S3, h3);
		testCodes(S1, h1, S4, h4);
		testCodes(S3, h3, S4, h4);
	}
	
	public static void testCodes(String firstS, int firstH, String secS, int secH)
	{
		if (firstH == secH)
		{
			System.out.println(firstH + " == " + secH + " so ... ");
			System.out.println(firstS + " == " + secS);
		}
		else
		{
			System.out.println(firstH + " != " + secH + " so ... ");
			System.out.println(firstS + " != " + secS);
		}
		System.out.println();
	}			
}
