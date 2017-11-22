package week1.day1;

import java.util.Scanner;

public class multiplicationTables {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int intNum = reader.nextInt();	
		
		System.out.println(intNum);
		
		for(int i =1; i <= 20; i++)
		{
			
			System.out.println(intNum + " * " + i + " = " + i * intNum   );
		}
		reader.close();
	}
}
