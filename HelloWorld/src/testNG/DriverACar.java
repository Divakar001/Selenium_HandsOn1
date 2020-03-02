package testNG;

import org.testng.annotations.Test;

public class DriverACar {
	//Priority
	//lets drive a car for 80km/hr
	
	@Test(priority=0)
	public void starttheCar(){
		System.out.println("start the car");
	}
	@Test(priority=1)
	public void putfirstGear(){
		System.out.println("putfirstGear");
	}
	@Test(priority=2)
	public void putthirdGear(){
		System.out.println("putthirdGear");
	}
	@Test(priority=3)
	public void putforthGear(){
		System.out.println("putforthGear");
	}
	@Test(priority=4)
	public void putfifthGear(){
		System.out.println("putfifthGear");
		
		
	}
	
	

	
	
	
	
	
	
	
}
