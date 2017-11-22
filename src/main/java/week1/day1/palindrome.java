package week1.day1;

import java.util.Scanner;



public class palindrome {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int Num = reader.nextInt();		
				
		if (validateNumberInput(Num))
		{
			System.out.println("original number is palindrome. ");
			
		}
		else
		{
			System.out.println( "original number is not palindrome. ");
			
		}	
		reader.close();
	}
	

	
	public static boolean validateNumberInput(int Num)
	{
		
		int rev = 0, summdigit = 0;
		while(Num != 0)
		{
		 int quo = Num / 10;
		 int rem = Num % 10;
		 Num = quo;		
		 rev = rev * 10 + rem;
		 summdigit = summdigit+rem;
		}

		System.out.println("Reverse number: " + rev);
		System.out.println("Sum of digits: " + summdigit );
		if (Num == rev)
		{
			
			return true;
		}
		else
		{
			
			return false;	
		}
		
		
	}

}
