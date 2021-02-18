package logic;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
	

	public static void main(String[] args) {		
		Scanner in = new Scanner(System.in);
		Operations ops = new Operations();
		int retry;
		
		System.out.println("Operations menu: ");
		System.out.println("1) sum two numbers");
		System.out.println("2) substract two numbers");
		System.out.println("3) multiplicate two numbers");
		System.out.println("4) Make division of two numbers");
		System.out.println("5) Make natural logarithm of a number");
		System.out.println("6) Make square of a number");
		
		int choiche = in.nextInt();
		double a,b;

		
		switch (choiche) {
			case 1: // sum
				System.out.println("Insert first number");
				a = in.nextDouble();
				System.out.println("Insert second number");
				b = in.nextDouble();
				
				System.out.println(ops.sum(a, b));
				break;
			case 2: // sub
				System.out.println("Insert first number");
				a = in.nextDouble();
				System.out.println("Insert second number");
				b = in.nextDouble();
				
				System.out.println(ops.sub(a, b));
				break;
			case 3: //multiplicate
				System.out.println("Insert first number");
				a = in.nextDouble();
				System.out.println("Insert second number");
				b = in.nextDouble();
				
				System.out.println(ops.multiplicate(a, b));
				break;
			case 4: //division
				System.out.println("Insert first number");
				a = in.nextDouble();
				System.out.println("Insert second number");
				retry = 0;
				while((b = in.nextDouble()) == 0 && retry < 3) {
					System.out.println("You cannot make by zero division, re-enter");
					retry++;
				}
				if(retry == 3) {
					break;
				}
				System.out.println(ops.divide(a, b));
				
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
				System.out.println(ops.naturalLogarithm(a));
				
				break;
			case 6: // square
				System.out.println("Insert number");
				a = in.nextDouble();
				
				retry = 0;
				while((a = in.nextDouble()) < 0 && retry < 3) {
					System.out.println("You cannot make sqrt of negative number number, re-enter");
					retry++;
				}
				if(retry == 3) {
					break;
				}
				
				System.out.println(ops.square(a));
				
				break;
	
			default:
				break;
			}
		
		
	}
	
	


}
