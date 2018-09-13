package Exercises;

import java.util.Scanner;

public class Percentages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x;
		double y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your value>> ");
		x = input.nextDouble();
		
		System.out.println("What is your value>> ");
		y = input.nextDouble();
		
		computePercent(x, y);
	}
	public static void computePercent(double x, double y) {
		double compute;
		
		compute = (x / y) * 100;
		System.out.println(x + " divided by y " + y + " = " + compute + "%");
	}
}
