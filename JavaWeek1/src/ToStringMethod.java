// reference class Car.java
public class ToStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		//System.out.println(car); return memory address for that object
		//System.out.println(car.toString()); //explicitly using toString override method
		System.out.println(car); //implicitly using toString override method
	}

}
