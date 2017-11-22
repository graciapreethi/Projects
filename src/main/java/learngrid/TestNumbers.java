package learngrid;

import java.math.BigDecimal;

public class TestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String num1 =  "30.00000000";
		String num2 =  "30.0";
		
		
		BigDecimal first, second ;		
	        first = new BigDecimal(num1);
	        second = new BigDecimal(num2);
	       
	        if (first.compareTo(second) == 0){
	        	System.out.println("yes");
	        }
	        	else
	        	{
	        		System.out.println("No");
	        	}
	        
	}

}
