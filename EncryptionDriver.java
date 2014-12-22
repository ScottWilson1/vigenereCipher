package vigenereCipher;
import java.util.Scanner;

public class EncryptionDriver
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Give me your passkey");
		String userPassKey = input.next();
		System.out.println("Give me your message");
		String userMessage = input.next();
		
		EncryptionMethod myEncrypt = new EncryptionMethod();
		myEncrypt.encryptionTablet(userPassKey, userMessage);
	}
}