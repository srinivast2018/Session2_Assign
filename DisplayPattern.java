/*Program to display the below  expected pattern below

 *    *
  *  *
    *
  *   *
 *      *     
 
   */

package mypackage;

public class DisplayPattern 
{
	//Declaration of main method
 public static void main(String[] args) 
  {
 	//Declare the variable for total number of rows.
	int rows=5;
	System.out.println("The expected pattern to display:");
	System.out.println();
	
	//Loop to traverse to the total no of times to display the * and space character.
	for(int i=0;i<rows;i++)
		{
			for(int j=0;j<rows;j++)
				{
				if ((i==j) || j == rows-i-1)	
					//Displaying the * symbol
					System.out.print("*");
				else {
					//Printing the space character	
				  System.out.print(" ");
				}
			  }
			//To insert a new line
		   System.out.println();
		}
	}

}//End of the program
