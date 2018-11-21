//Program to find the highest among the given 3 numbers

package mypackage;
import java.util.Scanner;
public class FindHighest {

	//Declaration of main method
	public static void main(String[] args)
	
	{
		System.out.println("Enter any 3 integer numbers");
		Scanner sc=new Scanner(System.in);
		
		//Declaration of variables for 3 entered numbers by user
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		int thirdNumber=sc.nextInt();
		
		//Insert a new line in the output screen
		System.out.println();
		
		if((firstNumber==secondNumber) && (secondNumber==thirdNumber) &&
				(thirdNumber==firstNumber))
		{
			System.out.println("	All are the equal numbers	");
			System.exit(0);
		}
		
		//Verifying the highest number and displaying it.		
		if(firstNumber>=secondNumber && firstNumber>=thirdNumber)
		{
			
			System.out.println("	The highest number is: "+ firstNumber);
		}
		else if (secondNumber>=firstNumber && secondNumber>=thirdNumber)
		{
			System.out.println("	The highest number is: "+ secondNumber);
		}
		else if(thirdNumber>=firstNumber && thirdNumber>=secondNumber)
			
		{
			System.out.println("	The highest number is: "+ thirdNumber);
		}
		
		
	}

}//End of the program
