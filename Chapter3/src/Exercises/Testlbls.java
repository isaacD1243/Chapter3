package Exercises;

import java.util.Scanner;

public class Testlbls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		
		double pounds;
		
		System.out.println("How many pounds are there >>");
		pounds = input.nextDouble();
		
		
		displayConvertionKilo(pounds);
		displayConvertionOunces(pounds);
		displayConvertionMilligrams(pounds);
		
		
	}
public static void displayConvertionKilo(double pounds) {
	
	double Kilograms;
	
	Kilograms = pounds * .4535;
	

	displayAnswers(Kilograms);
}
public static void displayConvertionOunces(double pounds) {
	
	double Ounces;
	
	Ounces = pounds * 16;
	displayAnswers(Ounces);
}
public static void displayConvertionMilligrams(double pounds) {
	
	double Milligrams;
	
	Milligrams = pounds * 453592;
	
	displayAnswers(Milligrams);
	
}
public static void displayAnswers(double Answers) {
	
	System.out.println("Your answer" + Answers);
	
	
	
	
	
}
 }
