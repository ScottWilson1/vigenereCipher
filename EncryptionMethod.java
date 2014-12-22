package vigenereCipher;
public class EncryptionMethod
{
	public void encryptionTablet(String key, String message) 
	{
		// 2d alphabet char array as a tablet to encrypt message
		char[][] tablet = new char[26][26];
		// passkey String turned into char array
		char[] keyChar = key.toCharArray();
		// message String turning into char array
		char[] messageChar = message.toCharArray();
		
		// for loops to generate the tablet
		for(int i = 0; i < 26; i++)
		{
			for(int j = 0; j < 26; j++)
			{
				// creates an int that will be cast into a char
				int letter = i + j;
				
				// stops int from going above 26
				if (letter >= 26)
				{
					letter = letter - 26;
				}
				// Upper case alphabet in char list starts at 65 mindprod.com/jgloss/ascii.html#ASCIITABLE
				letter = letter + 65;
				
				// cast int to char
				char gridLetter = (char)letter;
				
				tablet[i][j] = gridLetter;
				System.out.print(tablet[i][j]);
			}
			System.out.println();
		}
	}
}