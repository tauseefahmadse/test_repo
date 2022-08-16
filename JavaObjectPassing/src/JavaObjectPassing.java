/*class Cabin{
	void stock(Stationary item){
		System.out.println("The " +item.name+ " is stocked in cabin");
	}
}
class Stationary{
	String name;
	Stationary(String name){
		this.name=name;
	}
	
}*/

public class JavaObjectPassing {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Stationary pencil = new Stationary("Led Pencil");
		Cabin cabin1 = new Cabin();
		cabin1.stock(pencil);*/
		
		Garage garage= new Garage();
		Car car1 = new Car("BMW");
		Car car2 = new Car("Alto");
		
		garage.park(car1);
		garage.park(car2);
	}
}
