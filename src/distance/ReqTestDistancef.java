package distance;

import distance.distancef;
import org.junit.Test;

import java.math.BigDecimal;

import org.junit.Assert;

public class ReqTestDistancef {	
	@Test
	public void distanceTest1()
	{
		int x1 = 5;
		int x2 = 1;
		int y1 = 1;
		int y2 = -2;
		BigDecimal solution = new BigDecimal ("5.00");
		
		distancef mydistance = new distancef();
		System.out.println(mydistance.distance(5, 1, 1, -2));
		
		Assert.assertEquals(mydistance.distance(x1, x2, y1, y2), solution);
	}
	
	@Test
	public void distanceTest2()
	{
		int p1 = 2;
		int p2 = -1;
		int q1 = -3;
		int q2 = -2;
		BigDecimal solution = new BigDecimal ("3.16");		
		
		distancef mydistance = new distancef();
		//System.out.println(solution);
		System.out.println(mydistance.distance(2,-1,-3,-2));
		Assert.assertEquals(mydistance.distance(p1, p2, q1, q2), solution);
	}

}
