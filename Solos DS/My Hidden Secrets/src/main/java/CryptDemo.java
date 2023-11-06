//your Crypto class should work with this program to encrypt the files.
public class CryptDemo
{
	public static void main(String [] args)
	{
		Crypto C1 = new Crypto("meangirls");
		Crypto C2 = new Crypto("sugarplum");

		String F1 = new String("script.txt");
		String F2 = new String("script2.txt");
		String F3 = new String("script.cyp");
		String F4 = new String("script-dne.txt");
	
		tryEncrypt(F1, C1);
		tryEncrypt(F2, C2); 
		tryEncrypt(F3, C1);
		tryEncrypt(F4, C1);
	}
	
	public static void tryEncrypt(String file, Crypto encrypter)
	{
		if (encrypter.encryptFile(file))
		{
			System.out.println("File " + file + " encrypted successfully");
			System.out.println("Encryption object info:\n" + encrypter);
		}
		else
		{
			System.out.println("File " + file + " NOT encrypted");
			System.out.println("Encryption object info:\n" + encrypter);
		}
		System.out.println();
	}
}
