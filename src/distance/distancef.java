package distance;
import java.lang.Math;
import java.math.BigDecimal;

public class distancef {
	public BigDecimal distance(int a1, int a2, int b1, int b2){
		double dist = Math.sqrt((a2 - a1)*(a2 - a1) + (b2 - b1)*(b2 - b1));
		BigDecimal dist1 = new BigDecimal(dist);
		BigDecimal newdist = dist1.setScale(2, BigDecimal.ROUND_HALF_EVEN);		
		return newdist;
	}	
}
