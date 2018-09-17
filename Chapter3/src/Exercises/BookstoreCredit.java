package Exercises;

import java.util.Scanner;

public class BookstoreCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		double Gpa;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name? >>");
		name = input.next();
		
		System.out.println("What is your GPA? >>");
		Gpa = input.nextDouble();
		
		computeCredit(Gpa, name);
		
		
		
		
	}
public static void computeCredit(double Gpa, String name) {
	
	double money = 10.00;
	double totalMoneyGiven;
	
	totalMoneyGiven = money * Gpa;
	
	System.out.println("Nice job" + name + " you earned $" + totalMoneyGiven);
	
	
}
}
