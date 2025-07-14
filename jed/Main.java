package EvaITCS;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Double a = (double) 0;
		Double b = (double) 0;
	
		boolean exit = true;
		while (exit) {
			int operation = -1;
			while (operation > 4 || operation < 1) {
				System.out.println("Calculator");
				System.out.println("1. Addition");
				System.out.println("2. Subtraction");
				System.out.println("3. Multiplication");
				System.out.println("4. Division");
				System.out.println("Enter: ");
				operation = scan.nextInt();
				if (operation > 4 || operation < 1) {
					System.out.println("Enter a valid operation.");
				}
			}
			System.out.println("Enter integer: ");
			a = scan.nextDouble();
			System.out.println("Enter integer: ");
			b = scan.nextDouble();
			
			switch (operation) {
				case 1:
					System.out.println(a + " + " + b + " = " + add(a, b));
					break;
				case 2:
					System.out.println(a + " - " + b + " = " + subtract(a, b));
					break;
				case 3:
					System.out.println(a + " * " + b + " = " + multiply(a, b));
					break;
				case 4:
					System.out.println(a + " / " + b + " = " + divide(a, b));
					break;
				default:
					break;
			}
			
			System.out.println("Enter 0 to exit: ");
			if (scan.nextInt() == 0) {
				exit = false;
			}
		}
		scan.close();
	}

	private static Double add(Double a, Double b) {
		return a + b;
	}
	
	private static Double subtract(Double a, Double b) {
		return a - b;
	}
	
	private static Double multiply(Double a, Double b) {
		if ( b != 0)
			return a * b;
		else return (double) 0;
	}
	
	private static Double divide(Double a, Double b) {
		return a / b;
	}
}