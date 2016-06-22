package bmi;

import java.util.Scanner;

public class BmiCalc {
	
	public static int what_bmi() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your height in feet and inches (form: F I)?");
		double feet = scan.nextDouble();
		double inches = scan.nextDouble();
		
		System.out.println("What is your weight in pounds?");
		double weight = scan.nextDouble();
		
		String bmi = bodyMassIndex(feet, inches, weight);
		
		System.out.println("You are: " + bmi);
		

		scan.close();
		return 0;
	}
	
	public static String bodyMassIndex(double feet, double inches, double pounds){
		
		double totalInches = inches + 12 * feet;
		
		double meters = totalInches * 0.025;
		double kilos = pounds * 0.45;
		double bodyMass = 0;
		
		if(meters > 0){
			bodyMass = kilos / meters / meters;
		}
		else{
			return "Person too short";
		}
		
		if(bodyMass < 18.5){
			return "Underweight";
		}
		else if(bodyMass < 24.9){
			return "Normal Weight";
		}
		else if(bodyMass < 29.9){
			return "Overweight";
		}
		else{
			return "Obesity";
		}
	}

}
