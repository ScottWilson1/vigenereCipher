package vigenereCipher;
public class EncryptionMethod
{
	public void encryptionTablet(String key, String message) 
	{
		int ROWS = 26;
		int COLS = 26;
		
		// 2d alphabet char array as a tablet to encrypt message
		char[][] tablet = new char[ROWS][COLS];
		
		// passkey String turned into char array
		char[] keyArray = key.toCharArray();
		//System.out.println(passKeyArray);
		
		// message String turned into char array
		char[] messageArray = message.toCharArray();
		
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
				
				tablet[i][j] = gridLetter;;
			}//end for loop
		}//end for loop
		
		
		for(int i = 0; i < messageArray.length; i++)
		{	
			//assign each keyChar char to variable and increment
			char keyChar = keyArray[i];
		
			
			//assign each messageChar char to variable and increment
			char messageChar = messageArray[i];
		
			//cast char to int
			int keyCharPosition = (int)keyChar;
		
			//cast char to int
			int messageCharPosition = (int)messageChar;
			System.out.print(tablet[keyCharPosition-65][messageCharPosition-65]);
		}//end for loop
	}//end encryptionTablet
}//end class