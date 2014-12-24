package vigenereCipher;
import java.util.Scanner;

public class EncryptionDriver
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a decryption passkey.");
		String userPassKey = input.nextLine();
		System.out.println("You entered: " + "\"" + userPassKey + "\"");
		System.out.println();
		System.out.println("Enter a message to be encrypted.");
		String userMessage = input.nextLine();
		System.out.println("You entered: " + "\"" + userMessage + "\"");
		System.out.println("All spaces and special characters will now be removed.");
		System.out.println("Only the letters will be encrypted and read back to you.");
		System.out.println();
		System.out.println("Your message after encryption is: ");
		
		EncryptionMethod myEncrypt = new EncryptionMethod();
		myEncrypt.encryptionTablet(userPassKey, userMessage);
	}
}