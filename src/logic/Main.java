package logic;

import java.util.Scanner;

/*
 * Author: Luca Santopadre
 */
public class Main {

	private static String insertFirst = "Insert first number";
	private static String insertSecond = "Insert second number";
	
	
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		Operations ops = new Operations();
		int retry;
		
		double a;
		double b;
		Double result;
		result = null;
		
		System.out.println("Operations menu: ");
		System.out.println("1) sum two numbers");
		System.out.println("2) substract two numbers");
		System.out.println("3) multiplicate two numbers");
		System.out.println("4) Make division of two numbers");
		System.out.println("5) Make natural logarithm of a number");
		System.out.println("6) Make square of a number");
		
		int choiche = in.nextInt();
		
		switch (choiche) {
			case 1: // sum
				System.out.println(insertFirst);
				a = in.nextDouble();
				System.out.println(insertSecond);
				b = in.nextDouble();
				result = ops.sum(a, b);
				break;
				
			case 2: // sub
				System.out.println(insertFirst);
				a = in.nextDouble();
				System.out.println(insertSecond);
				b = in.nextDouble();
				result = ops.sub(a, b);
				break;
				
			case 3: //multiplicate
				System.out.println(insertFirst);
				a = in.nextDouble();
				System.out.println(insertSecond);
				b = in.nextDouble();
				result = ops.multiplicate(a, b);
				break;
				
			case 4: //division
				System.out.println(insertFirst);
				a = in.nextDouble();
				System.out.println(insertSecond);
				retry = 0;
				while((b = in.nextDouble()) == 0 && retry < 3) {
					System.out.println("You cannot make by zero division, re-enter");
					retry++;
				}
				if(retry == 3) {
					break;
				}
				result = ops.divide(a, b);
				break;
				
			case 5: // natural log
				System.out.println("Insert number");
				retry = 0;
				while((a = in.nextDouble()) < 0 && retry < 3) {
					System.out.println("You cannot make natural logarithm of negative number, re-enter");
					retry++;
				}
				if(retry == 3) {
					break;
				}
				result = ops.naturalLogarithm(a);
				break;
				
			case 6: // square
				System.out.println("Insert number");
				retry = 0;
				while((a = in.nextDouble()) < 0 && retry < 3) {
					System.out.println("You cannot make sqrt of negative number number, re-enter");
					retry++;
				}
				if(retry == 3) {
					break;
				}
				result = ops.square(a);
				break;
	
			default:
				System.out.println("Not a valid choiche.");
				break;
			}
		
		if(result != null) {
			System.out.println("Result: " + result);
		} 
		System.out.println("END");
	}
}
