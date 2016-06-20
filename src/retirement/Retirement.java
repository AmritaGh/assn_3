package retirement;

public class Retirement {
	public int what_age() {
		
		
		return 0;
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
