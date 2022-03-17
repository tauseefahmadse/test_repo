import java.util.LinkedList;
public class JavaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> cars = new LinkedList<String>();
		cars.add("Toyota");
		cars.add("BMW");
		cars.add("Suzuki");
		cars.add("Honda");
		
		System.out.println(cars);
		
		for(String i: cars) {
		System.out.println(i);
		}
	}

}
