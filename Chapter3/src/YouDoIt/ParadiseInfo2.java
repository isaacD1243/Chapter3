package YouDoIt;

import java.util.Scanner;

public class ParadiseInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price; 
		double discount;
		double savings; 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter cutoff price for discount >> ");
		price =keyboard.nextDouble();
		
		System.out.println("Enter discount rate as Whole number "); 
		discount = keyboard.nextDouble();
		
		displayInfo();
		savings = coumputeDiscountInfo(price, discount);
		System.out.println("Special this week on any service over " + price);
		System.out.println("Dicount of " + discount + " percent");
		System.out.println("That's a savings of at least $" + savings);
		
	}
public static void displayInfo() {
	System.out.println("Paradise Day Spa wants to pamper you. ");
	System.out.println("We will make you look good.");
}
public static do
}