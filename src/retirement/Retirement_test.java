package retirement;

import retirement.Retirement;
import org.junit.Test;
import org.junit.Assert;

public class Retirement_test {

	@Test
	public void age_goal_reached_test_1() {
		int age = 20;
		int salary = 50000;
		double percentage_saved = 5.0;
		int desired_goal = 100000;
		int correct_age = 40;
			
		Assert.assertEquals(Retirement.age_goal_reached(age, salary, percentage_saved, desired_goal), correct_age);
	}
	
	@Test
	public void age_goal_reached_test_2() {
		int age = 20;
		int salary = 50000;
		double percentage_saved = 5.0;
		int desired_goal = 1000000;
			
		Assert.assertEquals(Retirement.age_goal_reached(age, salary, percentage_saved, desired_goal), 0);
	}

}
