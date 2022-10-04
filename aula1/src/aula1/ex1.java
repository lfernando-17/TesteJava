package aula1;

import java.util.Scanner;

public class ex1 {
	
	public static void main(String[]args ) {
	
	Scanner input = new Scanner(System.in);
	
	int number1;
	
	int number2;
	
	int sum, sub, div, mul;
	
	System.out.print("Enter first integer:");
	number1=input.nextInt();
	
	System.out.print("Enter second integer:");
	number2=input.nextInt();
	
	input.close();
	
	sum = number1 + number2;
	mul = number1 * number2;
	sub = number1 - number2;
	div = number1 / number2;
	
	System.out.printf("Sum is %d%n",sum);
	System.out.printf("Product is %d%n",mul);
	System.out.printf("diference is %d%n",sub);
	System.out.printf("division is %d%n",div);
	
	}

}
