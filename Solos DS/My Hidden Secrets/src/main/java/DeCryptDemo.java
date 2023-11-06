//your Crypto class should work with this program to decrypt the files (or not).
public class DeCryptDemo
{
	public static void main(String [] args)
	{
		Crypto C1 = new Crypto("meangirls");
		Crypto C2 = new Crypto("sugarplum");

		String F1 = new String("script.txt.cyp");
		String F2 = new String("script2.txt.cyp");
		String F3 = new String("script.txt");

		tryDecrypt(F2, C1);
		tryDecrypt(F1, C2);
		tryDecrypt(F3, C1);
		tryDecrypt(F1, C1);
		tryDecrypt(F2, C2);
	}

	public static void tryDecrypt(String file, Crypto decrypter)
	{
		if (decrypter.decryptFile(file))
		{
			System.out.println("File " + file + " decrypted successfully");
			System.out.println("Decryption agent\n" + decrypter);
		}
		else
		{
			System.out.println("File " + file + " could not be decrypted");
			System.out.println("Decryption agent\n" + decrypter);
		}
		System.out.println();
	}
}

