package Exercises;

import java.util.Scanner;

public class NumberDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		int y;
		
		Scanner input = new Scanner(System.in);
		System.out.println("What is your value>> ");
		x = input.nextInt();
		
		System.out.println("What is your value>> ");
		y = input.nextInt();
		
		
		displayTwiceTheNumber(x, y);
		displayNumberPlusFive(x, y);
		displayNumberSquared(x, y);
	}
public static void displayTwiceTheNumber(int x, int y) {
	
	int x2;
	int y2;
	
	x2 = x * 2;
	y2 = y * 2;
	System.out.println("x = " + x2 + " y = " + y2);
}
	public static void displayNumberPlusFive(int x, int y) {
		int x3;
		int y3;
		
		x3 = x + 5;
		y3 = y + 5;
		System.out.println("x = " + x3 + " y =" + y3);
				
	}
	public static void displayNumberSquared(int x, int y) {
		int x4;
		int y4; 
		
		x4 = x * x;
		y4 = y * y;
		
		System.out.println("x = " + x4 + " y = " + y4);
		
	}
}
