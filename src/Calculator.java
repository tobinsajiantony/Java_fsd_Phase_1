import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args)
  {
	  Scanner scan = new Scanner(System.in);
	  try {
	  while(true) {
		  System.out.println("Please Select The Operation");
		  System.out.println("1.Addition");
		  System.out.println("2.Subtraction");
		  System.out.println("3.Multiplication");
		  System.out.println("4.Division");
		  System.out.println("5.Exit");
		  System.out.println();
		  int operation = scan.nextInt();
		  if(operation == 5) {
			  System.out.println("Thank You for using Calculator :)");
			  break;
		  }
		  else if(operation > 0 && operation < 5) {
			  System.out.println("Enter First Number");
			  float firstNumber = scan.nextFloat();
			  System.out.println("Enter Second Number");
			  float secondNumber = scan.nextFloat();
			  if(operation == 1) {
				  double result = (float)firstNumber + (float)secondNumber;
				  System.out.println("The Sum is: " + result);
			  }
			  else if(operation == 2) {
				  double result = (float)firstNumber - (float)secondNumber;
				  System.out.println("The Difference is: " + result);
			  }
			  else if(operation == 3) {
				  double result = (float)firstNumber * (float)secondNumber;
				  System.out.println("The Product is: " + result);
			  }
			  else if(operation == 4) {
				  double result = (float)firstNumber / (float)secondNumber;
				  System.out.println("The Quotient is: " + result);
			  }
			  
		  }
		  else {
			  System.out.println("Invalid Input! Try Again");
			  continue;
		  }
	  }
	 } 
	  catch(InputMismatchException ex) {
			 System.out.println("An Exception Has Occured! Please Enter Valid Input!");
		 }
	  
	  catch(Exception ex) {
		 System.out.println("An exception has occured. Please try again!");
	 }
  }
}
