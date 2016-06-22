package main;

import java.util.Scanner;
import retirement.Retirement;
import distance.distancef;
import bmi.BmiCalc;

public class Main {
	public static void main (String args[]) {
		System.out.println ("Select an option:\n1) BMI Calculator\n2) Retirement Age Calculator\n3) Distance Formula");
		Scanner scan = new Scanner(System.in);
		int selection = scan.nextInt();
		
		switch (selection) {
	        case 1:
	        	System.out.println ("Selected BMI");
	        	break;
	        case 2:
	        	System.out.println ("Selected BMI");
	        	break;
	        case 3:
	        	System.out.println ("Selected BMI");
	        	break;
	        default:
	        	System.out.println ("You selected incorrectly.");
	        	break;
		}
		
		scan.close();
	}
}
