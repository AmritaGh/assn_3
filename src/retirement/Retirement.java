package retirement;

import java.util.Scanner;

public class Retirement {
	public static void what_age() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your current age?");
		int age = scan.nextInt();
		
		System.out.println("What is your current salary?");
		int salary = scan.nextInt();
		
		System.out.println("What is your percentage saved?");
		int percentage_saved = scan.nextInt();
		
		System.out.println("What is your desired savings goal?");
		int desired_goal = scan.nextInt();
		
		int age_goal_reached = age_goal_reached(age, salary, (double) percentage_saved, desired_goal);
		if (age_goal_reached != 0){
			System.out.println("You will be " + age_goal_reached +" when you reach your savings goal.");
		}
		else {
			System.out.println("You will not reach your savings goal.");
		}

		scan.close();
	}
	
	public static int age_goal_reached(int age, int salary, double percentage_saved, int desired_goal) {	
		double age_added = desired_goal/(salary*((percentage_saved/100)*2));
		double goal_age = ((double)age) + age_added;	
		
		if (goal_age < 100) {
			return (int)goal_age;
		}
		else {
			return 0;
		}
	}
}
