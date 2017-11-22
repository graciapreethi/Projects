package week1.day1;

import java.util.Scanner;

public class palindromeString {
public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a string : ");
		
		String Str = reader.nextLine();		
				
		if (validateStringInput(Str))
		{
			System.out.println( Str + " original string is palindrome. ");
			
		}
		else
		{
			
			System.out.println( Str + " original string is not palindrome. ");
			
		}	
		reader.close();
	}

public static boolean validateStringInput(String str)
{
	
	char[] revString = str.toCharArray();
	
	String reverseString = "";
	 
    for (int i = revString.length-1; i>=0; i--)
    {
    	reverseString = reverseString +  revString[i];
    }
	
      if (reverseString == str)
      {
    	  return true;    	  
      }       
      else
    	  return false;	
	
}
}
