package bmi;

import org.junit.Assert;
import org.junit.Test;

import bmi.BmiCalc;

public class BmiTester {

	@Test
	public void underweightTest1()
	{
		float feet = 5;
		float inches = 10;
		float weight = 100;
		String result = "Underweight";
		
		BmiCalc myCalc = new BmiCalc();
		
		Assert.assertEquals(myCalc.bodyMassIndex(feet, inches, weight), result);
	}
	
	@Test
	public void overweightTest1()
	{
		float feet = 5;
		float inches = 10;
		float weight = 200;
		String result = "Overweight";
		
		BmiCalc myCalc = new BmiCalc();
		
		Assert.assertEquals(myCalc.bodyMassIndex(feet, inches, weight), result);
	}
	
	@Test
	public void obeseTest1()
	{
		float feet = 5;
		float inches = 10;
		float weight = 300;
		String result = "Obesity";
		
		BmiCalc myCalc = new BmiCalc();
		
		Assert.assertEquals(myCalc.bodyMassIndex(feet, inches, weight), result);
	}
	
	@Test
	public void normalWeightTest1()
	{
		float feet = 5;
		float inches = 10;
		float weight = 150;
		String result = "Normal Weight";
		
		BmiCalc myCalc = new BmiCalc();
		
		Assert.assertEquals(myCalc.bodyMassIndex(feet, inches, weight), result);
	}
	
	@Test
	public void tooShortTest1()
	{
		float feet = -5;
		float inches = -10;
		float weight = 150;
		String result = "Person too short";
		
		BmiCalc myCalc = new BmiCalc();
		
		Assert.assertEquals(myCalc.bodyMassIndex(feet, inches, weight), result);
	}
}
