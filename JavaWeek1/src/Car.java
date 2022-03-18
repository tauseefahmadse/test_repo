// Car Class for JavaObjects.java
//overriding toString method for ToStringMethod.java
public class Car {
	String maker= "Honda";
	String model= "City";
	String Color ="White";
	int price = 500000;
	
	void drive() {
		System.out.println("drive");
	}
	void brake() {
		System.out.println("brake");
	}
	
	public String toString() 
	{
		return maker +"\n"+ model+"\n"+ Color+"\n"+ price;
	}
	
}