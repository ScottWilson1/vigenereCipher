package vigenereCipher;
import java.util.Scanner;

public class EncryptionDriver
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give me your passkey");
		String userPassKey = input.next().toUpperCase();
		System.out.println("Give me your message");
		String userMessage = input.next().toUpperCase();
		
		EncryptionMethod myEncrypt = new EncryptionMethod();
		myEncrypt.encryptionTablet(userPassKey, userMessage);
	}
}