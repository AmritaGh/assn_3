package bmi;

public class BmiCalc {
	
	public String bodyMassIndex(double feet, double inches, double pounds){
		
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
