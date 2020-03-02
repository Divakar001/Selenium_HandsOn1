package testNG;

import org.testng.annotations.Test;

public class SkipATestcases {

	
	@Test(priority=0)
	public void starttheCar(){
		System.out.println("start the car");
	}
	
	@Test(enabled=false)
	public void turnthemusic(){
		System.out.println("turned music ON");
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
