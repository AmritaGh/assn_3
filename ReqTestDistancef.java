package RequirementTest;

import distanceFormula.distancef;
import org.junit.Test;
import org.junit.Assert;

public class ReqTestDistancef {
	@Test
	public void distanceTest1()
	{
		int x1 = 5;
		int x2 = 1;
		int y1 = 1;
		int y2 = -2;
		double solution = 5.0;
		
		distancef mydistance = new distancef();
		//System.out.println(+ solution);
		
		Assert.assertEquals(mydistance.distance(x1, x2, y1, y2), solution);
	}
	
	@Test
	public void distanceTest2()
	{
		int x1 = 2;
		int x2 = -1;
		int y1 = -3;
		int y2 = -2;
		double solution = 3.16;
		
		distancef mydistance = new distancef();
		//System.out.println(solution);
		//System.out.println(mydistance.distance(2,-1,-3,-2));
		Assert.assertEquals(mydistance.distance(x1, x2, y1, y2), solution);
	}

}
