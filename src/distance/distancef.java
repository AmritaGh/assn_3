package distanceFormula;
import java.lang.Math;
import java.math.BigDecimal;
import java.util.Scanner;

public class distancef {
	private Scanner s;
	public BigDecimal distance(int a1, int a2, int b1, int b2){
		double dist = Math.sqrt((a2 - a1)*(a2 - a1) + (b2 - b1)*(b2 - b1));
		BigDecimal dist1 = new BigDecimal(dist);
		BigDecimal newdist = dist1.setScale(2, BigDecimal.ROUND_HALF_EVEN);		
		return newdist;
	}	
	public void userInput()
	{
		int x1 ;//= 5;
		int x2 ;//= 1;
		int y1 ;// = 1;
		int y2 ;//= -2;		
		s = new Scanner(System.in);
		
		System.out.println("Enter x1:");
		x1 = s.nextInt();
		System.out.println("You entered " +x1);
		
		System.out.println("Enter x2:");
		x2 = s.nextInt();
		System.out.println("You entered " +x2);
		
		System.out.println("Enter y1:");
		y1 = s.nextInt();
		System.out.println("You entered " +y1);
		
		System.out.println("Enter y2:");
		y2 = s.nextInt();
		System.out.println("You entered " +y2);
		
		BigDecimal calling = distance(x1,x2,y1,y2);		
		System.out.println(calling);
		s.close();
	} 
	
}
