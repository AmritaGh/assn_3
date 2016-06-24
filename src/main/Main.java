package main;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		System.out.println ("Select an option:\n1) BMI Calculator\n2) Retirement Age Calculator\n3) Distance Formula\n4) Exit");
		Scanner scan = new Scanner(System.in);
		int selection = scan.nextInt();
		
		switch (selection) {
	        case 1:
	        	bmi.BmiCalc.what_bmi();
	        	break;
	        case 2:
	        	retirement.Retirement.what_age();
	        	break;
	        case 3:
	        	distance.Distancef.userInput();
	        	break;
	        case 4:
	        	System.out.println ("Exiting...");
	        	break;
	        default:
	        	System.out.println ("You selected incorrectly.\n");
	        	break;
		}
		scan.close();
	}

}
