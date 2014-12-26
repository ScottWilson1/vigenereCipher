package vigenereCipher;
import java.util.Scanner;

public class EncryptionDriver
{
	public static void main(String args[])
	{
		EncryptionMethod myEncrypt = new EncryptionMethod();
		Scanner input = new Scanner(System.in);
		//Scanner inputTwo = new Scanner(System.in);
		String answer = "0";
		
		while(!answer.equals("1") && !answer.equals("2"))//to control invalid entries
		{
			System.out.println("If you would like to ENCRYPT a message press (1) then enter.");
			System.out.println("If you would like to DECRYPT a message press (2) then enter");
			answer = input.nextLine();
			if(answer.equals("1"))
			{
				System.out.println("Enter a unique passkey.");
				String userPassKey = input.nextLine();
				System.out.println("Enter a message to be encrypted.");
				String userMessage = input.nextLine();
				System.out.println("Your message after encryption is: ");
			
				myEncrypt.encrypt(userPassKey, userMessage);//method encrypts the users message
			}
			else if(answer.equals("2"))
			{
				System.out.println("Enter the correct passkey.");
				String decryptionPassKey = input.nextLine();
				System.out.println("Enter the encrypted message.");
				String encryptedMessage = input.nextLine();
				System.out.println("You1r message after decryption is: ");
			
				myEncrypt.decrypt(decryptionPassKey, encryptedMessage);//decrypts the encrypted message
			}
			else
			{
				System.out.println("You must enter either (1) or (2) please try again.");//if invalid entry is entered
			}
		}	
	}		
}