package week1.day1;

import org.checkerframework.checker.units.qual.cd;

public class Bike {

	public void newBike() {
		System.out.println("This is my New Bike");
	}
	public static void main(String[] args) {
		Bike b=new Bike();
		b.newBike();
		Car c=new Car();
		c.applyBreak();
		c.soundHorn();
	}
}
